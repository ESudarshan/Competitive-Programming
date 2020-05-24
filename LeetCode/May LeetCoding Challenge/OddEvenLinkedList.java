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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode temp = head;
        ListNode evenTail = null;
        ListNode oddTail = null;
        ListNode evenHead = null;
        int i = 1;
        while(temp != null) {
            if(i%2 != 0) {
                 if(oddTail == null) {
                    oddTail = temp;
                } else {
                    oddTail.next = temp;  
                    oddTail = oddTail.next;
                } 
            } else {
                if(evenTail == null) {
                    evenTail = temp;
                    evenHead = temp;
                } else {
                    evenTail.next = temp;  
                    evenTail = evenTail.next;
                } 
            }
            temp = temp.next;
            i++;
        }
        if(evenTail != null) {
            evenTail.next = null;
        }
        oddTail.next = evenHead;
        return head;
    }   
}