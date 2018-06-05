package com.ng.learning.ds.linkedList;

public class DoubleyLinkedList {

	private Node header;
	private Node trailer;

	public void addAtBegin(int data) {
		Node newNode = new Node(data);
		if (header == null && trailer == null) {
			trailer = header = newNode;
		} else {
			Node current = header;
			newNode.next = current;
			current.prev = newNode;
			header = newNode;
		}
	}

	public void addAtEnd(int data) {

		Node newNode = new Node(data);
		if (header == null && trailer == null) {
			header = trailer = newNode;
		} else {
			Node current = trailer;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
			trailer = newNode;
		}
	}

	public void addAtIndex(int data, int index) {
		int size = length();

		Node newNode = new Node(data);
		if ((index > size) || (index < 0)) {
			System.out.println("Invalid index");
			return;
		}
		if (header == null && trailer == null) {
			header = trailer = newNode;
		}
		if (index == 0) {
			Node current = header;
			newNode.next = current;
			current.prev = newNode;
			header = newNode;
		} else if (index == size) {
			Node last = trailer;
			last.next = newNode;
			newNode.prev = last;
			trailer = newNode;
		} else {
			Node current = header;
			int count = 0;
			while (count++ < index - 1) {
				current = current.next;
			}
			Node temp = current.next;
			current.next = newNode;
			newNode.prev = current;
			newNode.next = temp;
			temp.prev = newNode;
		}

	}

	public int deleteAtBegin() {
		if (header == null && trailer == null) {
			return -1;
		}
		Node current = header;
		Node temp = current.next;
		temp.prev = null;
		header = temp;
		return current.data;
	}

	public int deleteAtEnd() {

		if (header == null && trailer == null) {
			return -1;
		}
		Node last = trailer;
		Node temp = last.prev;
		temp.next = null;
		trailer = temp;
		return last.data;
	}

	public int deleteAtIndex(int index) {
		Node temp1 = null;
		int size = length();
		if (index > size || index < 0) {
			System.out.println("Invalid Position");
			return -1;
		}

		if (index == 0) {
			temp1 = header;
			Node temp = header.next;
			temp.prev = null;
			header = temp;
		} else if (index == size) {
			Node last = trailer.prev;
			temp1 = trailer;
			last.next = null;
			trailer = last;

		} else {
			Node current = header;
			int count = 0;
			while (count++ < index - 1) {
				current = current.next;
			}
			Node temp = current.next.next;
			temp1 = current.next;
			current.next = temp;
			temp.prev = current;
		}
		return temp1.data;
	}

	public void remove(int data) {
		Node current = header;
		while ((current.data) != data) {
			current = current.next;
		}
		if (current == header) {
			Node temp = current.next;
			temp.prev = null;
			header = temp;
		} else if (current == trailer) {
			Node temp = current.prev;
			temp.next = null;
			trailer = temp;
		} else {
			Node previous = current.prev;
			Node next = current.next;
			previous.next = next;
			next.prev = previous;
		}

	}

	public int searchFirstIndex(int data) {
		Node current = header;
		int count = 0;
		while ((current.data) != data) {
			current = current.next;
			count++;
		}
		return count;
	}

	public void addAtMiddle(int data) {
		int size = length();
		int position = size / 2;
		Node current = header;
		Node newNode = new Node(data);
		int count = 0;
		while (count++ < position) {
			current = current.next;
		}
		Node temp = current.prev;
		temp.next = newNode;
		newNode.prev = temp;
		newNode.next = current;
		current.prev = newNode;
	}

	public void deleteAtMiddle() {
		int size = length();
		int position = size / 2;
		Node current = header;
		int count = 0;
		while (count++ < position - 1) {
			current = current.next;
		}
		Node temp = current.next.next;
		current.next = temp;
		temp.prev = current;
	}

	public void reverse() {
		Node temp = null;
		Node current = header;

		/*
		 * swap next and prev for all nodes of doubly linked list
		 */
		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}

		/*
		 * Before changing header, check for the cases like empty list and list with
		 * only one node
		 */
		if (temp != null) {
			header = temp.prev;
		}
	}

	public int GetNodeFromLast(int n) {
		Node last = trailer;
		int count = 0;
		while (count++ < n) {
			last = last.prev;
		}
		return last.data;
	}

	public void sortedInsert(int data) {
		/* Create Node to insert */
		Node newNode = new Node(data);

		if (header == null && trailer == null) { // insert in empty list
			header = trailer = newNode;
		} else if (data < header.data) { // insert in front of list
			newNode.next = header;
			header.prev = newNode;
			header = newNode;
		} else {
			/* Walk list with 2 pointers */
			Node n1 = null;
			Node n2 = header;
			while (n2 != null && n2.data < data) {
				n1 = n2;
				n2 = n2.next;
			}

			if (n2 == null) { // insert at end of list
				n1.next = newNode;
				newNode.prev = n1;
				trailer = newNode;
			} else { // insert in empty list
				n1.next = newNode;
				n2.prev = newNode;
				newNode.prev = n1;
				newNode.next = n2;
			}
		}
	}

	public void display() {
		Node current = header;
		System.out.println("Traverse in Forward Direction");
		System.out.print("[");
		while (current != null) {
			System.out.print(current.data + "--->");
			current = current.next;
		}
		System.out.print(current);
		System.out.print("]");
		System.out.println();
		System.out.println("Traverse in Backward Direction");
		System.out.print("[");
		Node last = trailer;
		while (last != null) {
			System.out.print(last.data + "<---");
			last = last.prev;
		}
		System.out.print(last);
		System.out.print("]");
		System.out.println();
	}

	public int length() {
		Node current = header;
		if (header == null && trailer == null)
			return -1;
		int count = 0;
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

}