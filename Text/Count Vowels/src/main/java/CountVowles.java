import java.util.HashMap;

public class CountVowles {
	private static final char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };

	public static void main(String args[]) {
		if (args.length != 1) {
			System.out.println("Usage:  CountVowels <String>");
			System.exit(1);
		}
		
		// Use a hashmap to store the results
		HashMap<Character, Long> results = new HashMap<Character, Long>();
		
		// Iterate though the vowels
		for(char c: vowels) {
			results.put(c, countVowels(args[0], c));
		}
		
		// Print out the values
		System.out.println("Input String: " + args[0]);
		System.out.println("========================================");
		for(char c : vowels) {
			System.out.println(c + ": " + results.get(c));
		}
		System.out.println("========================================");
		
	}
	
	public static long countVowels(String input, char vowel) {
		if (input == null || input.isEmpty()) {
			return -1;
		}
		
		long count = 0;
		
		// Make string lowercase and trim
		input = input.toLowerCase().trim();
		
		// Iterate though the string
		for(char c : input.toCharArray()) {
			if(c == vowel) count++;
		}
		
		return count;
	}
}
