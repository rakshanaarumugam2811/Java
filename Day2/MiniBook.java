package Day4;

import java.util.Scanner;

public class MiniBook {
	 public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);

	        String[] names = new String[5]; 

	        String[] phones = new String[5];

	        int count = 0;



	        while (true) {

	            System.out.println("1) Add");

	            System.out.println("2) Search");

	            System.out.println("3) List");

	            System.out.println("4) Exit");

	            System.out.print("Enter number: ");

	            int choice = s.nextInt();

	            s.nextLine(); 



	            if (choice == 1) {

	                if (count < names.length) {

	                    System.out.print("Name: ");

	                    names[count] = s.nextLine();

	                    System.out.print("Phone: ");

	                    phones[count] = s.nextLine();

	                    count++;

	                } else {

	                    System.out.println("Full!");

	                }

	            } else if (choice == 2) {

	                System.out.print("Search name: ");

	                String searchName = s.nextLine();

	                for (int i = 0; i < count; i++) {

	                    if (names[i].equalsIgnoreCase(searchName)) {

	                        System.out.println("Found: " + names[i] + " - " + phones[i]);

	                        break;

	                    }

	                }

	            } else if (choice == 3) {

	                for (int i = 0; i < count; i++) {

	                    System.out.println(names[i] + " - " + phones[i]);

	                }

	            } else if (choice == 4) {

	                System.out.println("Bye!");

	                s.close();

	                return;

	            } else {

	                System.out.println("Invalid.");

	            }

	        }

	    }

	
}
