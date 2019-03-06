package br.com.prova.procuravogal;

import java.util.Arrays;
import java.util.List;

/**
 * The main class responsible for running the application.
 *
 * @author lucasandrade
 */
public class Main {

	private static final List<String> VOWELS = Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");
	private static final List<String> CONSONANTS = Arrays.asList("b", "c", "d", "f", "g", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z",
																 "B", "C", "D", "F", "G", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Z");

	/**
	 * Executes the program and shows the output messages.
	 *
	 * @param args default parameter
	 */
	public static void main(String[] args) {
		StreamImpl stream = new StreamImpl("aAbBABacafe");

		System.out.println("INPUT: " + stream.getValue());

		while (stream.hasNext()) {
			checkCurrentLetter(stream);
			stream.increment();
		}

		checkCurrentLetter(stream);

		System.out.println("INPUT: No occurrences were found.");
	}

	/**
	 * Checks whether the letter parameter is a vowel.
	 *
	 * @param letter the letter to be checked
	 * @return true if it is a vowel, otherwise false
	 */
	private static boolean isVowel(char letter) {
		return letter == 0 ? false : VOWELS.contains(String.valueOf(letter));
	}

	/**
	 * Checks whether the letter parameter is a consonant.
	 *
	 * @param letter the letter to be checked
	 * @return true if it is a consonant, otherwise false
	 */
	private static boolean isConsonant(char letter) {
		return letter == 0 ? false : CONSONANTS.contains(String.valueOf(letter));
	}

	/**
	 * Checks whether the stream's current value appears just once in it.
	 *
	 * @param stream the stream object to be checked
	 * @return true if the stream's current doesn't repeat, otherwise false
	 */
	private static boolean doesVowelAppearsJustOnce(StreamImpl stream) {
		return stream.getValue().chars().filter(n -> n == stream.getCurrent()).count() == 1;
	}

	/**
	 * Checks the follow conditions regarding the stream's current value:
	 * - Is it a vowel?
	 * - If so, does it appear only once in the stream value?
	 * - If so, is the previous letter a consonant?
	 * - If so, is the previous of the previous letter a vowel?
	 * - If so, shows the output message and terminates the program
	 *
	 * @param stream the stream object to be evaluated
	 */
	private static void checkCurrentLetter(StreamImpl stream) {
		if (isVowel(stream.getCurrent()) && doesVowelAppearsJustOnce(stream) && isConsonant(stream.getPrevious()) && isVowel(stream.getPreviousOfPrevious())) {
			System.out.println("OUTPUT: " + stream.getCurrent());
			System.exit(1);
		}
	}
}