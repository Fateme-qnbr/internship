package BeginnerLevel;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String word = str.nextLine();
        String noSpaces = word.replaceAll("\\s+", ""); // Removes all spaces
        String noSpacesnoUpperCase = noSpaces.toLowerCase();
        StringBuilder nstr = new StringBuilder();
        char ch;

        for (int i = 0; i < noSpacesnoUpperCase.length(); i++) {

            // extracts each character
            ch = noSpacesnoUpperCase.charAt(i);

            // adds each character in front of the existing string
            nstr.insert(0, ch);
        }
        if (nstr.toString().equals(noSpacesnoUpperCase)){
            System.out.println("The String is a palindrome.");

        }else {
            System.out.println("The String is not a palindrome.");
        }

        System.out.println(nstr);

    }
}
