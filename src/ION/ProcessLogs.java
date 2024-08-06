package ION;


import java.util.*;

public class ProcessLogs {
    public static List<String> processLogs(String[] logs, int threshold) {
        // Map to store the number of transactions for each user
        Map<String, Integer> userTransactionCount = new HashMap<>();

        // Process each log entry
        for (String log : logs) {
            String[] parts = log.split(" ");
            String sender = parts[0];
            String recipient = parts[1];

            // Update the transaction count for the sender
            userTransactionCount.put(sender, userTransactionCount.getOrDefault(sender, 0) + 1);

            // Update the transaction count for the recipient only if they are different from the sender
            if (!sender.equals(recipient)) {
                userTransactionCount.put(recipient, userTransactionCount.getOrDefault(recipient, 0) + 1);
            }
        }

        // List to store the user IDs that meet the threshold
        List<String> result = new ArrayList<>();

        // Filter users who meet or exceed the threshold
        for (Map.Entry<String, Integer> entry : userTransactionCount.entrySet()) {
            if (entry.getValue() >= threshold) {
                result.add(entry.getKey());
            }
        }

        // Sort the result list in ascending order
        Collections.sort(result, (a, b) -> Integer.compare(Integer.parseInt(a), Integer.parseInt(b)));

        return result;
    }

    public static void main(String[] args) {
        String[] logs = {"1 2 50", "1 7 70", "1 3 20", "2 2 17"};
        int threshold = 2;

        List<String> suspiciousUsers = processLogs(logs, threshold);
        System.out.println(suspiciousUsers); // Output: [88, 99]
    }
}