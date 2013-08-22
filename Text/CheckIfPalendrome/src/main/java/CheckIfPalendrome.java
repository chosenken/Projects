public class CheckIfPalendrome {

	public static void main(String args[]) {
		if (args.length != 1) {
			System.out.println("Usage:  CheckIfPalendrome <String>");
			System.exit(1);
		}
		System.out.println(checkPalendrome(args[0]) ? "Its a Palendrome!"
				: "Not a Palendrome!");
	}

	public static boolean checkPalendrome(String input) {
		if (input == null || input.isEmpty()) {
			return false;
		}

		// Lowercase input and trim
		input = input.toLowerCase().trim();

		// Create character array, then iterate through to get only characters
		char[] inputData = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < inputData.length; i++) {
			if (inputData[i] >= 97 & inputData[i] <= 122) {
				sb.append(inputData[i]);
			}
		}
		String orig = sb.toString();
		String rev = sb.reverse().toString();

		return orig.equals(rev);
	}

}
