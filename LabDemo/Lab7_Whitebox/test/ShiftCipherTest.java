package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import main.ShiftCipher;

class ShiftCipherTest {
	
	ShiftCipher cipher = new ShiftCipher();

	@Test
	@DisplayName("TC01: Invalid - Message = abcd, Shift = 3")
	void test_shift1() {
		String result = cipher.shift("abcd", 3);
		System.out.println(result);
		assertEquals("invalid", result);
	}
	@Test
	@DisplayName("TC02: Invalid - Message = @, Shift = 3")
	void test_shift2() {
		String result = cipher.shift("@", 3);
		System.out.println(result);
		assertEquals("invalid", result);
	}
	@Test
	@DisplayName("TC03: Invalid - Message = ABCD, Shift = 25")
	void test_shift3() {
		String result = cipher.shift("ABCD", 25);
		System.out.println(result);
		assertEquals("ZABC", result);
	}
	@Test
	@DisplayName("TC04: Invalid - Message = ABCD, Shift = -17")
	void test_shift4() {
		String result = cipher.shift("ABCD", -17);
		System.out.println(result);
		assertEquals("JKLM", result);
	}

}
