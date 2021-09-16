package com.codepark.bytes;

import java.util.Locale;

/**
 * Hello world!
 *
 */
public class Solution
{
    /**
     * Approach one - two pointer approach
     * @param str
     * @return
     */
    public static boolean isValidPalindrome(String str) {
        if( null == str) {
            return false;
        }

        char[] arr = str.toLowerCase().toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while( left < right){
            if(arr[left] < 97 || arr[left] > 122) {
                left++;
                continue;
            }

           if(arr[right] < 97 || arr[right] > 122) {
               right--;
               continue;
           }

            if (arr[left++] != arr[right--]) {
                return false;
            }
        }

        return true;
    }
}
