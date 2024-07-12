package Linkedlist;

public class LinledList2 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void InsertAtBegginig(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[]args){
        LinledList2 ll= new LinledList2();
        ll.InsertAtBegginig(2);
        ll.InsertAtBegginig(4);
        ll.InsertAtBegginig(6);
        ll.InsertAtBegginig(8);
        System.out.println("BeforeInserting At Beggining :");
        ll.display();
        System.out.print("");
        ll.InsertAtBegginig(1);
        System.out.println("AfterInserting At Beggining :");
        ll.display();


    }

}
