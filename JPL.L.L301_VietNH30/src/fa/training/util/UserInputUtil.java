package fa.training.util;

import java.util.Scanner;

public class UserInputUtil {
	/**
	 * 19. * Get value type integer from console. 20. * 21. * @method inputTypeInt
	 * 22. * @param value 23.
	 */
	public static int inputTypeInt(String value) {
		int intValue = 0;
		do {
			try {
				intValue = Integer.parseInt(value);
			} catch (Exception e) {
				System.out.println("Please input int value!");
			}
			break;
		} while (true);
		return intValue;
	}

	/**
	 * 38. * Get value type float from console. 39. * 40. * @method inputTypeFloat
	 * 41. * @param value 42.
	 */
	public static float inputTypeFloat(String value) {
		float floatValue = 0;
		do {
			try {
				floatValue = Float.parseFloat(value);
			} catch (Exception e) {
				System.out.println("Please input float value!");
			}
			break;
		} while (true);
		return floatValue;
	}

	/**
	 * 57. * Get value type double from console. 58. * 59. * @method inputTypeDouble
	 * 60. * @param value 61.
	 */
	public static double inputTypeDouble(String value) {
		double doubleValue = 0;
		do {
			try {
				doubleValue = Double.parseDouble(value);
			} catch (Exception e) {
				System.out.println("Please input double value!");
			}
			break;
		} while (true);
		return doubleValue;
	}

	/**
	 * 76. * Get a valid bill code from console. 77. * 78. * @method checkBillCode
	 * 79. * @param scanner 80. * @return 81.
	 */
	public static String checkBillCode(Scanner scanner) {
		String billCode;
		System.out.println("Enter bill code:");
		billCode = scanner.nextLine();
		while (!Validator.isValidBillCode(billCode)) {
			System.out.println("Invalid bill code: (example: B0000)");
			billCode = scanner.nextLine();
		}
		return billCode;
	}
}
