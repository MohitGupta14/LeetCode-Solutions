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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null; 
        ListNode temp = new ListNode(0);
        ListNode curr = head;
        ListNode tempCurr = temp;

        while(curr!=null){
            
            int curVal = curr.val;
            if (curr.next == null || curr.val != curr.next.val) {
                temp.next = new ListNode(curr.val);
                temp = temp.next;
                curr = curr.next;
            }else{
                while(curr!=null && curr.val == curVal){
                    curr = curr.next;
                }
            }

            
        }

        return tempCurr.next;

    }
}