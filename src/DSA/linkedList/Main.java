package DSA.linkedList;

public class Main { // Main class to perform and create various functions for linkedlist
    public static void main(String[] args) {
        Node head = new Node(10); // created a head node with some data
        Node second = new Node(20); // created another node with some data
        head.next = second; // linked the head node with second node and the process continues down below.
        Node third = new Node(30);
        second.next = third;
        Node fourth = new Node(40);
        third.next = fourth;
        Node fifth = new Node(50);
        fourth.next = fifth;


        printList(head); // function to print all nodes in a linkedlist

    }

    public static void printList(Node head){
        Node temp = head; // temporary node that points to head

        while (temp != null){ // loop that runs from head till null
            System.out.println(temp.data); // prints the node
            temp = temp.next; // increment the node from prev to next
        }

    }

}
