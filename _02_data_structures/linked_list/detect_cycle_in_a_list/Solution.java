package _02_data_structures.linked_list.detect_cycle_in_a_list;

import _02_data_structures.linked_list.LinkedList;

public class Solution {
    public static boolean hasCycle(LinkedList list) {
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

        System.out.println(hasCycle(list));

        LinkedList list2 = new LinkedList();
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list2.createCycle(4);

        // list2.display();

        System.out.println(hasCycle(list2));
    }
}
