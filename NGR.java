

public class NGR {
    static void display(int[] arr){
        for(int i:arr){
            System.out.print(i);
            System.out.println();
        }
    }
// current element is not included
    static void NGRNI(int[] nums,int[]arr){
        int maxR=0;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=maxR;//store
            maxR=Math.max(maxR,nums[i]);// update
        }
    }
    // current element is included
    static void NGRCI(int [] nums,int[] arr){
        int maxR=0;
        for(int i=nums.length-1;i>=0;i--){
            maxR=Math.max(maxR,nums[i]);//update
            arr[i]=maxR;// store
        }
    }
    public static <Strings> void main(Strings[] agrs){
        int[] nums ={2,3,1,8,7,3,4};
        int[] arr=new int[nums.length];
        NGRCI(nums,arr);
        display(arr);

    }

}

