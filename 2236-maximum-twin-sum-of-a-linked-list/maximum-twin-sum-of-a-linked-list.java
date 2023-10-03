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
    public int pairSum(ListNode head) {
        ArrayList<Integer> l1 = new ArrayList<>();

        ListNode current  = head;
        while(current != null){
           l1.add(current.val);
           current = current.next;
        }
        int ans = -99999999;
        for(int i =0 ; i<l1.size();i++){
           ans = Math.max(ans, l1.get(i) + l1.get(l1.size() - i -1 ));
            System.out.print(l1.get(l1.size() - i -1 ));
        }

        return ans;
    }
}