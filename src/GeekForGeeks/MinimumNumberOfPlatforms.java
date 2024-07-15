package GeekForGeeks;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumNumberOfPlatforms {


    public static void main(String[] args) {
//        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
//        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };

        int arr[] = { 100,200,300 };
        int dep[] = { 400,300,400 };

        Queue<Integer> q = new LinkedList<>();
        int platforms = 1 ;

        for(int i = 0 ; i < arr.length ; i ++){
            if(q.isEmpty()){
                q.offer(dep[i]);
            }else{
                if(arr[i]<=q.peek()){
                    platforms++;
                    q.poll();
                }else{
                    q.poll();
                    q.offer(dep[i]);
                }
            }
        }
        System.out.println(platforms);

    }
}
