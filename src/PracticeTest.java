import static org.junit.Assert.*;
import java.util.ArrayList;

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

    @Test void testLongestWordByLetter() {
        ArrayList<String> words = new ArrayList<String>();
        words.add("apple");
        words.add("oranges");
        words.add("watermelon");
        words.add("alphabet");
        words.add("apples");

        String actual = Practice.longestWordStartingWith(words, 'a'); 
            assertEquals("alphabet", actual);
        

    }
    
}


