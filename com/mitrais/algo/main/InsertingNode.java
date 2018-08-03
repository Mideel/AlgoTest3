package com.mitrais.algo.main;

public class InsertingNode {
	
	public static class Node {
		
		public Node(int _value) {
			value = _value;
		}
		
		public int value;
		public Node next ;
		
		public int hashCode() {
			return value;
		}
		
		@Override
		public boolean equals(Object _n) {
			if(_n == null)
				return false ;
			
			Node arg = (Node) _n;
			if(this.value != arg.value)
				return false;
			
			if(next != null)
				return next.equals(arg.next);
			else {
				if(arg.next == null)
					return true ;
				else
					return false;
			}
		}
	}
	
	public static void insertNode(Node _head, Node _new) {
		if(_head == null || _new == null)
			return ;
		
		Node current = _head;
		Node prev = null;
		while(current != null) {
			if(current.value >= _new.value) {
				if(prev != null)
					prev.next = _new;
				_new.next = current;
				break;
			}
			prev = current;
			current = current.next ;
		}
	}
}
