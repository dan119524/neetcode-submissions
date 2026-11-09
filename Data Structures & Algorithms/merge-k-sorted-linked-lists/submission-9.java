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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>heap = new PriorityQueue<>((a,b)-> a.val - b.val);
        for(ListNode node : lists){
            if(node != null){
                heap.add(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(! heap.isEmpty()){
            ListNode samllest = heap.poll();

            tail.next = samllest;
            tail = tail.next;

            if(samllest.next != null){
                heap.add(samllest.next);
            }
        }
        return dummy.next;

        
        
        
    }  
}

    

