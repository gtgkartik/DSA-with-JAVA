package practise.Problems;

public class ContainerWithMostWater {



    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int maxwater_capacity = -1 ;

        for(int i = 0 ; i < arr.length ; i ++){
            for(int j = i ; j < arr.length ; j++){
                int container_height = Math.min(arr[i], arr[j]);
                int container_width = Math.abs(i-j) ;

                int water_capacity = container_height*container_width ;
                if(water_capacity > maxwater_capacity){
                    maxwater_capacity = water_capacity ;
                }
            }
        }

        System.out.println(maxwater_capacity);
    }
}
