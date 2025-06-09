package task;

import java.util.Scanner;

public class Task2 {
      public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
          System.out.println("Enter the String: ");
         
          String input = in.nextLine();

          int vowel = 0, consonant = 0;

          for (int i = 0; i < input.length(); i++) {
              char ch = Character.toLowerCase(input.charAt(i));

              if (Character.isLetter(ch)) {
                  if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                      vowel++;
                  } else {
                      consonant++;
                  }
              }
          }

          System.out.println("Vowels: " + vowel);
          System.out.println("Consonants: " + consonant);
      }
  
      }

