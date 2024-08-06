package week2;

import java.util.Scanner;

public class codingblockesques {
    /*
     * public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int m=0;
        for(int i=2;i<N;i++){
            if(N%i==0){
                System.out.println("Not Prime");
                m++;
                break;
            }
        }
        if(m==0){
            System.out.println("Prime");
        }

    }
     */
    import java.util.Scanner;

public class Main {
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }

    public static void printArmstrongNumbers(int N1, int N2) {
		// this loop is the main concept in this code
        for (int i = N1; i <= N2; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N1 = input.nextInt();
        int N2 = input.nextInt();
        printArmstrongNumbers(N1, N2);
    }
}

}
import java.util.*;
public class Main {
    public static int gcd(int N1, int N2) {
        int min;
        if (N1 > N2) {
            min = N2;
        } else {
            min = N1;
        }
        for (int i = min; i > 0; i--) {
            if (N1 % i == 0 && N2 % i == 0) {
                return i;
            }
        }
        return 1; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N1 = input.nextInt();
        int N2 = input.nextInt();
        System.out.println(gcd(N1, N2));
    }
} 
import java.util.*;
public class codingblocks {
	public static int findLcm(int a, int b){
		 int res= Math.max(a,b);
		 while(true){
			 if(res%a==0 && res%b==0){
				 break;
			 }
			 res++;
		 }
		 return res;
	}
    public static void main(String args[]) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.print(findLcm(a,b));

    }
}
import java.util.*;
public class Main {
    public static void main(String args[]) {
		
		Scanner input = new Scanner (System.in);
		int nums = input.nextInt();
		
		int dig = input.nextInt();
		System.out.println(countdigit(nums,dig));
		
    }
	public static int countdigit(int nums,int dig){
		int count =0;
		while(nums>0){
			int ld = nums%10;
			if(ld==dig){
				count++;
			}
			
			nums=nums/10;
		}
		return count;
	}
}    import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isArmstrong(number));

        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits =String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        if (sum == originalNumber)
			return true;
		
		else
			return false;

		
    }
}