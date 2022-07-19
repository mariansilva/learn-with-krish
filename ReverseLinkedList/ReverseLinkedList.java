public class ReverseLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int temp) {
            data= temp;
        }

    }
    static Node reverse(Node node){
        Node prev = null;
        Node curr = node;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        return prev;
    }
    static void printList(Node head){
        while(head != null){
            System.out.println(head.data +"");
            head = head.next;
        }
    }
    public static void main(String args[]){
        Node n1 =new Node(1);
        Node n2= new Node(2);
        Node n3 =new Node(3);
        Node n4= new Node(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        printList(n1);
        System.out.println();
        Node newList = reverse(n1);
        printList(newList);
    }
}
