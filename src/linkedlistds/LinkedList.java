//java linkedlist is doubley ended list. so insert time is o(1).
package linkedlistds;

public class LinkedList {
	
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void addNodeAtStart(Object data){
		Node node = new Node(data);
		node.setNextNode(head);
		head = node;
	}
	
	public void addNodeAtEnd(Object obj){
		Node node = new Node(obj);
		Node currentNode = head;
		if(head==null){
			head = node;
		}
		else{
		while(currentNode.getNextNode()!=null){
			currentNode =currentNode.getNextNode();
			}
		currentNode.setNextNode(node);
		}
		
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		Node currentNode = head;
		while(currentNode.getNextNode()!=null){
			sb.append(currentNode.toString()+" ,");
			currentNode =currentNode.getNextNode();
		}
		sb.append(currentNode.toString());
		sb.append("}");
		return sb.toString();
	}
	

}
