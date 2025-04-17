// Import libraries
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
* This program uses recursion to reverse a string.
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-04-16
*/

// Creating class
public final class ReverseString {

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private ReverseString() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     * @throws Exception - Input/Output exception
     */

    public static void main(final String[] args) throws Exception {

        // Initialize output string
        String outputStr = "";

        // Write output string to output file
        final FileWriter myWriter = new FileWriter("output.txt");

        // Introduce program to user
        System.out.println("This program uses recursion to reverse a string.");

        // Pass the path to the file as a parameter
        final File file = new File("./input.txt");
        final Scanner scanner = new Scanner(file);

        // Loop while there's another line in the file'
        while (scanner.hasNextLine()) {

            // Assign current line to variable
            final String line = scanner.nextLine();

            // Call function to reverse the string
            final String reversedStr = reverseString(line);

            // Write reverse string to output string
            outputStr += "The reverse of \"" + line
                 + "\" is \"" + reversedStr + "\".";

            // Add new line to output string
            outputStr += "\n";
        }

        // Write to output file
        myWriter.write(outputStr);

        // Display success message
        System.out.println("Success, the reversed string "
            + " is printed in the output file.");

        // Close scanner
        scanner.close();

        // Close writer
        myWriter.close();
    }
    // Function to reverse string
    /**
    * This function reverses a string.
    *
    * @param str The string to reverse
    * @return The reversed string
    */

    public static String reverseString(final String str) {
        // Set base case
        if (str.length() == 0) {
            // Return string
            return str;

        // Otherwise, reverse string
        } else {
            // Call function
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}
