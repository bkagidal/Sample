package com.lab.stacks;

public class StackInt {
	
	int a[];
	int top;
	
	public StackInt(){
		a = new int[20];
		top = -1;
	}
	
	public boolean isEmpty(){
		return top ==-1;
	}
	
	public void push(int ch){
		top = top+1;
		a[top]=ch;
	}
	
	public int pop(){
		int val=0;
		
		if(!isEmpty()){	
			
			  val = a[top];
			 top--;
			 
		}
		 return val;
	}
	
	public int peek(){
		int ch = -1;
		if(isEmpty()){
			
			System.out.println("Stack is Empty");
			return ch;
		}
		
		return a[top];
	}
	public void display(){
		
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return;
		}
		for(int i=0;i<top;i++)
			System.out.println(a[i]);
	}

}
