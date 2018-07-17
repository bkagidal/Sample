package com.lab.pc.linkedlists;

public class DetectCycle {

	public void print(ListNode head) {

		ListNode temp = head;

		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
	
	public boolean isCycleExists(ListNode head){
		
		ListNode slow=head,fast = head;
		
		while(fast != null && fast.next != null ){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {

		DetectCycle sol = new DetectCycle();
		ListNode head = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		
		head.next = two;
		two.next = three;
		three.next = four;
		four.next = head;
		
		
		
		if(sol.isCycleExists(head))
			System.out.println("Cycle detected");
		else
			System.out.println("No Cycle detected");
		
		
	}

}
