package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import main.RomanNumerals;

class ExternalMethodTest {

	 @ParameterizedTest
	 @MethodSource("test.StringParameters#provideSomeStrings")
	    void testWithExternalMethodSource(String input) {
		 	assertTrue(RomanNumerals.isBlank(input));
	 }
}

class StringParameters{
	static Stream<String> provideSomeStrings() {
        return Stream.of(".", "oo", "OOO", null, "", "  ");
	}
}
