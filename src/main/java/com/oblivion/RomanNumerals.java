package com.oblivion;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    Map<String, Integer> romanNumeralsMap = new HashMap<String, Integer>() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }
    };

    public int getNumeralValue(String inputNumeral) {
        char[] inputNumeralArray = inputNumeral.toCharArray();
        int returnNumeral = 0;
        if (inputNumeralArray.length > 1) {
            for (int i = inputNumeralArray.length - 1; i >= 1; i--) {
                if (getValueFromNumeral(inputNumeralArray, i) > getValueFromNumeral(inputNumeralArray, i - 1)) {
                    returnNumeral += getValueFromNumeral(inputNumeralArray, i)-getValueFromNumeral(inputNumeralArray, i-1);
                    i--;
                } else {
                    returnNumeral += getValueFromNumeral(inputNumeralArray, i);
                }
            }
        }
        returnNumeral += getValueFromNumeral(inputNumeralArray, 0);

        return returnNumeral;
    }

    private int getValueFromNumeral(char[] inputNumeralArray, int i) {
        int valueOutput = 0;
        for (Map.Entry<String, Integer> entry : romanNumeralsMap.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(String.valueOf(inputNumeralArray[i]))) valueOutput = entry.getValue();
        }
        return valueOutput;
    }
}
