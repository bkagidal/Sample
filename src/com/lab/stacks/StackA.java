package com.lab.stacks;

public class StackA {
	
	char a[];
	int top;
	
	public StackA(){
		a = new char[20];
		top = -1;
	}
	
	public boolean isEmpty(){
		return top ==-1;
	}
	
	public void push(char ch){
		top = top+1;
		a[top]=ch;
	}
	
	public char pop(){
		
		char ch = ' ';
		if(isEmpty()){
			
			System.out.println("Stack is Empty");
			return ch;
		}
		
		
		 ch = a[top];
		 top--;
		 
		 return ch;
	}
	
	public char peek(){
		char ch = ' ';
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
