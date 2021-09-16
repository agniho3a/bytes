package com.codepark.bytes;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SolutionTest
    extends TestCase
{
    Solution sol = new Solution();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SolutionTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SolutionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testValid() {
        assertTrue( Solution.isValidPalindrome("level") );
    }

    public void testInvalid() {
        assertFalse( Solution.isValidPalindrome("THis is not a palindrome"));
    }

    public void testWithSingleSpaces() {
        assertTrue( Solution.isValidPalindrome("ab b a"));
    }

    public void testWithMultipleSpaces() {
        assertTrue( Solution.isValidPalindrome("ab b          a"));
    }

    public void testWithNonAlphabeticalChars() {
        assertTrue( Solution.isValidPalindrome("ab#$%.b a?"));
    }

    public void testNull() {
        assertFalse( Solution.isValidPalindrome(null));
    }

    public void testBlank (){
        assertTrue( Solution.isValidPalindrome(""));
    }

    public void testWithMixedCase() {
        assertTrue( Solution.isValidPalindrome("ab BA"));
    }
}
