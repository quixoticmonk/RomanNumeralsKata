package com.oblivion;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    Map<String,Integer> romanNumeralsMap = new HashMap<String, Integer>(){
        {
            put("I",1);
            put("V",5);
            put("X",10);
            put("L",50);
            put("C",100);
            put("D",500);
            put("M",1000);
        }
    };

    public int getNumeralValue(String inputNumeral) {
        char[] inputNumeralArray = inputNumeral.toCharArray();
        int returnNumeral =0;
        for (int i=0; i<inputNumeralArray.length;i++) {
            returnNumeral= getValueFromNumeral(inputNumeralArray, returnNumeral, i);
        }
        return returnNumeral;
    }

    private int getValueFromNumeral(char[] inputNumeralArray, int returnNumeral, int i) {
        for (Map.Entry<String, Integer> entry : romanNumeralsMap.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(String.valueOf(inputNumeralArray[i]))) returnNumeral += entry.getValue();
        }
        return returnNumeral;
    }
}
