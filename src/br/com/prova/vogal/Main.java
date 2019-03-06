package br.com.prova.vogal;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		StreamImpl impl = new StreamImpl("aAbBABacafe");

		while (impl.hasNext()) {
			System.out.println(impl.getCurrent() + " is a vowel? " + isVowel(impl.getCurrent()));
			System.out.println(impl.getCurrent() + " is a consonant? " + isConsonant(impl.getCurrent()));

			if (isVowel(impl.getCurrent()) && vowelAppearsJustOnce(impl.getValue(), impl.getCurrent())) {
				System.out.println("vogal não se repete");
				
				if (isConsonant(impl.getBefore())){
					
					if(isVowel(impl.getBeforeBefore())) {
						System.out.println("RESULTADO: " + impl.getCurrent());
						System.exit(1);
					}
				}
				
			}

			impl.increment();

			System.out.println("------------------------------------------");
		}

		System.out.println(impl.getLast() + " is a vowel? " + isVowel(impl.getLast()));
		System.out.println(impl.getLast() + " is a consonant? " + isConsonant(impl.getLast()));

		if (isVowel(impl.getCurrent()) && vowelAppearsJustOnce(impl.getValue(), impl.getCurrent())) {
			System.out.println("vogal não se repete");
			
			if (isConsonant(impl.getBefore())){
				
				if(isVowel(impl.getBeforeBefore())) {
					System.out.println("RESULTADO: " + impl.getCurrent());
					System.exit(1);
				}
			}
			
		}
		
		System.out.println("Não foi encontrado nenhum caso");
	}

	private static boolean isVowel(char letter) {
		if(letter == 0) {
			return false;
		}
		
		return Arrays.asList("a", "e", "i", "o", "u").contains(String.valueOf(letter));
	}

	private static boolean isConsonant(char letter) {
		
		if(letter == 0) {
			return false;
		}
		
		List<String> consoantes = Arrays.asList("b", "c", "d", "f", "g", "j", "k", "l", "m", "n", "p", "q", "r", "s",
				"t", "v", "w", "x", "z");

		return consoantes.contains(String.valueOf(letter));
	}

	private static boolean vowelAppearsJustOnce(String value, char vowel) {
		return value.chars().filter(n -> n == vowel).count() == 1;
	}
}