package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestCases {
    @Test
    public void palindromeTest()
    {
        boolean result = PalindromeChecker.isPalindrome("level");
        assertTrue(result);

        boolean result1 = PalindromeChecker.isPalindrome("racecar");
        assertTrue(result1);

        boolean result2 = PalindromeChecker.isPalindrome("hello");
        assertFalse(result2);

        boolean result3 = PalindromeChecker.isPalindrome("A man a plan a canal Panama");
        assertTrue(result3);
    }
}
