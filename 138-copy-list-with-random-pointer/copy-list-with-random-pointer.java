/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       
       if(head == null){
           return null;
       }
       Node temp = head;
       Node newHead = new Node(head.val);
       Node temp2 = newHead;
       while(temp.next != null){
           temp = temp.next;
           Node node = new Node(temp.val);
           temp2.next = node;
           temp2 = node ; 
        }

        Node link1 = head;
        Node link2 = newHead;

        while (link1 != null) {
            Node random = link1.random;
            
            if (random == null) {
                link2.random = null;
            } else {
                Node tempLink = newHead;
                Node tempRandom = head;
                
                while (tempRandom != random) {
                    tempRandom = tempRandom.next;
                    tempLink = tempLink.next;
                }
                
                link2.random = tempLink;
            }
            
            link1 = link1.next;
            link2 = link2.next;
        } 
         return newHead;
    }
}