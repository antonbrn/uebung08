package h2;

public class SimpleList {

	public Node head;

	public SimpleList() {
		head = new Node(Integer.MIN_VALUE);
	}

	public Node getFirst() {
		if (head.next != null) {
			return head.next;
		}
		return null;
	}

	public Node getLast() {
		if (getFirst() != null) {
			Node hilf = getFirst();
			while (hilf.next != null) {
				hilf = hilf.next;
			}
			return hilf;
		}
		return null;
	}

	public void append(int newValue) {
		if (head.next == null) {
			head.next = new Node(newValue);
		} else {
			getLast().next = new Node(newValue);
		}
	}

	public Node findFirst(int value) {
		if (getFirst() != null) {
			Node hilf = getFirst();
			while (hilf.value != value && hilf.next != null) {
				hilf = hilf.next;
			}
			if (hilf.value == value) {
				return hilf;
			}
		}
		if (value == Integer.MIN_VALUE) {
			return head;
		}
		return null;
	}

	public boolean insertAfter(int preValue, int newValue) {
		Node preNode = findFirst(preValue);
		if (preNode != null) {
			Node neu = new Node(newValue);
			neu.next = preNode.next;
			preNode.next = neu;
			return true;
		}
		return false;
	}

	public boolean delete(int value) {
		Node loeschen = findFirst(value);
		if (loeschen == head) {
			return false;
		}
		
		if (loeschen != null) {
			Node hilf = head;
			while (hilf.next.value != loeschen.value) {
				hilf = hilf.next;
			}
			hilf.next = loeschen.next;
			return true;
		}
		return false;
	}
 
}
