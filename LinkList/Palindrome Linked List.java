/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode temp = head;
        ListNode middle = Middle(temp);
        ListNode secondh = reverse(middle);
        while(secondh != null){
            if(secondh.val != temp.val){
                   return false;
            }
                secondh = secondh.next;
                temp = temp.next;   
        }
        return true;
    }
    public ListNode Middle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
       ListNode prev = null;
       ListNode curr = head;
       while(curr != null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
       return prev;
    }
}
