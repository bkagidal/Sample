package com.lab.pc.linkedlists;

public class StackArray<T> {

	T[] elements;
	int capacity;
	int top = 0;

	public StackArray(int cap) {

		this.capacity = cap;
		elements = (T[]) (new Object[cap]);
	}

	public void push(T data) {

		if (!isFull())
			this.elements[top++] = data;
		else
			System.out.println("Stack is Full");

	}

	public T peek() {

		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}

		return elements[top];

	}

	public T pop() {

		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}

		T ele = elements[top];

		elements[top] = null;
		top--;
		return ele;
	}

	public boolean isFull() {
		return top == capacity;
	}

	public boolean isEmpty() {

		return top == 0;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (int i = top - 1; i >= 0; i--)
			sb.append(elements[i] + ",");

		return (sb.toString().length() > 0) ? sb.toString().substring(0, sb.toString().length() - 1) : " ";
	}

	public static void main(String[] args) {

		StackArray<Integer> stack = new StackArray<>(5);

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println(stack);

		stack.pop();
		System.out.println(stack);

		stack.pop();
		System.out.println(stack);

		stack.pop();
		System.out.println(stack);

		stack.pop();
		System.out.println(stack);

	}

}
