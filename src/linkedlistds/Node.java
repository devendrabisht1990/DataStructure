package linkedlistds;

public class Node {
	
	private Object data;
	
	private Node nextNode;
	
	public Node(Object obj){
		this.data=obj;
	}
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString(){
		return data.toString();
	}
	
	

}
