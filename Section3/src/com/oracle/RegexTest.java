package com.oracle;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args) {
		String kalimat = "saya makan. saya mandi. saya tidur. saya berjalan.";
		String [] kata = kalimat.split("\\.");
		for (String string : kata) {
			System.out.println(string.trim());
		}
		
		StringTokenizer token = new StringTokenizer(kalimat, "\\.");
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		Pattern p = Pattern.compile("\\.");
		Matcher m = p.matcher(kalimat);
	}
}
