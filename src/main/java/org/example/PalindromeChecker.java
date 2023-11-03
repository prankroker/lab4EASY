package org.example;

public class PalindromeChecker {
    public static boolean isPalindrome(String word){
        word = word.replaceAll(" ","");

        StringBuilder stringBuildervarible = new StringBuilder();

        stringBuildervarible.append(word);

        String word1 = String.valueOf(stringBuildervarible.reverse());

        return word.equalsIgnoreCase(word1);
    }
}
