package com.oblivion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class RomanNumeralTest {

/*
    Symbol	Value
    I	1
    V	5
    X	10
    L	50
    C	100
    D	500
    M	1000*/


    @Test
    @DisplayName("Should Return 5 for V")
    void shouldReturn5forV(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.getNumeralValue("V"),is(equalTo(5)));
    }

    @Test
    @DisplayName("Should Return 10 for X")
    void shouldReturn10forX(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.getNumeralValue("X"),is(equalTo(10)));
    }
}
