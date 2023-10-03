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
    public ListNode insertionSortList(ListNode head) {

    PriorityQueue<Integer> arr = new PriorityQueue<>();
       ListNode current = head;
       while(current != null){
          arr.add(current.val);
          current = current.next;
        }

       ListNode temp = head;
       while(temp!= null){
          temp.val = arr.poll();
          temp = temp.next;
       }

       return head;
    }
}