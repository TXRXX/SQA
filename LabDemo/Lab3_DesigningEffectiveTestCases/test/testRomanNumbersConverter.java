package test;


import main.RomanNumbersConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testRomanNumbersConverter {
    RomanNumbersConverter romanNumbersConverter;

    @BeforeEach
    void setUp() { romanNumbersConverter = new RomanNumbersConverter(); }

    @Test
    @DisplayName("TC01: romanNum = I, Expect = 1")
    void testTC01() {
        int romanVal = romanNumbersConverter.asArabic("I");
        assertEquals(1, romanVal);
    }

    @Test
    @DisplayName("TC02: romanNum = J, Expect = No Result")
    void testTC02() {
        int romanVal = romanNumbersConverter.asArabic("J");
        assertEquals("No Result", romanVal);
    }

    @Test
    @DisplayName("TC03: romanNum = M, Expect = 1000")
    void testTC03() {
        int romanVal = romanNumbersConverter.asArabic("M");
        assertEquals(1000, romanVal);
    }

    @Test
    @DisplayName("TC04: romanNum = X, Expect = 10")
    void testTC04() {
        int romanVal = romanNumbersConverter.asArabic("X");
        assertEquals(10, romanVal);
    }

    @Test
    @DisplayName("TC05: romanNum = LL, Expect = No Result")
    void testTC05() {
        int romanVal = romanNumbersConverter.asArabic("LL");
        assertEquals("No Result", romanVal);
    }

    @Test
    @DisplayName("TC06: romanNum = LLL, Expect = No Result")
    void testTC06() {
        int romanVal = romanNumbersConverter.asArabic("LLL");
        assertEquals("No Result", romanVal);
    }

    @Test
    @DisplayName("TC07: romanNum = DD, Expect = No Result")
    void testTC07() {
        int romanVal = romanNumbersConverter.asArabic("DD");
        assertEquals("No Result", romanVal);
    }

    @Test
    @DisplayName("TC08: romanNum = CCCCC, Expect = No Result")
    void testTC08() {
        int romanVal = romanNumbersConverter.asArabic("CCCCC");
        assertEquals("No Result", romanVal);
    }

}