package DSA.linkedList;

public class Node { // node class or a blueprint of what a node in a linkedlist should look like.
    int data; // data attribute
    Node next = null; // next node attribute that
                    // points to the next node but initially points to null when created new

    Node(){  // default constructor

    }

    Node(int data, Node next){ // parameterised constructor that assigns value of data
                                // and next node attributes
        this.data = data;
        this.next = next;
    }
    Node(int data){ // parameterised constructor that assigns node its value
        this.data = data;
    }
}
