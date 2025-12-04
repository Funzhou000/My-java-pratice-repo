// /**
// * Definition for singly-linked list.
// * public class ListNode {
// * int val;
// * ListNode next;
// * ListNode() {}
// * ListNode(int val) { this.val = val; }
// * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */

// class Solution {
// public ListNode insertGreatestCommonDivisors(ListNode head) {
// if (head == null || head.next == null)
// return head;
// ListNode curr = head;
// while (curr.next != null) {
// int val1 = curr.val;
// int val2 = curr.next.val;
// int gcdValue = gcd(val1, val2);
// ListNode gcdNode = new ListNode(gcdValue);
// gcdNode.next = curr.next;
// curr.next = gcdNode;
// curr = gcdNode.next;
// }
// return head;
// }

// public int gcd(int a, int b) {
// if (b == 0)
// return a;
// return gcd(b, a % b);
// }
// }