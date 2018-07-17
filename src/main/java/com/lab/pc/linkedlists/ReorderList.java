package com.lab.pc.linkedlists;


public class ReorderList {
	
	
	/*
	 * 1. Break the list into 2 Halfs
	 * 2. reverse the second list
	 * 3. merge the two list to re order
	 */
	public void reOrderList(ListNode root){
		
		ListNode fast=root,slow = root;
		
		/*print(root);
		System.out.println("\n");
		*/
		
		while(fast != null && fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		ListNode second = slow.next;
		slow.next = null;
		
		/*print(root);
		System.out.println("\n");
		print(second);
		
		System.out.println("\n");
		*/
		second=reverseList(second);
		
		//print(second);
		
		ListNode p1 = root;
		ListNode p2 = second;
		
		
		while(p2 != null){
			
			ListNode temp1 = p1.next;
			ListNode temp2 = p2.next;
			
			p1.next = p2;
			p2.next = temp1;
			
			p1=temp1;
			p2 = temp2;
			
		}
		
		
	}
	
	public ListNode reverseList(ListNode head){
		
		ListNode cur ,prev,next;
		
		cur = head;
		prev = null;
		next = null;
		
		while(cur != null){
			
			next = cur.next;
			cur.next = prev;
			prev= cur;
			cur = next;
			
		}
		
		/*System.out.println("\n");
		print(prev);
		*/		
		return prev;
	}
	public void print(ListNode head) {

		ListNode temp = head;

		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		ReorderList ro = new ReorderList();
		
		ListNode list = new ListNode(1);
		
		/*list.next = new ListNode(2);
		list.next.next = new ListNode(3);
		list.next.next.next = new ListNode(4);
		list.next.next.next.next = new ListNode(5);*/
		
		list.add(list, 2);
		list.add(list, 3);
		list.add(list, 4);
		list.add(list, 5);
		list.add(list, 6);
		
		ro.print(list);
		
		ro.reOrderList(list);
		
		
		System.out.println("\n");
		ro.print(list);
	}

}
