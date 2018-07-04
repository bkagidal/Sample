package com.lab.stacks;

public class Stack<T> {

	T[] stack;
	int noOfItems;

	@SuppressWarnings("unchecked")
	public Stack() {
		stack = (T[]) new Object[1];

	}

	public boolean isEmpty() {
		return noOfItems == 0;
	}

	public void push(T data) {
		stack[noOfItems++] = data;

		if (noOfItems == stack.length)
			resize(2 * stack.length);
	}

	public T pop() {

		if (isEmpty())
			return null;
		T data = stack[--noOfItems];

		if (noOfItems > 0 && noOfItems < stack.length / 4)
			resize(stack.length / 2);

		return data;
	}

	private void resize(int capacity) {
		
		System.out.println("Size from "+stack.length+" To "+capacity);

		@SuppressWarnings("unchecked")
		T[] tempSTack = (T[]) new Object[capacity];

		for (int i = 0; i < stack.length; i++)
			tempSTack[i] = stack[i];

		stack = tempSTack;
	}

}
