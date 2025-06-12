package Day5;
import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Maintask {

    public static void main(String[] args) {
        String inputFilePath = "input.txt"; // Input file containing student names and marks
        String outputFilePath = "output.txt";  // Output file for results

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\TEMP\\Desktop\\java\\input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\TEMP\\Desktop\\java\\output.txt"));

            String line;
            int totalMarks = 0;
            int studentCount = 0;

            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // Assuming the format is "Name,Marks"
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    int marks = Integer.parseInt(parts[1].trim());
                    totalMarks += marks;
                    studentCount++;

                    // Write individual results to the output file
                    writer.write(name + ": " + marks);
                    writer.newLine();
                }
            }

            // Calculate average
            double averageMarks = studentCount > 0 ? (double) totalMarks / studentCount : 0;

            // Write total and average to the output file
            writer.write("Total Marks: " + totalMarks);
            writer.newLine();
            writer.write("Average Marks: " + averageMarks);
            writer.newLine();

            // Close the resources
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