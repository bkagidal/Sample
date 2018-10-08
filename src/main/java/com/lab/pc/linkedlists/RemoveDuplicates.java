package com.lab.pc.linkedlists;

public class RemoveDuplicates {

	public static void print(ListNode head) {

		ListNode temp = head;

		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(1);
		ListNode three = new ListNode(1);
		ListNode four = new ListNode(1);
		ListNode five = new ListNode(1);
		
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		
		print(one);
		
		removeDups(one);
		
		System.out.println("\n");
		print(one);
	}


	private static void removeDups(ListNode head) {

		ListNode cur = head,next = head.next;
		
		while(next != null){
			
			if(cur.val == next.val)
				cur.next = next.next;
			else
				cur =next;
			
			next = next.next;
		}
	}

}
