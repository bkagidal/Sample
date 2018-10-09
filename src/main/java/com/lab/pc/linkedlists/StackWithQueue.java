package com.lab.pc.linkedlists;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueue {

	Queue<Integer> queue1 = null;
	Queue<Integer> queue2 = null;
	Queue<Integer> temp = null;
	private int count =0;

	public StackWithQueue() {
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<>();
	}

	public void push(int val) {

		queue2.offer(val);

		while(!queue1.isEmpty()){
			queue2.offer(queue1.peek());
			queue1.remove();
		}

		temp = queue1;
		queue1 = queue2;
		queue2 = temp;
		
		count++;
	}
	
	
	public int size(){
		return count;
	}

	public int pop(){
		
		count--;
		
		return queue1.poll();
	}
	
	public int top(){
		
		if(!queue1.isEmpty())
			return queue1.peek();
		
		return -1;
	}

	public static void main(String[] args) {

		StackWithQueue stack = new StackWithQueue();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		
		System.out.println("Stack Size :"+stack.size());
		System.out.println(stack.pop());

		System.out.println(stack.pop());

		System.out.println(stack.pop());
		System.out.println("Stack Size :"+stack.size());

	}

}
