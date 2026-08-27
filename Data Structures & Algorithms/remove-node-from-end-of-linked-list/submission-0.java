class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Edge case
        if (head == null) return null;

        // 1️⃣ Calculate size
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // 2️⃣ If first node needs to be removed
        if (n == size) {
            return head.next;
        }

        // 3️⃣ Find (size - n)th node
        int i = 1;
        int iToFind = size - n;
        ListNode prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        // 4️⃣ Remove node
        prev.next = prev.next.next;

        return head;
    }
}