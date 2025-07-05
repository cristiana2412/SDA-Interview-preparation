package _02_data_structures.linked_list.find_middle_of_linked_list;

import _02_data_structures.linked_list.reverse_a_linked_list.LinkedList;

public class Solution {
    public static void findMiddle(LinkedList list) {
        if (list.head == null) {
            System.out.println("The list is empty");
            return;
        }
        LinkedList.Node slow = list.head;
        LinkedList.Node fast = list.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle is: " + slow.data);
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

        findMiddle(list);
    }

}
