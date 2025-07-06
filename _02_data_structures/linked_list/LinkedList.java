package _02_data_structures.linked_list;

public class LinkedList {
    public class Node {
        public int data;
        public Node next;
        
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            // Else traverse till the last node 
            // and insert the newNode there 
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            // Insert the newNode at last node 
            currentNode.next = newNode; 
        }
    }

    public void display() {
        Node currentNode = head;
        while (currentNode.next != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
    }

    public void createCycle(int pos) {
        if (head == null) return;
        Node cycleNode = null;
        Node currNode = head;

        int index = 1;
        while (currNode.next != null) {
            if (index == pos) {
                cycleNode = currNode;
            }

            currNode = currNode.next;
            index++;
        }

        if (cycleNode != null) {
            currNode.next = currNode;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(2);
        list.add(3);
        list.createCycle(4);
        list.display();
    }
}
