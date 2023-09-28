/**
 *  Name - Gourav Naskar 
 * 
 * **/
import java.io.*;
import java.util.Scanner;
public class ADD {
    public static void main(String[] args) {
        // Initialize a variable to store the sum
        int chk = 0;

        // Iterate through numbers from 25 to 51 (inclusive)
        for (int num = 25; num <= 51; num++) {
            // Check if the number is even
            if (num % 2 == 0) {
                // Add the even number to the sum
                chk += num;
            }
        }

        // Print the sum of even numbers
        System.out.println("The sum of even numbers between 25 and 51 is: " + chk);
    }
}
