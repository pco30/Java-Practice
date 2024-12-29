package cs;

import java.util.NoSuchElementException;

public class LinkedList {
	private Node head;
	
	public void insertHead(String s) {
		Node nd = new Node(s);
		if(head == null) {
			head = nd;
		}
		else {
			nd.next = head;
			head = nd;
		}
	}
	
	public String getStringAt(int n) {
		if (n < 0) {
			throw new NoSuchElementException("N cannot be negative");
		}
		
	   	int count = 0; // initialize count to 0
    	Node temp = head;
    	
    	while (temp != null) {
    		if (count == n) {
    			return temp.item; //return string at n position
    		}
			count++;
			temp = temp.next; // Go to the next node
    	}
    	
    	throw new NoSuchElementException("Out of bounds");
	}
}
