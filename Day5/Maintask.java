package Day5;
import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Maintask {

    public static void main(String[] args) {
        String inputFilePath = "input.txt"; 
        String outputFilePath = "output.txt";  

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\TEMP\\Desktop\\java\\input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\TEMP\\Desktop\\java\\output.txt"));

            String line;
            int totalMarks = 0;
            int studentCount = 0;

    
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // Assuming the format is "Name,Marks"
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    int marks = Integer.parseInt(parts[1].trim());
                    totalMarks += marks;
                    studentCount++;

            
                    writer.write(name + ": " + marks);
                    writer.newLine();
                }
            }

            
            double averageMarks = studentCount > 0 ? (double) totalMarks / studentCount : 0;

            writer.write("Total Marks: " + totalMarks);
            writer.newLine();
            writer.write("Average Marks: " + averageMarks);
            writer.newLine();

    
            reader.close();
            writer.close();

            System.out.println("Results written to " + outputFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error: Please ensure that marks are valid integers.");
        }
    }
}
