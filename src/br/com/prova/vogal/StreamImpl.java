package br.com.prova.vogal;

public class StreamImpl implements Stream {

	private int index;
	private String value;

	public StreamImpl(String value) {
		this.value = value;
		this.index = 0;
	}

	public char getCurrent() {
		return value.charAt(index);
	}

	public void increment() {
		index++;
	}

	public char getLast() {
		return value.charAt(value.length() - 1);
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