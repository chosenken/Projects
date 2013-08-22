import static org.junit.Assert.*;

import org.junit.Test;

public class TestCheckIfPalendrome {

	@Test
	public void testCheckIfPalendrome1() {
		String palendrome = "Madam I'm Adam";
		assertTrue(CheckIfPalendrome.checkPalendrome(palendrome));

	}

	@Test
	public void testCheckIfPalendrome2() {
		String palendrome = "Too hot to hoot";
		assertTrue(CheckIfPalendrome.checkPalendrome(palendrome));
	}

	@Test
	public void testCheckIfPalendrome3() {
		String palendrome = "Too hot to hoot";
		assertTrue(CheckIfPalendrome.checkPalendrome(palendrome));
	}
	
	@Test
	public void testCheckIfPalendrome4() {
		String palendrome = "Was it a car or a cat I saw?";
		assertTrue(CheckIfPalendrome.checkPalendrome(palendrome));
	}
	
	@Test
	public void testCheckIfPalendrome5() {
		String palendrome = "Not a palendrome";
		assertFalse(CheckIfPalendrome.checkPalendrome(palendrome));
	}

}
