package com.lab.pc.linkedlists;

public class AddTwoNumbers {

	public static ListNode getStart() {
		return start;
	}

	private static ListNode start = null;
	
	private static class ListNode {

		 int val;
		 ListNode next;

		public ListNode(int val) {
			this.val = val;
			next = null;
		}
	}

	public void add(int val){
		
		if(start == null)
			start = new ListNode(val);
		else{
			ListNode temp = start;
			
			while(temp.next != null)
				temp = temp.next;
			
			temp.next = new ListNode(val);
		}
	}

	public ListNode addNumbers(ListNode list1, ListNode list2) {

		int cary = 0;

		ListNode sumlist = new ListNode(0);

		ListNode temp = sumlist;

		while (list1 != null || list2 != null) {

			int val1 = (list1 != null) ? list1.val : 0;
			int val2 = (list2 != null) ? list2.val : 0;

			int sum = val1 + val2 + cary;

			if (sum > 10)
				cary = sum / 10;

			 temp.next = new ListNode(sum % 10);

			temp = temp.next;
			
			list1= (list1!=null)?list1.next :null;
			list2= (list2!=null)?list2.next :null;
			
		}

		if (cary > 0)
			temp.next = new ListNode(cary);

		return sumlist.next;
	}

	
	public void print() {
		ListNode temp = start;

		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		 AddTwoNumbers list1 = new AddTwoNumbers();
		 AddTwoNumbers list2 = new AddTwoNumbers();
		 AddTwoNumbers list3 = new AddTwoNumbers();

		 
		ListNode head = new ListNode(5); 
		list1.add(5);
		list1.add(6);
		list1.add(7);

		list1.print();

		System.out.println();

		list2.add(1);
		list2.add(2);
		list2.add(3);

		list2.print();
		

		list3.addNumbers(list1.getStart(), list2.getStart());
		System.out.println("\n-----");
		list3.print();
	}

}
