java
import java.util.Scanner;

public class UgandaCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the book description:");
        String description = scanner.nextLine();

        String lowerCaseDescription = description.toLowerCase(); // Convert to lowercase for case-insensitive counting
        String[] words = lowerCaseDescription.split("\\s+"); // Split into words (using whitespace as delimiter)

        int ugandaCount = 0;
        for (String word : words) {
            if (word.equals("uganda")) {
                ugandaCount++;
            }
        }

        System.out.println("The word 'Uganda' appears " + ugandaCount + " times in the description.");

        scanner.close();
    }
}

