package com.solution.datastructures.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class RemoveFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> references = new ArrayList<>();
        ListNode newHead = head;

        if (head == null) {
            return null;
        }

        ListNode tempRef = head;
        int size = 0;
        while (tempRef != null) {
            references.add(tempRef);
            tempRef = tempRef.next;
            ++size;
        }

        int removeIndex = size - n;

        if (removeIndex > 0 && removeIndex < size - 1) {
            ListNode before = references.get(removeIndex - 1);
            ListNode after = references.get(removeIndex + 1);
            before.next = after;
            newHead = references.get(0);
        } else if (removeIndex == 0) {
            if (size > 1) {
                newHead = references.get(1);
            } else {
                newHead = null;
            }
        } else if (removeIndex == size - 1) {
            if (size > 1) {
                ListNode before = references.get(removeIndex - 1);
                before.next = null;
            } else {
                newHead = null;
            }
        }

        return newHead;
    }
}
