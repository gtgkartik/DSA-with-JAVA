package ION;

public class GetMinimumTime {
    public static int getMinimumTime(int[] requestedServers, int[] transitionTime) {
        int m = transitionTime.length; // Number of servers
        int n = requestedServers.length; // Number of requested servers
        int totalTime = 0;

        // Start from server 1 (index 0 in 0-based index)
        int currentServer = 1;

        for (int i = 0; i < n; i++) {
            int targetServer = requestedServers[i];

            if (targetServer == currentServer) {
                continue; // No time required if already at the target server
            }

            // Calculate the clockwise distance
            int clockwiseDistance = 0;
            int serverIndex = currentServer;
            while (serverIndex != targetServer) {
                clockwiseDistance += transitionTime[serverIndex - 1];
                serverIndex = (serverIndex % m) + 1;
            }

            // Calculate the counter-clockwise distance
            int counterClockwiseDistance = 0;
            serverIndex = currentServer;
            while (serverIndex != targetServer) {
                counterClockwiseDistance += transitionTime[(serverIndex - 2 + m) % m];
                serverIndex = (serverIndex - 2 + m) % m + 1;
            }

            // Choose the minimum time between the two directions
            totalTime += Math.min(clockwiseDistance, counterClockwiseDistance);

            // Move to the target server
            currentServer = targetServer;
        }

        return totalTime;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        int[] transitionTime = {3,2,1};
        int[] requestedServers = {2,3,3,1};

        int result = getMinimumTime(requestedServers, transitionTime);
        System.out.println("Minimum Time: " + result); // Output: 4
    }
}
