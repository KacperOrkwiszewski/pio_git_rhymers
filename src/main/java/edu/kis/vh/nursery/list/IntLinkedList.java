package edu.kis.vh.nursery.list;

/**
 *
 */
public class IntLinkedList {

	private static class Node {

		private final int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			value = i;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	private static final int RETURN_VALUE_IF_EMPTY = -1;

	private Node last;
	private int i;

	public static int getReturnValueIfEmpty() {
		return RETURN_VALUE_IF_EMPTY;
	}

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return RETURN_VALUE_IF_EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return RETURN_VALUE_IF_EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public int getI() {
		return i;
	}
	
}
