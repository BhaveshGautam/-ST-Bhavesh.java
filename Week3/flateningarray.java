package Week3;
import java.util.*;
// Array flattening 

public class flateningarray {
    public static void main(String[] args) {
        int [][] arr = {
            {5,2,1,4},
            {5,6,7,13},
            {9,10,11,12}
        };
        int [] ans = twoconvertone(arr);
        displayone(ans);
        Arrays.sort(ans);
        System.out.println();
        displayone(ans);
        System.out.println();
        System.out.println();
        oneconverttwo(arr,ans);
        displaytwo(arr);


    }
    public static int[] twoconvertone( int [][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[] nums = new int[row*col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                nums[arr[0].length*i+j]=arr[i][j];
            }
        }
        return nums;

    }
    static void displaytwo(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
        
    }
    static void displayone(int []ans){
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
    static void oneconverttwo(int [][]arr,int[]ans){
        for(int i=0;i<ans.length;i++){
            arr[i/arr[0].length][i%arr[0].length]=ans[i];
        }
    }
}