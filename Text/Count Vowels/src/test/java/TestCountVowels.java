import static org.junit.Assert.*;

import org.junit.Test;


public class TestCountVowels {
	
	private static final String INPUT = "We will be counting the number of vowels in this string, why not?";
	private static final String INPUT2 = "The quick brown fox jumps over the lazy dog.";

	@Test
	public void testCountVowelsA() {
		assertEquals(0, CountVowles.countVowels(INPUT, 'a'));
		assertEquals(1, CountVowles.countVowels(INPUT2, 'a'));
	}
	
	@Test
	public void testCountVowelsE() {
		assertEquals(5, CountVowles.countVowels(INPUT, 'e'));
		assertEquals(3, CountVowles.countVowels(INPUT2, 'e'));
	}
	
	@Test
	public void testCountVowelsI() {
		assertEquals(5, CountVowles.countVowels(INPUT, 'i'));
		assertEquals(1, CountVowles.countVowels(INPUT2, 'i'));
	}
	
	@Test
	public void testCountVowelsO() {
		assertEquals(4, CountVowles.countVowels(INPUT, 'o'));
		assertEquals(4, CountVowles.countVowels(INPUT2, 'o'));
	}
	
	@Test
	public void testCountVowelsU() {
		assertEquals(2, CountVowles.countVowels(INPUT, 'u'));
		assertEquals(2, CountVowles.countVowels(INPUT2, 'u'));
	}
	
	@Test
	public void testCountVowelsY() {
		assertEquals(1, CountVowles.countVowels(INPUT, 'y'));
		assertEquals(1, CountVowles.countVowels(INPUT2, 'y'));
	}

}
