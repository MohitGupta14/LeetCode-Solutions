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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int length = 0 ;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int i = 0  ; i < k-1 ; i++){
              temp1 = temp1.next;
        }

        for(int i = 0  ; i < length-k ; i++){
              temp2 = temp2.next;
        }
        swapNode(temp1 ,temp2);
        return head;
    }

    public void swapNode(ListNode temp1, ListNode temp2){
        int tempo = temp1.val;
        temp1.val = temp2.val;
        temp2.val = tempo;
    }
}