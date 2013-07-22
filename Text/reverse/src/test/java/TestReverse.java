import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestReverse {
	
	private static final String INPUT = "This line will be reversed.";
	private static final String OUTPUT = ".desrever eb lliw enil sihT";

	@Test
	public void testReverseStringBuilder() {
		String reversed = Reverse.reverseStringBuilder(INPUT);
		assertEquals(OUTPUT, reversed);
	}

	@Test
	public void testReverseBruteForce() {
		String reversed = Reverse.reverseBruteForce(INPUT);
		assertEquals(OUTPUT, reversed);
	}

}
