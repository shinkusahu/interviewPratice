package com.learning.codesignal.basic;

public class LinkedListDeleteNodeK {

	/*
	 * Try to solve this task in O(n) time using O(1) additional space, where n is
	 * the number of elements in the list, since this is what you'll be asked to do
	 * during an interview.
	 * 
	 * Given a singly linked list of integers l and an integer k, remove all
	 * elements from list l that have a value equal to k.
	 * 
	 * Example
	 * 
	 * For l = [3, 1, 2, 3, 4, 5] and k = 3, the output should be solution(l, k) =
	 * [1, 2, 4, 5]; For l = [1, 2, 3, 4, 5, 6, 7] and k = 10, the output should be
	 * solution(l, k) = [1, 2, 3, 4, 5, 6, 7].
	 * 
	 * 
	 **/

	class ListNode<T> {
		ListNode(T x) {
			value = x;
		}

		T value;
		ListNode<T> next;
	}

	ListNode<Integer> solution(ListNode<Integer> node, int k) {
		// Store head node

		if (node == null)
			return null;

		node.next = solution(node.next, k);

		if (node.value == k)
			return node.next;

		return node;

	}

}
