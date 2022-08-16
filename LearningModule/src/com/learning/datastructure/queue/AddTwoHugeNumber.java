package com.learning.datastructure.queue;


public class AddTwoHugeNumber {

    /*You're given 2 huge integers represented by linked lists. Each linked list element is a number from 0 to 9999 that represents a number with exactly 4 digits. The represented number might have leading zeros. Your task is to add up these huge integers and return the result in the same format.

Example

For a = [9876, 5432, 1999] and b = [1, 8001], the output should be
solution(a, b) = [9876, 5434, 0].

Explanation: 987654321999 + 18001 = 987654340000.

For a = [123, 4, 5] and b = [100, 100, 100], the output should be
solution(a, b) = [223, 104, 105].

Explanation: 12300040005 + 10001000100 = 2230104010
    *
    *
    * */
    class ListNode<T> {
        ListNode(T x) {
            value = x;
        }

        T value;
        ListNode<T> next;
    }

    ListNode<Integer> solution(ListNode<Integer> a, ListNode<Integer> b) {
        ListNode<Integer> result = new ListNode<>(0);
        ListNode<Integer> head = result;
        int carry = 0;
        a = reverseList(a);
        b = reverseList(b);
        while (a != null || b != null) {
            if (a != null) {
                carry += a.value;
                a = a.next;
            }
            if (b != null) {
                carry += b.value;
                b = b.next;
            }
            head.next = new ListNode<>(carry % 10000);
            head = head.next;
            carry = carry / 10000;
        }
        if (carry >= 1)
            head.next = new ListNode<>(carry);

        return reverseList(result.next);

    }

    ListNode<Integer> reverseList(ListNode<Integer> list) {
        ListNode<Integer> prev = null;
        while (list.next != null) {
            ListNode<Integer> temp = list.next;
            list.next = prev;
            prev = list;
            list = temp;
        }
        return prev;
    }
}
