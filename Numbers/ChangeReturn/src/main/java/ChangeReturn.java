import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class ChangeReturn {

	private static final BigDecimal BD100 = new BigDecimal(100);
	private static final BigDecimal BD50 = new BigDecimal(50);
	private static final BigDecimal BD25 = new BigDecimal(25);
	private static final BigDecimal BD20 = new BigDecimal(20);
	private static final BigDecimal BD10 = new BigDecimal(10);
	private static final BigDecimal BD5 = new BigDecimal(5);
	private static final BigDecimal BD1 = new BigDecimal(1);

	public static void main(String args[]) {

		System.out.println("What is the Cost?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cost = "";
		try {
			cost = br.readLine();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("What is the amount given?");
		String given = "";
		try {
			given = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (given.isEmpty()) {
			System.out.println("Not enough money!");
			System.exit(1);
		}

		BigDecimal bdCost = new BigDecimal(cost);
		BigDecimal bdGiven = new BigDecimal(given);

		if (bdCost.compareTo(bdGiven) > 0) {
			System.out.println("Not enough money!");
			System.exit(1);
		}

		BigDecimal change = bdGiven.subtract(bdCost);
		String totalChange = change.toString();

		StringBuilder sb = new StringBuilder();
		if (change.compareTo(BD100) >= 0) {
			BigDecimal hundreds = change.divide(BD100, BigDecimal.ROUND_DOWN).setScale(0, BigDecimal.ROUND_DOWN);
			sb.append(hundreds).append(" 100 dollar bill(s)\n");
			change = change.remainder(BD100);
		}
		if (change.compareTo(BD50) >= 0) {
			BigDecimal fiftys = change.divide(BD50, BigDecimal.ROUND_DOWN).setScale(0, BigDecimal.ROUND_DOWN);
			sb.append(fiftys).append(" 50 dollar bill(s)\n");
			change = change.remainder(BD50);
		}
		if (change.compareTo(BD20) >= 0) {
			BigDecimal twenties = change.divide(BD20, BigDecimal.ROUND_DOWN).setScale(0, BigDecimal.ROUND_DOWN);
			sb.append(twenties).append(" 20 dollar bill(s)\n");
			change = change.remainder(BD20);
		}
		if (change.compareTo(BD10) >= 0) {
			BigDecimal tens = change.divide(BD10, BigDecimal.ROUND_DOWN).setScale(0, BigDecimal.ROUND_DOWN);
			sb.append(tens).append(" 10 dollar bill(s)\n");
			change = change.remainder(BD10);
		}
		if (change.compareTo(BD5) >= 0) {
			BigDecimal fives = change.divide(BD5, BigDecimal.ROUND_DOWN).setScale(0, BigDecimal.ROUND_DOWN);
			sb.append(fives).append(" 5 dollar bill(s)\n");
			change = change.remainder(BD5);
		}
		if(change.compareTo(BD1) >= 0 ) {
			BigDecimal ones = change.setScale(0, BigDecimal.ROUND_DOWN).setScale(0, BigDecimal.ROUND_DOWN);
			sb.append(ones).append(" 1 dollar bill(s)\n");
			change = change.remainder(BD1);
		}
		
		// Cents
		BigDecimal cents = change.multiply(BD100);
		if(cents.compareTo(BD25) >= 0) {
			BigDecimal twentyFiveCents = cents.divide(BD25, BigDecimal.ROUND_DOWN).setScale(0, BigDecimal.ROUND_DOWN);
			sb.append(twentyFiveCents).append(" Quarter(s)\n");
			cents = cents.remainder(BD25);
		}
		if (cents.compareTo(BD10) >= 0) {
			BigDecimal tens = cents.divide(BD10, BigDecimal.ROUND_DOWN).setScale(0, BigDecimal.ROUND_DOWN);
			sb.append(tens).append(" Dime(s)\n");
			cents = cents.remainder(BD10);
		}
		if (cents.compareTo(BD5) >= 0) {
			BigDecimal fives = cents.divide(BD5, BigDecimal.ROUND_DOWN).setScale(0, BigDecimal.ROUND_DOWN);
			sb.append(fives).append(" Nickle(s)\n");
			cents = cents.remainder(BD5);
		}
		if(cents.compareTo(BD1) >= 0 ) {
			BigDecimal ones = cents.setScale(0, BigDecimal.ROUND_DOWN);
			sb.append(ones).append(" Penny(s)\n");
			cents = cents.remainder(BD1);
		}
		System.out.println("Change: " + totalChange);
		System.out.println(sb.toString());
	}
}
