package _02_data_structures.linked_list.detect_cycle_in_a_list;

import _02_data_structures.linked_list.reverse_a_linked_list.LinkedList;

public class Solution {
    public static boolean hasCyle(LinkedList list) {
        if (list.head == null || list.head.next == null) {
            return false;
        }
        LinkedList.Node slow = list.head;
        LinkedList.Node fast = list.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            System.out.println("slow = " + slow.data + " fast=" + fast.data);

            if (slow == fast) return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.display();

        System.out.println(hasCyle(list));
    }
}
