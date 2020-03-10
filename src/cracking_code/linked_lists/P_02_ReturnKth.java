package cracking_code.linked_lists;

import java.util.Stack;

import cracking_code.tools.MyLinkedList;
import cracking_code.tools.MyNode;

public class P_02_ReturnKth {
	int returnKth(MyLinkedList<Integer> list, int index) {
		return list.get(list.size() - index);
	}
	
	/**
	 * Considering a scenario where we only have nodes with no size-get methods
	 * 
	 * We consider that the list is not empty
	 * @param list
	 * @param index
	 * @return
	 */
	int returnKthV2(MyLinkedList<Integer> list, int index) {
		MyNode<Integer> head = list._get(0);
		Stack<Integer> stack = new Stack<>();
		while(head != null) {
			stack.push(head.getValue());
			head = head.getNextNode();
		}
		while(--index > 0)
			stack.pop();
		
		return stack.peek();
	}
	
	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.print();

		System.out.println(new P_02_ReturnKth().returnKthV2(list, 5));
		
	}
}
