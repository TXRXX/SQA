package test;

import labdemo.main.Multiplication;
import labdemo.main.RomanNumerals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testRomanNumerals {

    RomanNumerals romanNumerals;
    @BeforeEach
    void setUp() {
        romanNumerals = new RomanNumerals();
    }


    @Test
    @DisplayName("TC01: romanNum = I , Expect = 1")
    void testRomanToNumI() {
        int roman = romanNumerals.convertRomanNumToInt("I");
        assertEquals(1, roman);
    }

    @Test
    @DisplayName("TC02: romanNum = M , Expect = 1000")
    void testRomanToNumM() {
        int roman = romanNumerals.convertRomanNumToInt("M");
        assertEquals(1000, roman);
    }

    @Test
    @DisplayName("TC03: romanNum = V , Expect = 5")
    void testRomanToNumV() {
        int roman = romanNumerals.convertRomanNumToInt("V");
        assertEquals(5, roman);
    }

    @Test
    @DisplayName("TC04: romanNum = X , Expect = 10")
    void testRomanToNumX() {
        int roman = romanNumerals.convertRomanNumToInt("X");
        assertEquals(10, roman);
    }

    @Test
    @DisplayName("TC05: romanNum = L , Expect = 50")
    void testRomanToNumL() {
        int roman = romanNumerals.convertRomanNumToInt("L");
        assertEquals(50, roman);
    }

    @Test
    @DisplayName("TC06: romanNum = XI , Expect = 11")
    void testRomanToNumXI() {
        int roman = romanNumerals.convertRomanNumToInt("XI");
        assertEquals(11, roman);
    }

    @Test
    @DisplayName("TC07: romanNum = XII , Expect = 12")
    void testRomanToNumXII() {
        int roman = romanNumerals.convertRomanNumToInt("XII");
        assertEquals(12, roman);
    }

    @Test
    @DisplayName("TC08: romanNum = XIII , Expect = 13")
    void testRomanToNumXIII() {
        int roman = romanNumerals.convertRomanNumToInt("XIII");
        assertEquals(13, roman);
    }

    @Test
    @DisplayName("TC09: romanNum = IX , Expect = 9")
    void testRomanToNumIX() {
        int roman = romanNumerals.convertRomanNumToInt("IX");
        assertEquals(9, roman);
    }

    @Test
    @DisplayName("TC10: romanNum = IIX , Expect = No Result")
    void testRomanToNumIIX() {
        int roman = romanNumerals.convertRomanNumToInt("IIX");
        assertEquals("No Result", roman);
    }

    @Test
    @DisplayName("TC11: romanNum = IIIX , Expect = No Result")
    void testRomanToNumIIIX() {
        int roman = romanNumerals.convertRomanNumToInt("IIIX");
        assertEquals("No Result", roman);
    }



}
