import  java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Main {

    public static void main(String[] args) {
        String inputFile = "C:\\Users\\Praveen\\Downloads\\assignment\\input_data.txt";
        String outputFile = "C:\\Users\\Praveen\\Downloads\\assignment\\output_data.txt";

        int linesToMerge = 6; // Number of lines to merge before inserting a newline
        int charactersToRemove = 47; // Number of characters to remove from the start of each line

        try {
            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            StringBuilder mergedLines = new StringBuilder();
            int linesMerged = 0;

            while ((line = reader.readLine()) != null) {
                // Remove the specific characters "ECB", "PCB1", "PCB2", "DCB", "OCB", and "HCT" from each line
                line = line.replaceAll("(ECB|PCB1|PCB2|DCB|OCB|HCT)", "");

                // Remove the first 'charactersToRemove' characters from each line
                if (line.length() > charactersToRemove) {
                    line = line.substring(charactersToRemove);
                    line=line.trim();
                } else {
                    line = ""; // If the line is shorter than 'charactersToRemove', remove the entire line
                }

                // Append the current line to the mergedLines StringBuilder
                mergedLines.append(line);
                linesMerged++;

                // Insert a newline character after merging 'linesToMerge' lines
                if (linesMerged % linesToMerge == 0) {
                    writer.write(mergedLines.toString());
                    writer.newLine(); // Add a newline character after each merged line
                    mergedLines.setLength(0); // Clear the mergedLines StringBuilder
                }
            }

            // Close the input and output files
            reader.close();
            writer.close();

            System.out.println("Lines merged successfully with specific characters removed and first 50 characters removed!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}