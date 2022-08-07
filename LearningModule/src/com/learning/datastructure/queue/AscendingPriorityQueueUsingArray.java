package com.learning.datastructure.queue;

public class AscendingPriorityQueueUsingArray {

	static item[] pr = new item[1000];
	static int size = -1;

	static void enqueue(int value, int priority) {

		size++;
		pr[size] = new item();
		pr[size].priority = priority;
		pr[size].value = value;

	}

	// Check for the element with
	// highest priority
	static int peek() {

		int highestPriority = Integer.MIN_VALUE;
		int ind = -1;

		// If priority is same choose
		// the element with the
		// highest value
		for (int i = 0; i <= size; i++) {

			if (highestPriority == pr[i].priority && ind > -1 && pr[ind].value < pr[i].value) {

				highestPriority = pr[i].priority;
				ind = i;

			} else if (highestPriority < pr[i].priority) {
				highestPriority = pr[i].priority;
				ind = i;

			}
		}
		// Return position of the element
		return ind;
	}

	static void dequeue() {

		// Find the position of the element
		// with highest priority
		int ind = peek();

		// Shift the element one index before
		// from the position of the element
		// with highest priority is found
		for (int i = ind; i < size; i++) {
			pr[i] = pr[i + 1];
		}

		// Decrease the size of the
		// priority queue by one
		size--;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Function Call to insert elements
		// as per the priority
		enqueue(10, 2);
		enqueue(14, 4);
		enqueue(16, 4);
		enqueue(12, 3);

		// Stores the top element
		// at the moment
		int ind = peek();
		System.out.println(pr[ind].value);

		// Dequeue the top element
		dequeue();

		ind = peek();
		System.out.println(pr[ind].value);

	}

}

class item {
	public int value;
	public int priority;
}
