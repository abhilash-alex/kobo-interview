package koboTest.solution2;

import java.util.*;

/**
 * Created by abhilash on 2018-08-06.
 */
public class Sort {

    private static List<Integer> applicableNumbers = Arrays.asList(1,5,9); // add additional numbers to this constant
    static {
        Collections.sort(applicableNumbers); // sort just in case
    }

    /**
     * Problem : You are given list of size N that contains only numbers 1, 5, 9 populated randomly; Write a working program
     *           that will selectiveSort a given list using optimal space and speed. Please submit your answer in a file called Sort.java.
     *
     * Solution : Traverse the list and count occurrences of 1, 5 and 9. Then build the result list by using the count
     *            of these occurrences.
     *
     * Time : O(2n) -> traverse the list once to count occurrences, traverse the length of the list again to build result
     * Space : O(n) -> to allocate space for the result list of size n
     */
    public static List<Integer> selectiveSort(List<Integer> toSort) throws Exception {

        // check for null input and empty string
        if(toSort == null || toSort.size() == 0)
            return toSort;

        HashSet<Integer> applicableNumbersLookup= new HashSet<>(applicableNumbers);
        HashMap<Integer, Integer> counterMap = new HashMap<>();

        for (Integer n : toSort) {
            if (applicableNumbersLookup.contains(n)) {
               counterMap.put(n, counterMap.getOrDefault(n, 0) + 1);
            } else
                throw new Exception("Unexpected number found in given list,: " + n + ". Only 1,5 and 9 expected.");
        }

        Integer lastSetIndex = null;
        for(Integer number: applicableNumbers){
            int count = counterMap.getOrDefault(number, 0);
            if(lastSetIndex == null) {
                lastSetIndex = 0;
            }
            for (int i = lastSetIndex; i < lastSetIndex + count; i++) {
                toSort.set(i, number);
            }
            lastSetIndex = lastSetIndex + count;
        }


        return toSort;
    }
}
