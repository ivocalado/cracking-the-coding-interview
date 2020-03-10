package cracking_code.tools;



public class MyLinkedList<T> {
	MyNode<T> head = null;
	MyNode<T> tail = null;
	int sz;

	public MyLinkedList() {
		head = new MyNode<T>();
		tail = head;
		sz = 0;
	}

	public void add(T value) {
		MyNode<T> newNode = new MyNode<T>();
		newNode.value = value;
		tail.nextNode = newNode;
		tail = newNode;
		sz++;
	}
	
	public MyNode<T> _get(int index) {
		if (index >= sz || index < 0)
			throw new IndexOutOfBoundsException();
		MyNode<T> currentNode = head;
		int counter = 0;
		do {
			currentNode = currentNode.nextNode;
		} while (counter++ < index);
		return currentNode;
	}
	
	public void insert(T value, int index) {
		if(index < 0 || index > sz)
			throw new IndexOutOfBoundsException();
		MyNode<T> newNode = new MyNode<T>();
		newNode.value = value;
		MyNode<T> previousNode;
		if(index == 0)
			previousNode = head;
		else
			previousNode = _get(index - 1);
		newNode.nextNode = previousNode.nextNode;
		previousNode.nextNode = newNode;
		if(previousNode == tail)
			tail = newNode;
		sz++;
	}

	public T get(int index) {
		return _get(index).value;
	}
	
	public void remove(int index) {
		MyNode<T> currentNode = _get(index);
		MyNode<T> previousNode = null;
		if(index == 0)
			previousNode = head;
		else
			previousNode = _get(index - 1);
		previousNode.nextNode = currentNode.nextNode;
		if(currentNode == tail)
			tail = previousNode;
		sz--;
	}
	
	public boolean isEmpty() {
		return sz == 0;
	}
	

	public int size() {
		return sz;
	}
	
	public void print() {
		for(int i = 0; i < size(); i++) {
			System.out.print(get(i));
			if(i < size() - 1)
				System.out.print(" -> ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 10; i++)
			list.add(i);
		
		while(!list.isEmpty()) {
			System.out.println(list.get(0));
			list.remove(0);
		}
			
	}
}
