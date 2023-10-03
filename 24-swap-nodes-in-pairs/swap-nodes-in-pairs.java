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
    public ListNode swapPairs(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int i = 0;
        if(length <= 1 ){
            return head;
        }

        while (i <= length - 2) { 
            ListNode temp2 = head;
            for (int j = 0; j < i; j++) {
                temp2 = temp2.next;
            }
            swapNode(temp2, temp2.next);
            i = i + 2;
        }
        return head;
    }

    public void swapNode(ListNode node1, ListNode node2) {
        int tempVal = node1.val;
        node1.val = node2.val;
        node2.val = tempVal;
    }
}
