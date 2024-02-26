package DSA.linkedList;

public class Node {
    int data;
    Node next = null;

    Node(){
        next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
    }
}
