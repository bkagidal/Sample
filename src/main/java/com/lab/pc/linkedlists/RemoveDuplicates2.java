package com.lab.pc.linkedlists;

public class RemoveDuplicates2 {

	public static void print(ListNode head) {

		ListNode temp = head;

		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(2);
		ListNode four = new ListNode(3);
		ListNode five = new ListNode(4);
		
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		
		print(one);
		
		ListNode res = removeDups(one);
		
		System.out.println("\n");
		print(res);
	}


	private static ListNode removeDups(ListNode head) {
		
		ListNode dummy = new ListNode(0);
		
		dummy.next = head;
		
		ListNode cur = head,prev = dummy;
		
		while(cur != null && cur.next != null){
			
			if(cur.val != cur.next.val){
				prev =cur;
				cur = cur.next;
			}else{
				
				while(cur.next != null && cur.val == cur.next.val) cur = cur.next;
				
				cur = cur.next;
				prev.next = cur;
			}
			
		}
		
		return dummy.next;
		
	}	

}
