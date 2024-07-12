package Linkedlist;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    public void InsertEnd(int newData) {
        Node newNode = new Node(newData);
        //If LL is Empty
        if (head == null) {
            head = new Node(newData);
            return;
        }
        //Ll is not Empty
        newNode.next = null;
        //Intilizing temp initilly by head
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
            temp.next = newNode;
    }
    //Display LL
    public void displayLL() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
            return;

        }
    }
        public static void main(String[] args){
            LinkedList LL = new LinkedList();
            LL.InsertEnd(2);
            LL.InsertEnd(4);
            LL.InsertEnd(6);

            LL.InsertEnd(8);

            System.out.println("Before Insertion ");
            LL.displayLL();
            System.out.print("");
            LL.InsertEnd(10);
            System.out.println("Before Insertion ");
            LL.displayLL();
            System.out.print("");

        }

    }
