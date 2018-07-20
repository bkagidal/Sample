package com.lab.pc.linkedlists;


class RandomListNode {
	      int label;
	      RandomListNode next, random;
	      RandomListNode(int x) { 
	    	  this.label = x; 
	      }
}
	 
public class CopyList {

	public void print(RandomListNode head) {

		RandomListNode temp = head;
		System.out.println("\n");
		while (temp != null) {
			System.out.print(temp.label+ " ");
			temp = temp.next;
		}
	}
	
	
	public RandomListNode copy(ListNode head){
		
		return null;
		
	}
	
	public static void main(String[] args) {
		
		CopyList list = new CopyList();
		RandomListNode head = new RandomListNode(1);
		RandomListNode two = new RandomListNode(2);
		RandomListNode three = new RandomListNode(3);
		RandomListNode four = new RandomListNode(4);
		
		head.next = two;
		two.next = three;
		three.next = four;
		four.next = null;
		
		
		list.print(head);
		
		
	}

}
