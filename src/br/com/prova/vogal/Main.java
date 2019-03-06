package br.com.prova.vogal;

import java.util.Arrays;
import java.util.List;

public class Main {

	private static final List<String> VOWELS = Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");
	private static final List<String> CONSONANTS = Arrays.asList("b", "c", "d", "f", "g", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z",
																 "B", "C", "D", "F", "G", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Z");

	public static void main(String[] args) {
		StreamImpl stream = new StreamImpl("aAbBABacafe");

		System.out.println("INPUT: " + stream.getValue());

		while (stream.hasNext()) {
			extracted(stream);
			stream.increment();
		}

		extracted(stream);

		System.out.println("INPUT: No occurrences were found.");
	}

	private static boolean isVowel(char letter) {
		return letter == 0 ? false : VOWELS.contains(String.valueOf(letter));
	}

	private static boolean isConsonant(char letter) {
		return letter == 0 ? false : CONSONANTS.contains(String.valueOf(letter));
	}

	private static boolean vowelAppearsJustOnce(StreamImpl stream) {
		return stream.getValue().chars().filter(n -> n == stream.getCurrent()).count() == 1;
	}

	private static void extracted(StreamImpl impl) {
		if (isVowel(impl.getCurrent()) && vowelAppearsJustOnce(impl) && isConsonant(impl.getBefore()) && isVowel(impl.getBeforeBefore())) {
			System.out.println("OUTPUT: " + impl.getCurrent());
			System.exit(1);
		}
	}
}