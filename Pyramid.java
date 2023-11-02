//Name: Aarmanya Jain
//URN No: 2022-M-28022002

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int numRows = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= numRows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the left half of the pyramid
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}