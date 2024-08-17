package core.java.dsa;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static LinkedList insert(LinkedList linkedList, int data){
        Node newNode = new Node(data);
        if(linkedList.head == null){
            linkedList.head = newNode;
            return linkedList;
        }
        Node lastNode = linkedList.head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        return linkedList;
    }

    public static void display(LinkedList linkedList){
        Node curNode = linkedList.head;
        while(curNode != null){
            System.out.println(curNode.data);
            curNode = curNode.next;
        }
    }



    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        insert(linkedList,1);
        insert(linkedList, 2);
        insert(linkedList, 3);
        insert(linkedList, 4);

        display(linkedList);

    }
}
