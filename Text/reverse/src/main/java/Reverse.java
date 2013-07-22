public class Reverse {
	public static void main(String args[]) {
		if (args.length != 1) {
			System.out.println("Usage:  Reverse <String>");
			System.exit(1);
		}

		String s = args[0];
		System.out.println("Input: " + s);
		System.out.println("Reverse by StringBuilder: "
				+ reverseStringBuilder(s));
		System.out.println("Reverse by Brute Force:   " + reverseBruteForce(s));
		System.exit(0);

	}

	public static String reverseStringBuilder(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

	public static String reverseBruteForce(String s) {
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = c.length - 1; i >= 0; i--) {
			sb.append(c[i]);
		}
		return sb.toString();
	}
}
