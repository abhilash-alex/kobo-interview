package koboTest.solution1;

/**
 * Created by abhilash on 2018-08-06.
 */
public class Reverse {
    /**
     * Problem : You are given a random string; write a working program that will reverse the string using optimal space
     *           and speed. Do not make use in built in Java functions! Please submit your answer in a file
     *           called Reverse.java
     *
     * Solution : Traverse the given character array in reverse and add to a new character array
     *
     * Time : O(2n) converting string to char array, to traverse the char array to build result
     * Space : O(n) to build the result string
     */
    public static String reverseString(String toReverse) {
        // check for null input and empty string
        if(toReverse == null || toReverse.length() == 0)
            return toReverse;

        char[] toReverseCharArray = toReverse.toCharArray(); // don't trim the string, preserve spaces as well.
        int strLength = toReverse.length();
        int strLengthMinusOne = strLength - 1;
        char[] resultArray = new char[strLength];

        for (int idx = strLengthMinusOne; idx >= 0; idx--) {
            resultArray[strLengthMinusOne - idx] = toReverseCharArray[idx];
        }

        return new String(resultArray);
    }
}