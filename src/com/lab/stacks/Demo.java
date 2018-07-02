package com.lab.stacks;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Expression :");
		String expr = scan.nextLine();
		String postfix = covertToPostfix(expr);
		System.out.println(postfix);
		System.out.println(evaluate(postfix));
		scan.close();
	}
	
	
	private static void isValid(String expr){
		StackA stack = new StackA();
		char ch ;
		char pop;
		
		for(int i=0;i<expr.length();i++){
			ch = expr.charAt(i);
			
			if(ch =='(' || ch == '[' || ch =='{')
				stack.push(ch);
			else if(ch ==')' || ch == ']' || ch =='}'){
				
				if(stack.isEmpty()){
					System.out.println("Invalid Expression");
					System.out.println("Right paranthesis is more than the left paranthesis");
					return;
				}
				pop = stack.pop();
				
				if(!matchParanthesis(ch,pop)){
					System.out.println("Mismatch of paranthesis\n");
					System.out.println(pop +" and "+ch);
					return;
				}
			}
			
		}
		
		if(stack.isEmpty())
			System.out.println("Balanced Valid Expression.");
		else{
			System.out.println("Invalid Expression.");
			System.out.println("Left Paranthesis are more than Right Paranthis");
		}
			//System.out.println(expr.charAt(i));
		
	}
	
	public static boolean matchParanthesis(char ch,char pop){
		
		if(ch ==')' && pop =='(')
			return true;
		if(ch ==']' && pop =='[')
			return true;
		if(ch =='}' && pop =='{')
			return true;
		return false;
		
	}
	
	
	private static String covertToPostfix(String str){
		
		StringBuilder builder = new StringBuilder();
		char ch,next;
		StackA st = new StackA();
		/*
		for(int i=0;i<str.length();i++){
			ch = str.charAt(i);
			
			if(isDigit(ch))
				builder.append(ch);
			else if(ch == '(' ||ch == '[' ||ch == '{')
				st.push(ch);
			else if(isOperator(ch)){
				
				while(!st.isEmpty() && (precedence(st.peek())>=precedence(ch)))
					builder.append(st.pop());
				
				st.push(ch);
			}
			else if(ch == ')' ||ch == ']' ||ch == '}'){
				do{
					builder.append(st.pop());
				}
				while((ch == '(' ||ch == '[' ||ch == '{') && !st.isEmpty());
				st.pop();
			}
		}
		
		while(!st.isEmpty())
			builder.append(st.pop());*/
		
		
		for(int i=0;i<str.length();i++){
			
			ch = str.charAt(i);
			switch(ch){
				
			case '(':
					st.push(ch);
					break;
			case ')':
				while((next=st.pop())!='(')
					builder.append(next);
				break;
			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
				while(!st.isEmpty() && (precedence(st.peek())>=precedence(ch)))
						builder.append(st.pop());
				st.push(ch);
				break;
				
			default:
				builder.append(ch);
				
			}
		}
		
		while(!st.isEmpty())
			builder.append(st.pop());
		
		return builder.toString();
		
	}
	
	public static int precedence(char ch){
		
		switch(ch){
			case '^':
				return 3;
			case '\\':
			case '*':
				return 2;
			case '+':
			case '-':
				return 1;
			case '(':
				return 0;
			default : 
				return 0;
		}
	}
	
	public static boolean isDigit(char ch){
		
		switch(ch){
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				return true;
				//break;
			default:
				return false;
		}
	}

	public static boolean isOperator(char ch){
			
			switch(ch){
				case '+':
				case '-':
				case '/':
				case '*':
				case '^':
					return true;
					//break;
				default:
					return false;
			}
	}


public static int evaluate(String expr){
	
	StackInt st = new StackInt();
	
	for(int i=0;i<expr.length();i++){
		
		if(Character.isDigit(expr.charAt(i)))
			st.push(Character.getNumericValue(expr.charAt(i)));
		else{
			
			int x = st.pop();
			int y = st.pop();
			
			switch(expr.charAt(i)){
			
			case '+':
				st.push(y+x);
				break;
			case '-':
				st.push(y-x);
				break;
			case '*':
				st.push(y*x);
				break;
			case '/':
				st.push(y/x);
				break;
			case '^':
				st.push(power(y,x));
				break;
			default:
				
			}
		}
	}
	
	return st.pop();
}

public static int power(int y,int x){
	
	int val =1;
	for(int i=0;i<x;i++)
		val*=y;
	
	return val;
}


}

