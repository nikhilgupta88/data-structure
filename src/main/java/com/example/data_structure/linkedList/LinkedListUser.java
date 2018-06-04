package com.example.data_structure.linkedList;

import java.util.Stack;

/**
 * 
 * @author NikhilGupta
 *
 */
public class LinkedListUser {

	public Node head; // head of the list

	
	/**
	 * Add at Beginning of the List
	 * @param data New Node
	 */
	public void addAtBegin(int data) {
		Node newNode = new Node(data);
		if (head == null) {

		}
		newNode.next = head;
		head = newNode;
	}

	
	/**
	 * Add at end of the List
	 * @param data New Node
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
	 * Add at the given index
	 * @param data
	 * @param index
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
	 * Delete from Beginning
	 * @return Node
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
	 * Delete from end of the List
	 * @return Node
	 */
	public int deleteAtEnd() {
		if (head == null) {
			return 0;
		}

		Node last = head;
		while (last.next.next != null) {
			last = last.next;
		}
		last.next = null;
		return last.data;

	}

	// Find out Length of Linked List
	/**
	 * Find out the Length of Linked List
	 * @return length
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

	// Delete at index
	/**
	 * Delete from Given Index
	 * @param index
	 * @return
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
	 * Find First index that a no. first occur on which index
	 * @param data
	 * @return FurstIndex
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
	 * Reverse a LinkedList Iteratively
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
	 * Print the Linked List
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
	 * Find element at given Index
	 * @param index
	 * @return Element
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
	 * Add at the Middle position of List
	 * @param data
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
	 * Delete from Middle index
	 * @return Node Value
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
	 * Swap two elements from given Position in a List
	 * @param x
	 * @param y
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
	 * Remove Adjacent Duplicates
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
		return;

	}

	/**
	 * Compare two linkedList is same or not?
	 * @param l LinkedList
	 * @param ll LinkedList
	 * @return boolean
	 */
	public static boolean CompareLists(LinkedListUser l, LinkedListUser ll) {
		Node headA = l.head, headB = ll.head;
		while (headA != null && headB != null && headA.data == headB.data) {
			headA = headA.next;
			headB = headB.next;
		}
		return (headA == headB) ? true : false;
	}

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
	 * Get Node from Last Method 1
	 * @param n position from Last
	 * @return Node Value
	 */
	public int getNthFromLast(int n) {
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
	 * Get Node from Last Method 2
	 * @param n position from Last
	 * @return Node Value
	 */
	public int getNthFromLast1(int n) {
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
	 *Count How Many times a no. is repeated?
	 * @param search_for Element
	 * @return count
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
	 * Merge two LinkedList 
	 * @param l1 LinkedList
	 * @param l2 LinkedList
	 */
	public void mergeSortListsRec(LinkedListUser l1, LinkedListUser l2) {
		Node current = mergeLists(l1.head, l2.head);
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
	 * Merge Two LinkedList with sorting
	 * @param headA
	 * @param headB
	 * @return Node
	 */
	private Node mergeLists(Node headA, Node headB) {
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
	 * Check Given LinkedList is palindrome or not by Using Stack?
	 * @return boolean
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
	 * Check Given LinkedList is palindrome or not?
	 * by Using Reverse a LinkedList
	 * @return boolean
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
	 * Reverse a LinkedList Recursively
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
	 * Addition(Sum) of two Singly LinkedList
	 * @param l1 LinkedList
	 * @param l2 LinkedList
	 */
	public void sumTwoLists(LinkedListUser l1, LinkedListUser l2) {
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
		Node current = result;
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
	 * Swap a LinkedList pair wise
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
