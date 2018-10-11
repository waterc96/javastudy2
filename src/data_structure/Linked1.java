package data_structure;
//编写双向链表
public class Linked1 {
private Node firstnone;
private Node lastnone;
private int size;
public Node getFirstnone() {
	return firstnone;
}
public void setFirstnone(Node firstnone) {
	this.firstnone = firstnone;
}
public Node getLastnone() {
	return lastnone;
}
public void setLastnone(Node lastnone) {
	this.lastnone = lastnone;
}
public int size() {
	return size;
}
public Boolean isempty() {
	return size==0;
	}
class Node{
	Node next;//下一个
	Node prev;//上一个
	Node node;
    Object ele;
		public Node(Object ele) {
			this.ele = ele;
		}
 };
 
 public void addfirst(Object ele) {
	 Node node =new Node(ele);
	 if(size==0) {
		 this.firstnone=node;
		 this.lastnone=node;
	 }else {
		 node.next=this.firstnone;
		 this.firstnone.prev=node;
		 this.firstnone=node;
	 }
	 
	 size++;
	 
 }
 public void addlast(Object ele) {
	 Node node =new Node(ele);
	 if(size==0) {
		 this.lastnone=node;
		 this.firstnone=node;
	 }else {
		    node.prev = this.lastnone;
			this.lastnone.next = node;
			this.lastnone = node;
	 }
	 size++; 
 }
 public void removefirst() {
		 	this.firstnone=this.firstnone.next;
		 	this.firstnone.prev=null;
		 	size--;
 }
 public void removelast() {
	 	this.lastnone=this.lastnone.prev;
	 	this.lastnone.next=null;

	 	size--;
}
 
 public void remove(Object ele) {
		// 找到要删除的节点
		Node current = this.firstnone;
		for (int i = 0; i < size; i++) {
			if (!current.ele.equals(ele)) {
				if (current.next == null) {
					return;
				}
				current = current.next;
			}
		}

		if (current == this.firstnone) {
			this.firstnone = current.next;
			this.firstnone.prev = null;
		} else if (current == this.lastnone) {
			this.lastnone = current.prev;
			this.lastnone.next = null;
		} else {
			// 把删除节点的上一个节点的next指向删除节点的下一个节点
			current.prev.next = current.next;
			current.next.prev = current.prev;
		}

		size--;

	}
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[");
		Node node = this.firstnone;
		for (int i = 1; i <=size; i++) {
			stringBuilder.append(node.ele);
			if (i != size) {
				stringBuilder.append(",");
			} else {
				stringBuilder.append("]");
			}
			node = node.next;
		}
		return stringBuilder.toString();}
//addFirst addLast removFirst removLast
}

