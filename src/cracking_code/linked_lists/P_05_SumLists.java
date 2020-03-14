package cracking_code.linked_lists;

import cracking_code.tools.MyLinkedList;

public class P_05_SumLists {
	MyLinkedList<Integer> sumLists(MyLinkedList<Integer> listA, MyLinkedList<Integer> listB) {
		int a = 0;
		int power = 1;
		for (int i = 0; i < listA.size(); i++) {
			a += listA.get(i) * power;
			power *= 10;
		}

		int b = 0;
		power = 1;
		for (int i = 0; i < listB.size(); i++) {
			b += listB.get(i) * power;
			power *= 10;
		}
		int c = a + b;
		MyLinkedList<Integer> result = new MyLinkedList<Integer>();
		while (c > 0) {
			int valueToInsert = c % 10;
			result.add(valueToInsert);
			c -= valueToInsert;
			c /= 10;
		}

		return result;
	}
	
	public static void main(String[] args) {
		MyLinkedList<Integer> a = new MyLinkedList<Integer>();
		a.add(7);
		a.add(1);
		a.add(6);
		a.print();
		
		MyLinkedList<Integer> b = new MyLinkedList<Integer>();
		b.add(5);
		b.add(9);
		b.add(2);
		b.print();
		
		MyLinkedList<Integer> result = new P_05_SumLists().sumLists(a, b);
		result.print();
	}
}
