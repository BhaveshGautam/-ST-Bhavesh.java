package Week3;
import java.util.*;
public class Rtwodarrays {
    static void sortcol(int arr[][],int col){
        Arrays.sort(arr,(a,b)->Integer.compare(a[col],b[col]));
    }
// this function sort all rows of a 2d array and special function
// Integer.compare is used to sort all rows 
        
    static void sortallrow(int arr[][],int row){
        Arrays.sort(arr,(a,b)->Integer.compare(a[row],b[row]));
        for(int i=0;i<arr.length;i++){// loop hai length tak chlega 
            Arrays.sort(arr[i]);// har  i^th row pr jakr sort krega 
        }

    }
    // this function makes rows and columns interchange and print result...
    public static int[][] transpose(int [][] arr)
    {
        int row = arr.length;
        int col = arr[0].length;
      int [][]  arr1 = new int[col][row];// row--> col && col--> row 
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                arr1[j][i] = arr[i][j];// arr ki values ko dusre aaray mei daaldia
                }
        }
        return arr1;
    }   // this function ends here only*

    // this function is being used to search targetvalue in 2d array ,return target 
    public static int search (int[][] arr,int target){
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == target) {
                    return target;
                }
            }
        }  
        return -1;    
    } // this search function ends here only 

        // this function is  being used for inserting values in 2d array
    public static void insert(int [] [] arr){
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.println(arr[i][j]);
            
                }       

    }

} // this function ends here 

// this display function  is  being used for showing inserted values in 2d array
static void display(int [][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}// this function ends here 
    public static void main(String[] args) {
       // int [][] arr= new int[5][3]; declaration of 2d array
        int[][] arr=  {
           { 2,4,6},
           { 1,5,9},
           { 3,7,8}
        };
        // u must provide some value otherwise error will come
       // System.out.println(arr);// this prints the address of arr
        //insert(arr);// to insert values in 2d array=arr
       // display(arr);// this function shows the values as output
       // System.out.println(search(arr,15));// this calls and prints target search
       // int [][] arr1=transpose(arr);// store in arr1 after transpose
       // display(arr1);
        //sortallrow(arr, 0);// here zero signifies column...
        //display(arr);
        //sortcol(arr,1);
        //display(arr);
    
    }
}