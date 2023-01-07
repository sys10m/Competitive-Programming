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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        ListNode head = new ListNode();
        ListNode last = head;
        boolean isEmpty = true;
        while (temp1 != null || temp2 != null || carry != 0){
            // compute
            int sum = ((temp1 == null)? 0:temp1.val) + ((temp2 == null)? 0: temp2.val) + carry;
            if (sum > 9){
                sum -= 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            // put value in
            if (isEmpty){
                last.val = sum;
                isEmpty = false;
            }
            else{
                last.next = new ListNode(sum);
                last = last.next;
            }
            // iterate
            if (temp1 != null){
                temp1 = temp1.next;
            }
            if (temp2 != null){
                temp2 = temp2.next;
            }
        }
        return head;
    }
}
