package com.lab.pc.linkedlists;

public class MinStack {

	Element top;
	int size = 0;

	public void push(int val) {

		if (top == null)
			top = new Element(val, val);
		else {

			Element ele = new Element(val, Math.min(val, top.min));

			ele.next = top;
			top = ele;
		}
		size++;
	}

	public Element pop() {

		if (size == 0) {
			System.out.println("Stack is Empty");
			return null;
		}

		Element ret = top;
		int min = top.min;
		if(top.next != null){
			top = top.next;
			top.min = min;
		}
		size--;
		return ret;
	}

	public int getMin() {

		return (size == 0) ? -1 : top.min;
	}

	public static void main(String[] args) {

		MinStack stack = new MinStack();

		stack.push(5);

		stack.push(7);

		stack.push(3);

		stack.push(4);

		System.out.println(stack.getMin());

		System.out.println("POP: " + stack.pop().val);

		System.out.println("POP: " + stack.pop().val);
		System.out.println("POP: " + stack.pop().val);
		System.out.println("POP: " + stack.pop().val);

		System.out.println(stack.getMin());

	}

}

class Element {
	int val;
	int min;
	Element next;

	public Element(int val, int min) {
		this.val = val;
		this.min = min;
		next = null;
	}
}