package cracking_code.linked_lists;

import cracking_code.tools.MyLinkedList;

public class P_01_RemoveDups {
	public void removeDups(MyLinkedList<Integer> list) {
		MyLinkedList<Integer> indexToRemove = new MyLinkedList<>();
		for (int i = 0; i < list.size(); i++) {
			while ((i + 1 < list.size()) && (list.get(i) == list.get(i + 1))) {
				indexToRemove.add(++i);
			}
		}

		for (int i = indexToRemove.size() - 1; i >= 0; i--)
			list.remove(indexToRemove.get(i));
	}

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.add(10);
		list.add(10);
		list.add(30);
		list.add(30);
		list.add(30);
		list.print();

		new P_01_RemoveDups().removeDups(list);
		list.print();
	}
}
