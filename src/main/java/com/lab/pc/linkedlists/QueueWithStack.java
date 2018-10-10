package com.lab.pc.linkedlists;

import java.util.Stack;

public class QueueWithStack {

	private Stack<Integer> temp;
	private Stack<Integer> value;

	public QueueWithStack() {
		temp = new Stack<>();
		value = new Stack<>();
	}

	public void enque(int val) {

		if (value.isEmpty())
			value.push(val);
		else {

			while (!value.isEmpty())
				temp.push(value.pop());

			value.push(val);

			while (!temp.isEmpty())
				value.push(temp.pop());
		}
	}

	public int deque() {

		return value.pop();
	}

	public static void main(String[] args) {

		QueueWithStack queue = new QueueWithStack();

		queue.enque(1);
		queue.enque(2);
		queue.enque(3);
		queue.enque(4);
		queue.enque(5);

		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.deque());
	}

}
