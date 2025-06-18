
abstract class Animal {

    void walk() {
    }
;

}

class horse extends Animal {

    public void walk() {
        System.out.println("Horse walk");
    }

}

class OOPS {

    public static void main(String[] args) {
        horse h1 = new horse();
        h1.walk();
    }
}

// // /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode deleteMiddle(ListNode head) {
//        ListNode fast=head.next;
//        ListNode prev=head;
//        ListNode curr=head.next;
//        while(fast!=null){
//         ListNode nxt=curr.next;
//         if(fast.next!=null && fast.next.next!=null){
//         fast=fast.next.next;
//         prev=prev.next;
//         curr=curr.next;
//         }
//        } 
//        prev.next=curr.next;
//        return head;
//     }
// }
