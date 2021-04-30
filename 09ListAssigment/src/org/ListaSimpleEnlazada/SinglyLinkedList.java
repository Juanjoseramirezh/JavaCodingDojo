package org.ListaSimpleEnlazada;

public class SinglyLinkedList {
	public Node head;

	public SinglyLinkedList() {
		this.head = null;
	}
	
	//METODOS SLL
	public void remove() {
		Node removeNode = head;
		while(removeNode.next.next != null) {
			removeNode = removeNode.next;
		}
		removeNode.next = null; 
	}
	
	public void printValues() {
		Node showNode = head;
		while(showNode != null) {
			System.out.println(showNode.value);
			showNode = showNode.next;
		}
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		} else {
			Node runner = head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}
}
