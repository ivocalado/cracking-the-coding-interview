package cracking_code.tools;

public class MyNode<T> {
	T value;
	MyNode<T> nextNode = null;
	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}
	/**
	 * @return the nextNode
	 */
	public MyNode<T> getNextNode() {
		return nextNode;
	}
	/**
	 * @param nextNode the nextNode to set
	 */
	public void setNextNode(MyNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	
}