
import java.util.ArrayList;

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
import java.util.*;
class Solution {
    public void test() {
        ListNode node4 = new ListNode(4,null);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);
        List<ListNode> li=new ArrayList<>();
        li.add(node1);
        li.add(node2);
        li.add(node3);
        li.add(node4);
        System.out.println("ru");
        for(ListNode listNode:li) {
            ListNode listNode1 = listNode;
            System.out.println(listNode.val);
        }
        System.out.println("houlai");
        for(ListNode listNode:li) {
            ListNode listNode1 = listNode;
            System.out.println(swapPairs(listNode).val);
        }

    }
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode second = head.next;
        head.next = swapPairs(second.next);
        second.next = head;
        return second;
    }
}
