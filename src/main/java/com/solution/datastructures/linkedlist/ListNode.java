package com.solution.datastructures.linkedlist;

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
