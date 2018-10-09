package com.lab.pc.linkedlists;

public class SwapNodePairs {
	
	public static void print(ListNode head) {

		ListNode temp = head;
		
		System.out.println("\n");
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}


	public static void main(String[] args) {
		
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		ListNode six = new ListNode(6);
		
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		
		print(one);
		
		ListNode res=swap(one);
		
		print(res);

	}


	private static ListNode swap(ListNode head) {
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		
		ListNode cur = head,prev = null,next = null;
		
		while(cur != null){
			
			next = cur.next;
			if(prev == null){
				cur.next = next.next;
				next.next = cur;
				prev = cur;
				dummy.next = next;
				
			}else if(cur.next != null){
				
				prev.next = next;
				cur.next = next.next;
				next.next = cur;
				prev = cur;
			}
			
			cur = cur.next;
		}
		
		return dummy.next;
	}
	
	

}
