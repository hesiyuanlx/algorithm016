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
class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(0);
        ListNode currentNode = head;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                currentNode.next = l2;
                l2 = l2.next;
                currentNode = currentNode.next;
                continue;
            }
            if (l1.val < l2.val) {
                currentNode.next = l1;
                l1 = l1.next;
                currentNode = currentNode.next;
                continue;
            }
        }
        if (l1 != null) {
            currentNode.next = l1;
        }
        if (l2 != null) {
            currentNode.next = l2;
        }
        return head.next;
    }

}
