package com.example.laurent.algorithm;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeightSort {

    private static final String CHARACTER_SPACE = " ";

    public static String orderWeight(String string) {

        if (string == null || string.length() == 0) {
            return "";
        }

        List<WeightedNumber> weightedNumbers = parseNumbers(string);
        Collections.sort(weightedNumbers);

        return WeightSort.toNumberString(weightedNumbers);
    }

    @NonNull
    private static List<WeightedNumber> parseNumbers(String numbersString) {
        String[] numbers = numbersString.split(CHARACTER_SPACE);
        int numbersLength = numbers.length;
        List<WeightedNumber> weightedNumbers = new ArrayList<>(numbersLength);

        for (String number : numbers) {
            weightedNumbers.add(new WeightedNumber(number));
        }
        return weightedNumbers;
    }

    private static String toNumberString(List<WeightedNumber> weightedNumbers) {
        StringBuilder stringBuilder = new StringBuilder();

        for (WeightedNumber weightedNumber : weightedNumbers) {
            stringBuilder.append(weightedNumber);
            stringBuilder.append(CHARACTER_SPACE);
        }

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
    }

    private static class WeightedNumber implements Comparable<WeightedNumber> {
        private int weight;
        private String number;

        WeightedNumber(String number) {
            this.number = number;
            weight = getStringWeight(number);
        }

        private int getStringWeight(String number) {

            int weight = 0;
            char[] digits = number.toCharArray();

            for (char digit : digits) {
                weight += Character.getNumericValue(digit);
            }

            return weight;
        }

        @Override
        public String toString() {
            return number;
        }

        @Override
        public int compareTo(@NonNull WeightedNumber otherNumber) {
            final int otherNumberWeight = otherNumber.weight;

            if (weight == otherNumberWeight) {
                return number.compareTo(otherNumber.number);
            }

            return weight > otherNumberWeight ? 1 : -1;
        }
    }
}
