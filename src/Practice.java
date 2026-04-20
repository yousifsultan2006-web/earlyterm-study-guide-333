import java.util.ArrayList;
import java.util.*;
public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        int largest = nums[0];
        int smallest = nums[0];
        int difference = 0;
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            } 
            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        difference = largest - smallest;
        return difference;
    }


    // TODO: Implement the other methods from the README AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    public static String longestWordStartingWith(ArrayList<String> words, char letter) {

        String longestWord = "";
        for (int i = 0; i < words.size(); i++ ) {
            if (words.get(i).charAt(0) == letter && words.get(i).length() > longestWord.length()) {
                longestWord = words.get(i);

            }

        }


        return longestWord;

    }

    public static int wordsLongerThanNAndShorterthanM(HashSet<String> words, int n, int m) {
        int wordCount = 0;
        for (String word : words) {
            if (word.length() > n && word.length() < m) {
                wordCount++;
            }

        }

        return wordCount;
    }

    public static int differenceBetweenEvenAndOdd(HashMap<String, Integer> numbers) {
        int oddValues = 0;
        int difference;
        int evenValues = 0;
        for (int number : numbers.values()) {

            if (number % 2 != 0) {
                oddValues++;
            } else {
                evenValues++;

            }
        }
        difference = oddValues - evenValues;
        
        return difference;
    }

    public static int secondLargestKey(HashMap<Integer, String> map) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int number : map.keySet()) {
            if(number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        return secondLargest;
    }


}
