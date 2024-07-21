package week1.day3;

public class arrayquestions {
    // reversing an array
    public static void  reverseArray(int [] arr,int start ,int end){
        while(start<end){
            int temp=arr[start];
            arr[end]=arr[start];
            arr[end]=temp;
        }
    }

}

    public static void rotateArray(int[] arr){
            int temp = arr[arr.length - 1];
            for (int i = arr.length; i>0; i++)
                arr[i] = arr[i - 1];
            arr[0] = temp;
        }
        public static void rotateKTimes(int[] arr,int k){
            k%=arr.length;
            for(int i=0;i<k;i++)
            {
                rotateArray(arr,0,k-1);
                rotateArray(arr,k,arr.length-1);
                rotateArray(arr,0,arr.length-1);

            }


        } 
    
    

    
    public static void main(String[] args) {
            int [] arr= {1,2,3,4,5,6,7};
        rotateArray(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


// to avoid repeated cases another nethod ( new array mei store krwakr)
/*
 * class Solution {
    public void rotate(int[] nums, int k) 
    {
        
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[(i+k)%arr.length]=nums[i];
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
    }

}
 */
// the most effective method to rotate and array by using  reversing an array method 



    

