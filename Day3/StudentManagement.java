package Day4;

import java.util.Scanner;

 class Student{
	private String name;

    private int roll;

    private int math, science, english;  

    public Student(String name, int roll, int math, int science, int english) {

        this.name = name;

        this.roll = roll;

        this.math = math;

        this.science = science;

        this.english = english;

    }  

    public String getName() {

    	return name;

    	}

    public int getRoll() {

    	return roll;

    	}

    public int getMath() {

    	return math;

    	}

    public int getScience() {

    	return science;

    }

    public int getEnglish() {

    	return english;

    	} 

    public void display() {

        int total = math + science + english;

        double avg = total / 3.0;

        System.out.println("Student Details:");

        System.out.println("Name: " + name);

        System.out.println("Roll No: " + roll);

        System.out.println("Total Marks: " + total);

        System.out.println("Average Marks: " + avg);

    }

}

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   

        System.out.print("Enter Name: ");

        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");

        int roll = sc.nextInt();

        System.out.print("Enter Math Marks: ");

        int math = sc.nextInt();

        System.out.print("Enter Science Marks: ");

        int science = sc.nextInt();

        System.out.print("Enter English Marks: ");

        int english = sc.nextInt();

        Student s = new Student(name, roll, math, science, english);

        s.display();

    
    }}
