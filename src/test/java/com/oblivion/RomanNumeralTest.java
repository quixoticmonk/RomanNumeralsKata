package com.oblivion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class RomanNumeralTest {

/*
    Roman Number	Computation	Value	Comment
    MMVI	1000 + 1000 + 5 + 1	2006	only addition
    MCMXLIV	1000 + (1000 - 100) + (50 - 10) + (5 - 1)	1944	addition and substraction*/


    @DisplayName("Roman Numeral Conversion")
    @ParameterizedTest(name="Should Return {1} for {0}")
    @CsvSource({
            "I,1",
            "V,5",
            "X,10",
            "L,50",
            "C,100",
            "D,500",
            "M,1000",
            "MMVI,2006",
            "MCMXLIV,1944"
    })
    void shouldReturn10forX(String romanNumeral,int number){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.getNumeralValue(romanNumeral),is(equalTo(number)));
    }

}
