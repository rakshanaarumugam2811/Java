package Day1;

import java.util.Scanner;

public class Task2 {
     public static void main(String[] args) {
    	 Scanner in=new Scanner(System.in);
    	 System.out.println("Enter amount:");


    	 int amt=in.nextInt();

    	 System.out.println("Enter pin number:");

    	 int pin=in.nextInt();

    	 if(pin==1234) {

    	 if(amt<=5000) {

    	 System.out.println("withdrawn successfully...");

    	 }else {

    	 System.err.println("insufficient amount...");

    	 }

    	 }else{

    	 System.out.println("invalid pinnumber...");

    	 }
     }
}
