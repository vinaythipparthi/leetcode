/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node tail = dfs(head);
        return head;
    }
    public Node dfs(Node head){
        Node last = null;
        while(head!=null){
            Node next = head.next;
            if(head.child != null){
                Node childH = head.child;
                Node childT = dfs(head.child);
                //
                head.next = childH;
                childH.prev = head;
                //
                if(next != null){
                    childT.next = next;
                    next.prev = childT;
                }
                //
                head.child = null;
                last = childT;
            }else{
                last = head;
            }
            head = head.next;
        }
        return last;
    }
}