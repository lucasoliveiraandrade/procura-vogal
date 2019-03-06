package br.com.prova.procuravogal;

/**
 * Stream interface.
 *
 * @author lucasandrade
 */
public interface Stream {

	/**
	 * Gets the next letter.
	 *
	 * @return the next letter
	 */
	char getNext();

	/**
	 * Checks if the value has next position or not.
	 *
	 * @return true if the value has next position, otherwise false
	 */
	boolean hasNext();
}