package GeekForGeeks.UnionOfTwoSortedArrays;
import java.util.* ;
public class UNionOFTwoSortedArrrays {


    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int arr2[] = {1,2,3,6,7};

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int  i = 0 ; i <  arr1.length ; i ++){
            set.add(arr1[i]);
        }

        for(int  i = 0 ; i <  arr2.length ; i ++){
            set.add(arr2[i]);
        }

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            res.add(it.next());
        }

        for(int a :  res){
            System.out.print(a + " ");
        }
    }
}
