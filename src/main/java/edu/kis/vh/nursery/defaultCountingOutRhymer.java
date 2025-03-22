package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
	private static final int SIZE = 12;
    private static final int EMPTY_INDEX = -1;

	private int[] numbers = new int[SIZE];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_INDEX;
	}

	public boolean isFull() {
		return total == SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
