package com.lab.pc.linkedlists;

import java.util.HashMap;
import java.util.Map;

class Node {

	int key;
	int val;
	Node next;
	Node prev;

	public Node(int key, int val) {

		this.key = key;
		this.val = val;

	}

}

public class LRCCache {

	int cap;
	Map<Integer, Node> map = new HashMap<Integer, Node>();
	Node head = null;
	Node end = null;

	public LRCCache(int cap) {
		this.cap = cap;
	}

	public void set(int key, int value) {

		if (map.containsKey(key)) {

			Node old = map.get(key);
			old.val = value;
			delete(old);
			setHead(old);
		} else {

			Node newNode = new Node(key, value);

			if (map.size() >= cap) {

				map.remove(end.key);
				delete(end);
				setHead(newNode);
			} else
				setHead(newNode);

			map.put(key, newNode);
		}

	}

	private void delete(Node node) {

		if (node.prev != null) {
			node.prev.next = node.next;
		} else
			head = node.next;

		if (node.next != null)
			node.next.prev = node.prev;
		else
			end = node.prev;

	}

	private void setHead(Node node) {

		node.next = head;
		node.prev = null;

		if (head != null)
			head.prev = node;

		head = node;

		if (end == null)
			end = head;

	}

	public int get(int key) {

		if (map.containsKey(key)) {
			Node n = map.get(key);

			delete(n);
			setHead(n);
			return n.val;
		}

		return -1;
	}

	public static void main(String[] args) {

		LRCCache cache = new LRCCache(4);

		cache.set(1, 100);
		cache.set(10, 99);
		cache.set(15, 98);
		cache.set(10, 97);
		
		cache.set(12, 96);
		cache.set(18, 95);
		cache.set(1, 94);

		System.out.println(cache.get(1));
		System.out.println(cache.get(10));
		System.out.println(cache.get(15));
	}

}
