package com.ng.learning.ds.linkedList;

import java.util.Stack;

/**
 * This class contains lots of implementation of linked list.
 * 
 * @author NikhilGupta
 *
 */
public class LinkedList {

	public Node head; // head of the list

	/**
	 * This method adds an element at Beginning of the Linked List.
	 * 
	 * @param data
	 *            value of that node
	 */
	public void addAtBegin(int data) {
		Node newNode = new Node(data);
		if (head == null) {

		}
		newNode.next = head;
		head = newNode;
	}

	/**
	 * This method adds an element at end of the Linked List.
	 * 
	 * @param data
	 *            value of that node
	 */
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		Node current = head;
		if (head == null) {
			head = newNode;
			return;
		} else {
			while (current.next != null) {
				current = current.next;
			}
		}
		current.next = newNode;
	}

	/**
	 * This Method adds an element into Linked List by Given index
	 * 
	 * @param data
	 *            value of that Node
	 * @param index
	 *            index where we want to add that node
	 */
	public void addAtIndex(int data, int index) {
		int size = length();
		if (index > size || index < 0) {
			System.out.println(" Invalid index. ");
			return;
		}
		Node newNode = new Node(data);
		if (index == 0) {
			newNode.next = head;
			head = newNode;
			return;
		} else {
			Node current = head;
			int count = 0;
			while (count < index - 1) {
				current = current.next;
				count++;
			}
			Node temp = current.next;
			current.next = newNode;
			newNode.next = temp;
			return;
		}
	}

	/**
	 * This method returns the value of the deleted node and deletes the node from
	 * the beginning of the Linked List.
	 * 
	 * @return value of the deleted Node
	 */
	public int deleteAtBegin() {
		Node current = head;
		if (head == null) {
			return 0;
		}
		head = current.next;
		return current.data;
	}

	/**
	 * This method returns the value of the deleted node and deletes the node from
	 * the end of the Linked List.
	 * 
	 * @return value of deleted Node
	 */
	public int deleteAtEnd() {
		if (head == null) {
			return 0;
		}

		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		int data = current.next.data;
		current.next = null;
		return data;

	}

	/**
	 * This Method returns the length of the linked List
	 * 
	 * @return length of the Linked List
	 */
	public int length() {
		if (head == null) {
			return 0;
		}
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	/**
	 * This method returns the value of the deleted node and deletes the node by the
	 * given index from the Linked List.
	 * 
	 * @param index
	 *            index of the Node which we want to delete
	 * @return value of the deleted Node
	 */
	public int deleteAtIndex(int index) {
		int size = length();
		if (index > size || index < 0) {
			System.out.println(" Invalid Postion. ");
			return 0;
		}
		if (index == 0) {
			Node temp = head;
			head = head.next;
			temp.next = null;
			return temp.data;
		} else {
			Node current = head;
			int count = 0;
			while (count < index - 1) {
				current = current.next;
				count++;
			}
			Node temp = current.next.next;
			Node temp1 = current.next;
			current.next = temp;
			return temp1.data;
		}
	}

	/**
	 * This Method returns the First index of that Node which first occurs in Given
	 * Linked List.
	 * 
	 * @param data
	 *            value of that Node
	 * @return first index of that no.
	 */
	public int searchFirstIndex(int data) {
		Node current = head;
		int count = 0;
		while ((current.data) != data) {
			current = current.next;
			count++;
		}
		return count;
	}

	/**
	 * This method reverses a Linked List Iteratively.
	 */
	public void reverse() {
		if (head == null) {
			return;
		}

		Node current = head, previous = null, next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;

		}
		head = previous;
	}

	/**
	 * This method prints the Linked List on the console.
	 */
	public void display() {
		if (head == null) {
			return;
		}

		Node current = head;
		System.out.print("[");
		while (current != null) {
			System.out.print(current.data + " ---> ");
			current = current.next;
		}
		System.out.print(current);
		System.out.print("]");
		System.out.println();
	}

	/**
	 * This method returns the element at given index in the Linked List.
	 * 
	 * @param index
	 * @return Element value of that node which is at given index.
	 */
	public int elementAt(int index) {
		Node current = head;
		int count = 0;
		while (current != null) {
			if (count == index)
				return current.data;
			count++;
			current = current.next;
		}
		return 0;
	}

	/**
	 * This method adds the node at the Middle of Linked List.
	 * 
	 * @param data
	 *            value of the node
	 */
	public void addAtMiddle(int data) {
		int size = length();
		int index = size / 2;
		Node current = head;
		Node newNode = new Node(data);
		int count = 0;
		while (count < index - 1) {
			current = current.next;
			count++;
		}
		Node temp = current.next;
		current.next = newNode;
		newNode.next = temp;
	}

	/**
	 * This method returns the value of the deleted node and deletes the node from
	 * Middle of the Linked List.
	 * 
	 * @return Node value of the delted node
	 */
	public int deleteAtMiddle() {
		int size = length();
		int index = size / 2;
		Node current = head;
		int count = 0;
		while (count < index - 1) {
			current = current.next;
			count++;
		}
		Node temp = current.next.next;
		Node temp1 = current.next;
		current.next = temp;
		return temp1.data;
	}

	/**
	 * This Method swaps two elements from Linked List by given indexes.
	 * 
	 * @param x
	 *            index from
	 * @param y
	 *            index to
	 */
	public void swapNodes(int x, int y) {
		if (x == y)
			return;

		Node prevX = null, currX = head;
		while (currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}

		Node prevY = null, currY = head;
		while (currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}
		if (currX == null || currY == null) {
			return;
		}
		if (prevX != null) {
			prevX.next = currY;
		} else {
			head = currY;
		}

		if (prevY != null) {
			prevY.next = currX;
		} else {
			head = currX;
		}
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}

	/**
	 * This Method removes adjacent duplicate nodes from Linked List
	 */
	public void removeAdjacentDuplicates() {
		Node current = head;
		int i = 0, j = 0;
		while (current.next != null) {
			i = current.data;
			j = current.next.data;
			if (i == j) {
				Node temp = current.next.next;
				current.next = temp;
			} else {
				current = current.next;
			}
		}
	}

	/**
	 * This method compares two Linked List are same or not and returns true if they
	 * are same otherwise returns false.
	 * 
	 * @param l
	 *            First LinkedList
	 * @param ll
	 *            Second LinkedList
	 * @return boolean true if two Lists are same otherwise returns false
	 */
	public static boolean CompareLists(LinkedList l, LinkedList ll) {
		Node headA = l.head, headB = ll.head;
		while (headA != null && headB != null && headA.data == headB.data) {
			headA = headA.next;
			headB = headB.next;
		}
		return (headA == headB) ? true : false;
	}

	/**
	 * This method rotates the Linked List by their given position.
	 * 
	 * @param k
	 *            position from where we want to rotate
	 */
	public void rotate(int k) {
		Node current = head, newHead;
		int count = 1;
		while (current != null) {
			if (count == k)
				break;
			current = current.next;
			count++;
		}
		newHead = current.next;
		Node temp = newHead;
		current.next = null;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		Node temp1 = newHead;
		while (temp1 != null) {
			System.out.print(temp1.data + " ");
			temp1 = temp1.next;
		}
	}

	/**
	 * This method returns the node which is on the given Position from last in the
	 * given Linked List
	 * 
	 * @param n
	 *            position from Last
	 * @return value of that node
	 */
	public int getNthFromLastApproach1(int n) {
		Node current = head;
		int size = length();
		if (head == null)
			return -1;
		if (size < n)
			return -1;
		int count = 0;
		while (count++ < size - n) {
			current = current.next;
		}
		return current.data;
	}

	/**
	 * This method returns the node which is on the given Position from last in the
	 * given Linked List
	 * 
	 * @param n
	 *            position from Last
	 * @return value of that node
	 */
	public int getNthFromLastApproach2(int n) {
		int count = 0;
		Node m = head, nt = head;
		if (head == null)
			return -1;
		if (n > length())
			return -1;
		while (++count < n) {
			m = m.next;
			if (m == null)
				return -1;
		}
		while (m.next != null) {
			m = m.next;
			nt = nt.next;
		}
		return nt.data;
	}

	/**
	 * This Method returns the index of given element.
	 * 
	 * @param data
	 *            value of that node
	 * @return index of that node
	 */
	public int getIndex(int data) {
		Node current = head;
		int count = 0;
		while (current.data == data) {
			current = current.next;
			count++;
		}
		return count;
	}

	/**
	 * This method returns that how many time the given no. is repeated in the
	 * Linked List.
	 * 
	 * @param search_for
	 *            value of that node
	 * @return count counting of that repetitive no.
	 */
	public int count(int search_for) {

		Node current = head;
		int count = 0;
		while (current != null) {
			if (current.data != search_for) {

			} else {
				count++;
			}
			current = current.next;
		}
		return count;
	}

	/**
	 * This method returns the node after merge of Two Linked List with sorting.
	 * 
	 * @param l1
	 *            LinkedList
	 * @param l2
	 *            LinkedList
	 * @return l3 LinkedList after merged.
	 */
	public static LinkedList mergeSortListsRec(LinkedList l1, LinkedList l2) {
		Node current = mergeLists(l1.head, l2.head);
		LinkedList l3 = new LinkedList();
		l3.head = current;
		return l3;
	}

	/**
	 * This method returns the node after merge of Two Linked List with sorting.
	 * 
	 * @param headA
	 *            head node of one Linked List
	 * @param headB
	 *            head node of another Linked List
	 * @return Node head node of merged list.
	 */
	private static Node mergeLists(Node headA, Node headB) {
		if (headA == null && headB == null)
			return null;
		else if (headA == null)
			return headB;
		else if (headB == null)
			return headA;

		if (headA.data <= headB.data)
			headA.next = mergeLists(headA.next, headB);
		else {
			Node temp = headB;
			headB = headB.next;
			temp.next = headA;
			headA = temp;
			headA.next = mergeLists(headA.next, headB);
		}
		return headA;
	}

	/**
	 * This method returns true if given LinkedList is a palindrome otherwise
	 * returns false. Here we use a stack.
	 * 
	 * @return boolean true if palindrome otherwise false.
	 */
	public boolean isPalindrome() {
		Node current = head, runner = head;
		if (current.next == null)
			return true;
		Stack<Integer> stack = new Stack<Integer>();
		while (runner != null && runner.next != null) {
			stack.push(current.data);
			current = current.next;
			runner = runner.next.next;
		}
		if (runner != null)
			current = current.next;

		while (current != null) {
			if (stack.pop().intValue() != current.data)
				return false;
			current = current.next;
		}
		return true;
	}

	/**
	 * This method returns true if given LinkedList is a palindrome otherwise
	 * returns false. Here we use a stack.
	 * 
	 * @return boolean true if palindrome otherwise false.
	 */
	public boolean isPalindromeUsingRev() {
		Node current = head, runner = head, secondStart, firstStart = head;
		if (current.next == null)
			return true;
		while (true) {
			runner = runner.next.next;
			if (runner == null) {
				secondStart = current.next;
				break;
			}
			if (runner.next == null) {
				secondStart = current.next.next;
				break;
			}
			current = current.next;
		}
		current = current.next;
		secondStart = reverseRec(secondStart);

		while (firstStart != null && secondStart != null) {
			if (firstStart.data == secondStart.data) {
				firstStart = firstStart.next;
				secondStart = secondStart.next;

			} else
				return false;
		}
		return true;
	}

	/**
	 * This method reverses a Linked List Recursively
	 * 
	 * @param head
	 * @return Node
	 */
	public Node reverseRec(Node head) {
		Node current = head, next = current.next;
		if (head == null)
			return head;
		if (next == null)
			return current;
		next = reverseRec(next);
		current.next.next = current;
		current.next = null;
		return next;

	}

	/**
	 * This method adds(sums) two Singly Linked List.
	 * 
	 * @param l1
	 *            First LinkedList
	 * @param l2
	 *            Second LinkedList
	 */
	public static LinkedList sumTwoLists(LinkedList l1, LinkedList l2) {
		Node first = l1.head, second = l2.head;
		Node result = null, temp = null, prev = null;
		int carry = 0, sum;
		while (first != null || second != null) {
			sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
			carry = (sum >= 10) ? 1 : 0;
			sum = sum % 10;

			temp = new Node(sum);
			if (result == null) {
				result = temp;
			} else {
				prev.next = temp;
			}
			prev = temp;
			if (first != null) {
				first = first.next;
			}
			if (second != null) {
				second = second.next;
			}
		}
		if (carry > 0) {
			temp.next = new Node(carry);
		}
		LinkedList linkedList = new LinkedList();
		linkedList.head = result;
		return linkedList;
	}

	/**
	 * This method swaps a LinkedList pair wise.
	 */
	public void pairWiseSwap() {
		Node current = head, newHead = current.next;
		while (true) {
			Node q = current.next;
			Node temp = q.next;
			q.next = current;
			if (temp == null) {
				current.next = null;
				break;
			}
			if (temp.next == null) {
				current.next = temp;
				break;
			}
			current.next = temp.next;
			current = temp;

		}
		Node cc = newHead;
		System.out.print("[");
		while (cc != null) {
			System.out.print(cc.data + " ---> ");
			cc = cc.next;
		}
		System.out.print(cc);
		System.out.print("]");
		System.out.println();

	}

}
