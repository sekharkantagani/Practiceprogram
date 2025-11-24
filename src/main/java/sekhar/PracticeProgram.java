package sekhar;

import java.util.Scanner;

public class PracticeProgram {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        // 1. Display in uppercase
        System.out.println("\nUppercase: " + text.toUpperCase());
        
        // 2. Display in lowercase
        System.out.println("Lowercase: " + text.toLowerCase());
        
        // 3. Count vowels
        int vowelCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        
        // 4. Reverse the string
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Reversed string: " + reversed);
        
        // 5. Check palindrome
        if (text.equalsIgnoreCase(reversed)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }
        
        sc.close();

	}

}
