package Week3;
import java.util.*;
public class twodarray {
    static void sortcol(int arr[][],int col){
        Arrays.sort(arr,(a,b)->Integer.compare(a[col],b[col]));
    }
    static void sortallrow(int arr[][],int row){
        Arrays.sort(arr,(a,b)->Integer.compare(a[row],b[row]));//
        for(int i=0;i<arr.length;i++){// loop hai length tak chlega 
            Arrays.sort(arr[i]);// har  i^th row pr jakr sort krega 
        }

    }
        public static int[] search(int[][]arr,int num){
        int[] solution = {-1,-1};
        for(int i=0;i<arr.length;i++){
            for( int j=0;j<arr[0].length;j++){
                if(arr[i][j]==num){
                    solution[0]=i;
                    solution[1]=j;

            }
        }

        
        }
        return solution;

    }
    static void insert(int[][]arr){
        int num=1;
        // stores natural no's
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for( int j=0;j<arr[0].length;j++){
                arr[i][j]=num++;
            }
        }
    }
    static void display(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int [][] transpose(int[][] nums){
        int [][] abc =new int[nums[0].length][nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                abc[j][i]=nums[i][j];   
           }
        }
        return abc;
    }
    public static void main(String[] args) {

         int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
         };
    // declarration of 2d array (it returns address of first bracket[5])
    System.out.println(arr);
    insert(arr);
    display(arr);
    System.out.println();
    int [][] abc=transpose(arr);
    //display(abc);
    sortallrow(abc, 0);
    //sortcol(abc, 0);
    display(abc);

    int [] nums =search(arr,8);
    System.out.println(nums[0]+" "+nums[1]);

        }

    


    }

