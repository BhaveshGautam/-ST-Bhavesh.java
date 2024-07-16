package week1.day3;
/*
 * public class array {
    public static void displayArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

    }
    public static void main(String[] args)
    {
      int[] arr =new int [10]; // the rest of index will have 
      arr[1]=5;
      arr[5]=7;
      arr[6]=9;
      displayArray(arr);


    }
    
}

 */

import java.util.Scanner;

/*
 * public class array{
    public static int reverseinteger(int n){
        int temp;
        for(temp=0;n!=0;n/=10)
      // initilization  int rev=0;
      //condition  int num=n%10;
        temp=temp*10+n%10;
       // change num=num/10;
       return temp;
    }
    public static void main(String[] args) {
        int n=9234;
        System.out.println(reverseinteger(n));
    }
}
 */
/*
 * public class array
{
    public static int countdigits(int n)
    {
        int count=0;
        while(n!=0){
            n=n/10;// digits elemination
            count++;
        }
        return count;
     }
     public static void main(String[] args)
      {
        int n=1234;
        System.out.println(countdigits(n));
        
     }

     
    
}
 */

public class array
{
    public static int searchelement(int arr[],int a){

        for(int i=0;i<arr.length;i++)
           
            if(a==arr[i])
            {

                return i;
            }
            return -1;
        
    }


   

    public static void main(String[] args){
        int a=9;
        int i;
        int arr[]= new int[10];
        Scanner sc = new Scanner(System.in);
        for(i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        System.out.println(searchelement( arr, a));//9
    }




}
public class array {
    //code
        public static void main(String[] args) {
          int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
      
          int maxValue = arr[0];
          for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
              maxValue = arr[i];
            }
          }
      
          System.out.println("Maximum value in the array is: " + maxValue);
        }
      }

