package com.codepark.bytes;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println(reverseString("Cat"));
        System.out.println(reverseString("The Daily Byte"));
        System.out.println(reverseString("civic"));
        System.out.println(reverseString("c"));
        System.out.println(reverseString("ab"));
        System.out.println(reverseString(""));
        System.out.println(reverseString(null));

    }

    /**
     * Swap the leftmost element and rightmost element. Then move one step inwards
     *
     * @param str
     * @return
     */
//    private static String reverseString(String str) {
//        if (null == str) { return null; }
//
//        char[] arr = str.toCharArray();
//        for(int i=0; i< arr.length/2; i++) {
//            char temp = arr[(arr.length - 1) - i];
//            arr[(arr.length -1) - i] = arr[i];
//            arr[i] = temp;
//        }
//
//        return new String(arr);
//    }

    /**
     * Two pointer approach (LEft and right pointer)
     * @param str
     * @return
     */
    private static String reverseString(String str) {
        if (null == str) { return null; }

        char[] arr = str.toCharArray();
        // Left pointer
        int l = 0;
        int r = arr.length - 1; // Array Indexes are zero based

        while(l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }

        return new String(arr);
    }
}
