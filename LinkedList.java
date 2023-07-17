import java.util.*;
public class LinkedList {
	public static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	
	 public void addFirst(int data) {
		 //step 1 create new node
		 Node newNode = new Node(data);
		 size++;
		 
		 if(head == null) {
			head = tail = newNode;
			return;
		 }
		
		 
		 //step2 neewNode next = head
		 newNode.next = head;
		 
		 //step 3 head = newNode
		 head = newNode;
				 
	 }
	 
	 public void addLast(int data) {
		Node newNode = new Node(data);
		size++;
		if(head == null ) {
			head = tail = newNode;
		}
		tail.next = newNode;
		tail = newNode;
		}
		
	public void print() {
		if(head == null) {
			System.out.println("empty");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("null");
	}
		
	public void add(int idx , int data) {
			
		if(idx == 0) {
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		size++;
		Node temp = head;
			
		int i = 0;
		while(i < idx-1) {
			temp = temp.next;
			i++;
			}
			//i = idx-1; temp-> prev
		newNode.next = temp.next;
		temp.next = newNode;
		}
	
	public  int removeFst() {
		int val = head.data;
		head = head.next;
		return val;
	}
	
	public int removelst() {
		if(size == 0) {
			System.out.println("Empty");
			return Integer.MAX_VALUE;
		}
		else if(size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		Node prev = head;
		for(int i = 0; i < size-2; i++) {
			prev = prev.next;
		}
		int val= tail.data;
		prev.next = null;
		tail = prev;
		size--;
		return val;
	}
	
	public void reverse() {
		Node prev = null;
		Node curr = tail = head;
		Node next;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public int search(int key) {
		Node temp = head;
		int i = 0;
		while(temp!= null) {
			if(temp.data == key) {
				return i;
			}
			temp = temp.next;
			i++;
		}
		return -1;
	}

	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		//ll.print();
		ll.addFirst(2);
		//ll.print();
		ll.addFirst(1);
		//ll.print();
		ll.addLast(3);
		//ll.print();
		ll.addLast(4);
		ll.print();
		ll.add(4,5);
		ll.print();
		//ll.removeFst();
		//ll.print();
		//ll.removelst();
		//ll.print();
		ll.reverse();
		ll.print();
		System.out.println(ll.size);
		System.out.println(ll.search(3));
		
		

	}

}
 
