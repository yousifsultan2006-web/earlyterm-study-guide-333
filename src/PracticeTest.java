import static org.junit.Assert.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test 
    void testMaxDiffBigPositiveNumbers() {
        //Arrange
        int[] numbers = {100, 500, 300, 200};
        //Act

        int actual = Practice.maxDiff(numbers);
        //Assert
        assertEquals(400, actual);

    }
    

    // TODO: Make tests for each problem you solve

    @Test 
    void testLongestWordByLetter() {
        //Arrange
        ArrayList<String> words = new ArrayList<String>();
        //Act
        words.add("apple");
        words.add("oranges");
        words.add("watermelon");
        words.add("alphabet");
        words.add("apples");


        String actual = Practice.longestWordStartingWith(words, 'a'); 
        //Assert
            assertEquals("alphabet", actual);
        

    }

    @Test 
    void wordsLongerThanNAndShorterthanM() {
        //Arrange
        HashSet<String> words = new HashSet<String>();
        int n = 3;
        int m = 9;
        //Act

        words.add("apple");
        words.add("oranges");
        words.add("watermelon");
        words.add("alphabet");
        words.add("apples");
        int actual = Practice.wordsLongerThanNAndShorterthanM(words, n, m);
        //Assert
        assertEquals(4, actual);
    }

    @Test 
    void testDifferenceBetweenOddAndEven() {
        //Arrange
        HashMap<String, Integer> numbers = new HashMap<String, Integer>();
        //Act
        numbers.put("a",1);
        numbers.put("b",2);
        numbers.put("c",5);
        numbers.put("d",8);
        numbers.put("e",9);
        numbers.put("f",11);
        int actual = Practice.differenceBetweenEvenAndOdd(numbers);
        //Assert
        assertEquals(2, actual);
        


    }

    @Test 
    void testsSecondLargestKey() {
        //Arrange 
        HashMap<Integer, String> numbers = new HashMap<Integer, String>();
        //Act
        numbers.put(1, "a");
        numbers.put(2, "b");
        numbers.put(5, "c");
        numbers.put(8, "b");
        numbers.put(9, "e");
        numbers.put(11, "f");

        int actual = Practice.secondLargestKey(numbers);
        //Assert
        assertEquals(9, actual);

    }
    
}


