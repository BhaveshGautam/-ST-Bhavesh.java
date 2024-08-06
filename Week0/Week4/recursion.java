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
    
    // head recursion of fibonacci series 
    public static int fibonacci(int n) {
        if (n==0||n==1) //use this to avoid negative fibonacci result 
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

    }
     
     // tail recursive for power
    /*
     *  static int pow(int n,int pow){
        if(pow==0){
            return 1;
        }
        return n*pow(n,pow-1);
        
     }
     public static void main(String[] args) {
    
        System.out.println(pow(5,2));
     }
     */

    // tail recursive  for tossoing coin( this question is 99% similar to fibonacci ques )
  /*
   * static void toss (int n, String ans){
   *       if(n==0)
        {
            System.err.println(ans );
            return;
        }
        toss(n-1, ans+"H");// it is called for head 
        toss(n-1, ans +" T"); // it is called for tail
    }
    public static void main(String[] args) {
        int n=3;
        toss(n," ");
    }

   */
   // tail recursive for generating subsequences 
  /*
   *  static void generateSubsequence(String Ques , String ans ){
    if(Ques.length()==0)
    {
        System.out.println(ans);
        return;

   }
   else{
    generateSubsequence(Ques.substring(1),ans+Ques.charAt(0));
    generateSubsequence(Ques.substring(1),ans);

   }
}
   public static void main(String[] args) {
    generateSubsequence("car"," ");

   }

   */
// use head recusrion  to count all thr generated subsequences.....
/*
 * static int countGseq(String ques ){
    if(ques.isEmpty()){ // base case 
        return 1;// becoz if this{} then it is considered to be 1 subsequences of string given...
          }
    int num1=countGseq(ques.substring(1));// including your first character 
    int num2=countGseq (ques.substring(1));// not includig your first character 

    return num1+num2;
}
public static void main(String[] args) {
    String s= "abc";
    System.out.println(countGseq(s));

}
 */
// use tail recursion to count all the generated subsequences....

/*
 * static void generateParenthesis(int n, int l,int r,String ans ){
    if(n==l&&l==r){
        System.out.println(ans);
        return;

    }
    if(l<n){
        generateParenthesis(n,l+1,r,ans+"(");
    }
    if(r<l){
        
        generateParenthesis(n,l,r+1,ans+" )");
    }
}
public static void main(String[] args) {
    generateParenthesis(3,0,0,"");

    }
    
 */

    


    
      
    
    
    
    
     




    

    
