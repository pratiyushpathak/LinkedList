public class SNode {
	//data members
	private int data;
	private SNode next;
	//constructor
	public SNode(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	//getter setters
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public SNode getNext() {
		return next;
	}
	public void setNext(SNode next) {
		this.next = next;
	}
}
