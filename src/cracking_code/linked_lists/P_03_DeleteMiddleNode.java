package cracking_code.linked_lists;

import cracking_code.tools.MyLinkedList;
import cracking_code.tools.MyNode;

public class P_03_DeleteMiddleNode {
	void deleteMiddleNode(MyLinkedList<Integer> list, MyNode<Integer> node) {
		MyNode<Integer> head = list._rawList();
		
		while (head.getNextNode() != null && head.getNextNode() != node) {
			head = head.getNextNode();
		}
		head.setNextNode(node.getNextNode());
	}
	
	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.print();
		MyNode<Integer> node = list._get(2);
		list.remove(node);
		list.print();
		
	}
}
