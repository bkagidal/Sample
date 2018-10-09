package com.lab.pc.linkedlists;

public class PartitionList {

	public static void print(ListNode head) {

		ListNode temp = head;

		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	private static ListNode partion(ListNode head, int x) {

		ListNode dummy = new ListNode(0);
		ListNode dummy1 = new ListNode(0);
		
		ListNode cur = head;
		ListNode cur1 = dummy;
		ListNode cur2 = dummy1;
		
		
		while(cur != null){
			
			if(cur.val <= x){
				cur1.next =cur;
				cur1 = cur1.next;
			}else{
				cur2.next =cur;
				cur2 = cur2.next;
			}
			
			cur = cur.next;
				
		}
		
		cur2.next = null;
		
		cur1.next = dummy1.next;
		
		return dummy.next;
		
	}

	public static void main(String[] args) {

		ListNode one = new ListNode(1);
		ListNode two = new ListNode(6);
		ListNode three = new ListNode(5);
		ListNode four = new ListNode(3);
		ListNode five = new ListNode(8);
		ListNode six = new ListNode(4);
		ListNode seven = new ListNode(4);

		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;

		print(one);
		
		ListNode par = partion(one, 5);
		
		System.out.println("\n Partion :");
		
		print(par);

	}

}
