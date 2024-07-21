package week1.day3; 
public class array
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

public class array
{
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
      public class array{

  public static int reverseinteger(int n)
  {
    int rev = 0; // Initialize rev to 0
    int temp;
    while (n != 0) {
      temp = n % 10; // Get the last digit
      rev = rev * 10 + temp; // Build the reversed number
      n = n / 10; // Remove the last digit from n
    }
    return rev; // Return the reversed number
  }
      

  public static void main(String[] args) {
      int n=9234;
      System.out.println(reverseinteger(n));
  }
      }

public class array
{
  public static int sumofArray(int arr[]){
   int sum=0;
    int i;
    for(i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    return sum;

  }
  public static void main(String[] args) {
    int[] arr= new int[]{1,2,3,4,5,6,7,8,9,10};
    System.out.println(sumofArray(arr));
    


  }
}
// code to find sub array(part of array) from array
package week1.day3;
public class array{
  public static void subarray(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
      for(int j=i;j<arr.length;j++)
      {
        for(int k=i;k<=j;k++)
        
        {
          System.out.print(arr[k]);
          System.out.println();
        }


      }

    }  
  

  }
  public static void main(String [] args){
    int[] arr = {1,2,3,4,5,6};
    subarray(arr);


  }
}


