package fa.training.util;

import java.util.regex.Pattern;

public class Validator {
	/**
	 * 3. * Check bill code follow the pattern. 4. * 5. * @method isValidBillCode 6.
	 * * @param billCode 7. * @return true if bill code is valid, else false 8.
	 */
	public static boolean isValidBillCode(String billCode) {
		return Pattern.matches("^(B)[0-9]{4}$", billCode);
	}
}
