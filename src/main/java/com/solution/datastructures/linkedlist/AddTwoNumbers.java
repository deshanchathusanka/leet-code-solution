package com.solution.datastructures;

import java.util.Optional;

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int value) {
        this.val = value;
    }

    public ListNode(int value, ListNode next) {
        this.val = value;
        this.next = next;
    }
}

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null, temp = null;

        int remainder = 0;
        int value = 0;
        while (l1 != null || l2 != null)
        {
            value = remainder;
            if(Optional.ofNullable(l1)
                    .isPresent())
            {
                value += l1.val;
            }

            if (Optional.ofNullable(l2)
                    .isPresent())
            {
                value += l2.val;
            }
            if(value>9)
            {
                remainder = value/10;
                value = value%10;
            }else
            {
                remainder = 0;
            }

            if(Optional.ofNullable(temp)
                    .isPresent())
            {
                temp.next = new ListNode(value);
                temp = temp.next;
            }else
            {
                result = temp = new ListNode(value);

            }

            if(Optional.ofNullable(l1)
                    .isPresent()) {
                l1 = l1.next;
            }

            if (Optional.ofNullable(l2)
                    .isPresent()) {
                l2 = l2.next;
            }
        }

        if(remainder!=0)
        {
            temp.next = new ListNode(remainder);
        }

        return result;

    }
}