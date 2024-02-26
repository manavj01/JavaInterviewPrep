package DSA.linkedList;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        head.next = second;
        Node third = new Node(30);
        second.next = third;
        Node fourth = new Node(40);
        third.next = fourth;
        Node fifth = new Node(50);
        fourth.next = fifth;


        printList(head);

    }

    public static void printList(Node head){
        Node temp = head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

}
