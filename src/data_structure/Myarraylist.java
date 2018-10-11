package data_structure;

public class Myarraylist {
	public static void main(String[] args) {
		Myarraylist m=new Myarraylist();
		System.out.println(m.toString());
	}
	private Node firstnode;
	private Node lastnode;
	int size;
	class Node{
		Node next;
		Node prv;
	    Object e;
		Node(Object e){
			this.e=e;
		}
	};
	//÷ÿ–¥tostring∑Ω∑®
	public String toString() {
		if(size==0) {
		return "[]";	
		}
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		Node node=this.firstnode;
		for (int i = 1; i <=size; i++) {
			sb.append(node.e);
			if (i != size) {
				sb.append(",");
			} else {
				sb.append("]");
			}
			node = node.next;
		}
		return toString();
	}
	
	
	
	
	
}
