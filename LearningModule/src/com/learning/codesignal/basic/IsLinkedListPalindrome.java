package com.learning.codesignal.basic;

public class IsLinkedListPalindrome {

	/*
	 * Try to solve this task in O(n) time using O(1) additional space, where n is
	 * the number of elements in l, since this is what you'll be asked to do during
	 * an interview.
	 * 
	 * Given a singly linked list of integers, determine whether or not it's a
	 * palindrome.
	 * 
	 * Note: in examples below and tests preview linked lists are presented as
	 * arrays just for simplicity of visualization: in real data you will be given a
	 * head node l of the linked list
	 * 
	 * Example
	 * 
	 * For l = [0, 1, 0], the output should be solution(l) = true;
	 * 
	 * For l = [1, 2, 2, 3], the output should be solution(l) = false.
	 */
	/*
	 * This method takes O(n) time and O(1) extra space. 1) Get the middle of the
	 * linked list. 2) Reverse the second half of the linked list. 3) Check if the
	 * first half and second half are identical. 4) Construct the original linked
	 * list by reversing the second half again and attaching it back to the first
	 * half
	 */
	public class ListNode<T> {
		ListNode(T x) {
			value = x;
		}

		T value;
		ListNode<T> next;
	}

	// Singly-linked lists are already defined with this interface:
	// class ListNode<T> {
	//   ListNode(T x) {
//	     value = x;
	//   }
	//   T value;
	//   ListNode<T> next;
	// }
	//
	boolean solution(ListNode<Integer> l) {
	    ListNode<Integer> list = l;
	    ListNode<Integer> reversed = null;
	    
	    while(list != null) {

	        ListNode<Integer> next = new ListNode<>(list.value); 
	        next.next = reversed;
	        reversed = next; 
	                
	        list = list.next;
	    }
	    
	    
	    ListNode<Integer> temp = l;
	    while(temp != null) {
	        if((long) temp.value != (long)reversed.value) {
	            return false;
	        }
	        temp = temp.next;
	        reversed = reversed.next;
	        
	    }
	    return true;
	}

}
