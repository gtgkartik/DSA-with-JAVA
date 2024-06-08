package practise;

public class SetMatrixZero {

    static void markrow(int [][] arr, int row){
        for( int i = 0 ; i< arr[row].length ; i++){
            if(arr[row][i] !=0){
                arr[row][i] = -1 ;
            }
        }
    }

    static void markcol(int [][] arr, int col){
        for(int i=0; i< arr.length ; i ++){
            if(arr[i][col] !=0){
                arr[i][col] =-1 ;
            }
        }
    }
    public static void main(String[] args) {
        int [][] arr = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };



        for(int i=0 ; i <arr.length ; i ++){
            for(int j =0; j<arr[i].length; j++){
                if(arr[i][j] ==0){
                    markrow(arr, i);
                    markcol(arr,j);
                }
            }
        }

        for(int i=0 ; i <arr.length ; i ++){
            for(int j =0; j<arr[i].length; j++){
                if(arr[i][j]==-1){
                    arr[i][j] =0 ;
                }
            }
        }

        for(int i=0 ; i <arr.length ; i ++){
            for(int j =0; j<arr[i].length; j++){
                if(arr[i][j]==-1){
                    arr[i][j] =0 ;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
