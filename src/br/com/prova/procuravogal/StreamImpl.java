package br.com.prova.procuravogal;

/**
 * An implementation of the {@link Stream} interface.
 *
 * @author lucasandrade
 */
public class StreamImpl implements Stream {
	private int index;
	private String value;

	/**
	 * The class constructor.
	 *
	 * @param value the value to be set.
	 */
	public StreamImpl(String value) {
		this.value = value;
		this.index = 0;
	}

	/**
	 * Gets the value set in the constructor.
	 *
	 * @return the value set previously.
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 * Gets the current letter.
	 *
	 * @return the current letter
	 */
	public char getCurrent() {
		return value.charAt(index);
	}

	/**
	 * Increments the position of the current letter.
	 */
	public void increment() {
		index++;
	}

	/**
	 * Gets the letter of the previous position.
	 *
	 * @return the previous letter
	 */
	public char getPrevious() {
		return index > 0 ? value.charAt(index - 1) : 0;
	}

	/**
	 * Gets the letter of two positions behind.
	 *
	 * @return the two positions behind letter
	 */
	public char getPreviousOfPrevious() {
		return index > 1 ? value.charAt(index - 2) : 0;
	}

	@Override
	public char getNext() {
		return index + 1 == value.length() ? 0 : value.charAt(index + 1);
	}

	@Override
	public boolean hasNext() {
		return index < value.length() - 1;
	}
}