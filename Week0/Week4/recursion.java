package Week0.Week4;
public class recursion {
    // tail recursive method for printing numbers only
    /*
     * static int print(int n,int ans){
        if(n==0){
            return ans;
        }
        
        System.out.println(n);
        return print(n-1,ans);
            
        
    }
    public static void main(String[] args) {
        int n=10;
        print(n,1);

    }
     */
      

    // head recursive for printing natural numbers only
    /*
     * static void print(int n){
        //base case
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);// 
        print(n+1);// result/
    }

    public static void main(String[] args) {
        int n=1;
        print(n);

    
    }
     */
     
    // tail recursive method for printing sum
     /*
      * static int sum(int n,int a){
        if(n==1){// base case 
            return a+n;
        }
      //  System.out.println(a+n); this line give you the same after every call of function...
        return sum(n-1,a+n);// result 
        
    }
    public static void main(String[] args) {
        int n=5;
        int sum=sum(n,0);
        System.out.println(sum);

        
    }
      */
      // head recursive method for printing sum
     /*
      *  public static void main(String[] args) {
        int n=5;
        System.err.println(sum(n));
    }


      static int sum(int n){
        if(n==1){   
            return 1;
        }
        return n+sum(n-1);// result
        }
        

      */
      
      // head recursive for fibonacci
      /*
       * // head recursion of fibonacci series 
    public static int fibonacci(int n) {
        if (n <= 1)// (n==0||n==1) use this to avoid negative fibonacci result 
        {
            return n;
            }
            else {
                return fibonacci(n - 1) + fibonacci(n - 2);
                }
                }


    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
       */


     // head recursive for count even
     
    /*
     *  public static void main(String[] args) {
        int n=10;
        System.out.println(countEven(n));
     

    }
    static int countEven(int n){
        if(n==0){
            return 0; // this is the last time my function will perform some action on this n==0; ...
        }
        if(n%2==0){
            return 1+countEven(n-1);// this line means it increases the count by 1 and move to the next number for checking ..
        }
        else{
            return countEven(n-1);// this line tells us that if n is not divisible then move to the next iteration for checking ..
            }




    }
     */

     // tail recursive for count even
     /*
     
     public static void main(String[] args) {
        int n=10;
        System.out.println(countEven(n, 0));
        }
        static int countEven(int n,int count){
            if(n==0){ // this is my base case where my function called for last time
                return count; 
                }
                if(n%2==0){ 
                    return countEven(n-1,1+count); // result 
                    }
                    else{
                        return countEven(n-1,count); 
                        }
                        }
      */
      //head recursive
    /*
     * public static int power(int base ,int power){
        if(power==0){
            return 1;
        }
        return base *power(base,power-1);
        
    }
    public static void main(String[] args) {
        System.out.println(power(5,3));
        

    }
     */
     // tail recursive for power
     static int pow(int n,int pow){
        if(pow==0){
            return 1;
        }
        return n*pow(n,pow-1);
        
     }
     public static void main(String[] args) {
    
        System.out.println(pow(5,2));
     }
      }
      
    
    
    
    
     




    

    
