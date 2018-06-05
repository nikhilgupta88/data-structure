package com.ng.learning.ds.linkedList;

public class SinglyLinkedList {
	ListNode head; // head of the list

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;

		}
	}

	// Display Method
	public void display() {
		if (head == null) {
			return;

		}

		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " ---> ");
			current = current.next;
		}
		System.out.print(current);
	}

	public static void main(String args[]) {

		SinglyLinkedList linkedList = new SinglyLinkedList();

		linkedList.head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);

		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;

		linkedList.display();

	}

}
