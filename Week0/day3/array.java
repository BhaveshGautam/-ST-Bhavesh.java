package day3;

public class array {
    public static void displayArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

    }
    public static void main(String[] args)
    {
      int[] arr =new int [10];
      arr[1]=5;
      arr[5]=7;
      arr[6]=9;
      displayArray(arr);


    }
    
}
