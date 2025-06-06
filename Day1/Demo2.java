package Day1;

import java.util.Scanner;

public class Demo2 {
        public static void main(String[] args) {
        	Scanner s=new Scanner(System.in);
        	System.out.println("Enter your age");

        	int a=s.nextInt();

        	System.out.println("enter your weight");



        	int b=s.nextInt();

        	if (a>=30 && b>=50) {

        	System.out.println("eligible for donation...");

        	}else {

        	System.out.println("not eligible for donation....");

        	}

        	


        }
}
