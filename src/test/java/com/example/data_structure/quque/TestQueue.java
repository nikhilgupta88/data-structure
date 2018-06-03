package com.example.data_structure.quque;

import org.junit.Test;

public class TestQueue {

	@Test
	public void QueueArrayTest() {
		QueueArray q = new QueueArray(10);
		q.enqueue(2);
		q.print();
		q.enqueue(5);
		q.print();
		q.enqueue(6);
		q.print();
		q.enqueue(8);
		q.print();
		q.enqueue(10);
		q.print();
		q.enqueue(12);
		q.print();
		q.enqueue(14);
		q.print();
		q.enqueue(16);
		q.print();
		q.enqueue(17);
		q.print();
		q.enqueue(19);
		q.print();
		q.dequeue();
		q.print();
		q.dequeue();
		q.print();
		q.enqueue(2);
		q.print();
		q.enqueue(5);
		q.print();

	}

	@Test
	public void QueueLinkedListTest() {
		QueueLinkedList q = new QueueLinkedList();
		q.enqueue(2);
		q.print();
		q.enqueue(5);
		q.print();
		q.enqueue(6);
		q.print();
		q.enqueue(8);
		q.print();
		q.enqueue(10);
		q.print();
		q.enqueue(12);
		q.print();
		q.enqueue(14);
		q.print();
		q.enqueue(16);
		q.print();
		q.enqueue(17);
		q.print();
		q.enqueue(19);
		q.print();
		q.dequeue();
		q.print();
		System.out.println("\n" + q.front());
		System.out.println(q.IsEmpty());
	}

	@Test
	public void reverse() {
		QueueOperation q = new QueueOperation();
		QueueLinkedList qu = new QueueLinkedList();
		for (int i = 10; i < 28; i++) {
			qu.enqueue(i);
		}
		qu.print();
		q.reverse(qu);
		qu.print();
	}

	@Test
	public void reverseA() {
		QueueOperation q = new QueueOperation();
		QueueArray qu = new QueueArray(10);
		for (int i = 10; i < 20; i++) {
			qu.enqueue(i);
		}
		qu.print();

		q.reverseA(qu);
		qu.print();
	}

	@Test
	public void reverseFirstKElement() {
		QueueOperation q = new QueueOperation();
		QueueLinkedList qu = new QueueLinkedList();
		for (int i = 10; i < 20; i++) {
			qu.enqueue(i);
		}
		qu.print();

		q.reverseQueueFirstKElements(qu, 5);
		qu.print();
	}

	@Test
	public void interLeave() {
		QueueOperation q = new QueueOperation();
		QueueLinkedList qu = new QueueLinkedList();
		for (int i = 10; i < 28; i++) {
			qu.enqueue(i);
		}
		qu.print();
		q.interLeave(qu);
		;
		qu.print();
	}

}
