package br.com.prova.vogal;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		StreamImpl impl = new StreamImpl("aAbBABacafe");

		while (impl.hasNext()) {
			System.out.println(impl.getCurrent() + " é uma vogal? " + isVowel(impl.getCurrent()));
			System.out.println(impl.getCurrent() + " é uma consoante? " + isConsonant(impl.getCurrent()));
			impl.increment();

			System.out.println("------------------------------------------");
		}

		System.out.println(impl.getLast() + " é uma vogal? " + isVowel(impl.getLast()));
		System.out.println(impl.getLast() + " é uma consoante? " + isConsonant(impl.getLast()));
	}

	private static boolean isVowel(char letter) {
		return Arrays.asList("a", "e", "i", "o", "u").contains(String.valueOf(letter).toLowerCase());
	}

	private static boolean isConsonant(char letter) {
		List<String> consoantes = Arrays.asList("b", "c", "d", "f", "g", "j", "k", "l", "m", "n", "p", "q", "r", "s",
				"t", "v", "w", "x", "z");

		return consoantes.contains(String.valueOf(letter).toLowerCase());
	}
}