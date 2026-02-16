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
    public ListNode partition(ListNode head, int x) {
      ListNode lesser = new ListNode(-1);  
      ListNode greater = new ListNode(-1);  
      
      ListNode lesserh = lesser; 
      ListNode greaterh = greater;
      while(head!= null){
        if(head.val < x){
            lesserh.next = head;
            lesserh = lesserh.next;
        }else{
            greaterh.next = head;
            greaterh = greaterh.next;
        }
        head = head.next;
      }
      lesserh.next = greater.next;
      greaterh.next = null;
      head = lesser.next;
      return head;
    }
}
