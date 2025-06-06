package Day2;

import java.util.Random;
import java.util.Scanner;

public class OTP {
               public static int OTP() {
            	   Random ran=new Random();
            	   return 1000+ran.nextInt(50000);
            	   
               }
           public static void main(String[] args) {
        	   Scanner in=new Scanner(System.in);
        	   long num=in.nextLong();
        	   long a=1234567890;
        	   if (num==a) {
        		   System.out.println("Verified");
        		   int otp=OTP();
        		   System.out.println("OTP"+otp);
        		 
        	   }
        	   else {
        		   System.out.println("Invalid");
        	   }
        	   
        	  
        	   
        	   
           }
                
                
}
