package com.example.problem.solving.leetcode.leetcode_75_level1.day4_linkedlist;

public class MiddleOfLinkedList
{

    public ListNode middleNodeSol1(ListNode head) {

        ListNode current = head;
        int length = 0;
        ListNode middle = head;

        while ((current != null) && (current.next != null)) {

            middle = middle.next;
            current = current.next.next;

        }

        return middle;

    }

    public ListNode middleNodeSol2(ListNode head)
    {
        ListNode mid = null;
        ListNode curr = head;
        int i = 0;
        int half = 0;
        int compareToMiddle = 0;


        while (head != null)
        {
            i++;
            head = head.next;

        }

        if (i == 1)
        {
            return curr;
        }

        if (i % 2 == 0)
        {
            half = i / 2 + 1;
            compareToMiddle = 1;
        }
        else
        {
            half = i / 2;
            compareToMiddle = 0;
        }


        while(curr != null){
            curr = curr.next;
            half--;
            if (half == compareToMiddle)
            {
                break;
            }
        }


        return curr;

    }





}
