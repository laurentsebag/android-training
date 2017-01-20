package com.example.laurent.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * You are provided a string containing a list of positive integers separated
 * by a space (" "). Take each value and calculate the sum of its digits, which
 * we call it's "weight". Then return the list in ascending order by weight, as a
 * string joined by a space.
 *
 *
 * For example 99 will have "weight" 18, 100 will have "weight" 1 so in the ouput
 * 100 will come before 99.
 *
 *
 * Example:
 *
 * "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:
 * "100 180 90 56 65 74 68 86 99"
 *
 *
 * When two numbers have the same "weight", let's consider them to be strings and
 * not numbers:
 *
 * 100 is before 180 because its "weight" (1) is less than the one of 180 (9) and
 * 180 is before 90 since, having the same "weight" (9) it comes before as a string.
 *
 *
 * All numbers in the list are positive integers and the list can be empty.
 */
public class WeightSortTest {

    private static final String TEST_LIST_1 = "12";
    private static final String TEST_LIST_1_EXPECTED = "12";
    private static final String TEST_LIST_2 = "13 20";
    private static final String TEST_LIST_2_EXPECTED = "20 13";
    private static final String TEST_LIST_SAME_WEIGHT = "90 180";
    private static final String TEST_LIST_SAME_WEIGHT_EXPECTED = "180 90";
    private static final String TEST_LIST_9 = "56 65 74 100 99 68 86 180 90";
    private static final String TEST_LIST_9_EXPECTED = "100 180 90 56 65 74 68 86 99";

    @Test
    public void testOrderWeight_shouldReturnEmpty_whenEmptyString() {
        String result = WeightSort.orderWeight("");
        assertEquals("", result);
    }

    @Test
    public void testOrderWeight_shouldReturnEmpty_whenNullString() {
        String result = WeightSort.orderWeight(null);
        assertEquals("", result);
    }

    @Test
    public void testOrderWeight_shouldReturnTheSameString_whenOnlyOneNumber() {
        String result = WeightSort.orderWeight(TEST_LIST_1);
        assertEquals(TEST_LIST_1_EXPECTED, result);
    }

    @Test
    public void testOrderWeight_shouldSortNumbersAsString_whenIdenticalWeight() {
        String result = WeightSort.orderWeight(TEST_LIST_SAME_WEIGHT);
        assertEquals(TEST_LIST_SAME_WEIGHT_EXPECTED, result);
    }

    @Test
    public void testOrderWeight_shouldSortNumberByWeight_whenMoreThanOneNumber() {
        String result = WeightSort.orderWeight(TEST_LIST_2);
        assertEquals(TEST_LIST_2_EXPECTED, result);
        result = WeightSort.orderWeight(TEST_LIST_9);
        assertEquals(TEST_LIST_9_EXPECTED, result);
    }
}

