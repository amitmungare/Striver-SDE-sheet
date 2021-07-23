package twoPointer;

import java.util.*;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

public class CloneLinkedList {
	
public Node copyRandomList(Node head) {
        
        Node iter = head;
        Node front = head;
        
        while(iter != null){
            front = iter.next;
            
            Node copy = new Node(iter.val);
            iter.next = copy;
            copy.next = front;
            
            iter = front;
        }
        
        iter = head;
        while(iter != null){
            if(iter.random != null){
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }
        
        iter = head;
        
        Node phead = new Node(0);
        Node copy = phead;
        
        
        while(iter !=null){
            front = iter.next.next;
            
            copy.next = iter.next;
            copy = copy.next;
            
            iter.next =front;
            iter =front;
        }
        
        return phead.next;
    }

}

}
