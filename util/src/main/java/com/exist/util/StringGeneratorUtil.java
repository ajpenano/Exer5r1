package com.exist.util;

public class StringGeneratorUtil {
	public static String getString(int n) {
		StringBuilder stringBuilder = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int asciiCode;
			do {
				asciiCode = (int) (127*Math.random());
			} while ((asciiCode < 33) || (asciiCode == 58));
			stringBuilder.append((char) asciiCode);
		}
		return stringBuilder.toString();
	}	
}