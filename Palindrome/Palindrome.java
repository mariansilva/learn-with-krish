import javax.xml.soap.Node;
import java.util.Stack;

public class Palindrome {

    static class Node{
        String data;
        Node next;
        Node(String temp){
            data = temp;
        }
    }
    static boolean checkPalindromeLinkedList(Node head) {
    Node tempNode = head;
    Stack<String> stack = new Stack<String>();
    while(tempNode !=null){
        stack.push(tempNode.data);
        tempNode =tempNode.next;
    }
    while(head != null){
        if (head.data != stack.pop()) {
            return Boolean.FALSE;
        }
        head = head.next;
    }
    return Boolean.TRUE;
    }

    public static void main(String args[]){
        Node n1=new Node("R");
        Node n2=new Node("A");
        Node n3=new Node("C");
        Node n4=new Node("E");
        Node n5=new Node("C");
        Node n6=new Node("A");
        Node n7=new Node("R");

        n1.next =n2;
        n2.next =n3;
        n3.next =n4;
        n4.next =n5;
        n5.next =n6;
        n6.next =n7;

        boolean result = checkPalindromeLinkedList(n1);
        System.out.println("Is it Palindrome:" +result);
    }
}
