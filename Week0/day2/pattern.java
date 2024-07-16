 package day2;

import java.util.Scanner;

class pattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            /* square with *
             * for(int j=1;j<=n;j++)
                System.out.print(" * ");
                System.out.println();
             */
            // right facing triangle
             for(int j=1;j<=i;j++)
                System.out.print(" * ");
                System.out.println();
            
            sc.close();
        }


    }

    
}