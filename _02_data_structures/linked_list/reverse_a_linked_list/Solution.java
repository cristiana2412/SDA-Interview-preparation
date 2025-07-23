package _02_data_structures.linked_list.reverse_a_linked_list;

import _02_data_structures.linked_list.LinkedList;

public class Solution {
    public static LinkedList.Node reverseLinkedList(LinkedList list) {
        LinkedList.Node prevNode = null;
        LinkedList.Node currentNode = list.head;

        while (currentNode != null) {
            LinkedList.Node nexNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nexNode;
        }
        return prevNode;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(2);
        list.add(3);

        list.display();

        LinkedList reversedLinkedList = new LinkedList();
        reversedLinkedList.head = reverseLinkedList(list);
        reversedLinkedList.display();
    }

}
