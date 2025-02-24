package ch.fhnw.algd1.converters.binary;

public class BinConverter {
	public static String toString(int x) {
		String bitValue = "";

		while (x != 0) {
			if (x % 2 == 0) { // If is divisible by 2 then add 0 else add 1
				bitValue = "0" + bitValue;
			} else {
				bitValue = "1" + bitValue;
			}
			x = x / 2;
		}

		//fill in leading zeros
		while (bitValue.length() < 8) {
			bitValue = "0" + bitValue;
		}

		return bitValue;
	}

	public static int fromString(String text) {
		int intValue = 0;
		int text_length = text.length();
		int text_pos;

		// cleaner version
		// for (int i = 0; i < text.length(); i++) {
		// 	intValue = intValue * 2 + (text.charAt(i) - '0'); clean solution
		// }

		for (int i = 0; i < text.length(); i++) {
			text_pos = text_length - i - 1;
			if (text.charAt(i) == '1') {
				intValue |= (1 << text_pos);
			}
		}
	
		return intValue;
	}
}