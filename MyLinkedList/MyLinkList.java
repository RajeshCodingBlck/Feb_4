package MyLinkedList;

public class MyLinkList {

	Node head;

	MyLinkList() {
		head = null;
	}

	// Add the Node At the Beginning
	public void addAtBegin(int val) {

		Node new_node = new Node(val);
		new_node.next = head;
		head = new_node;
	}

	public void display() {

		Node temp = head;
		while (temp != null) {

			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}

	// Add the Node At last
	public void addAtlast(int val) {

		if (head == null) {
			addAtBegin(val);
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		Node new_node = new Node(val);
		temp.next = new_node;
	}

	public void removeAtBegin() throws Exception {

		if (head == null) {
			throw new Exception("Kyu Nikal raha he");
		}
		Node temp = head.next;
		head.next = null;
		head = temp;
	}

	public void removeAtEnd() throws Exception {

		if (head == null) {
			throw new Exception("Can't Remove");
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	public void insertAtanyIndex(int index, int val) {

		int jump = index - 1;

		Node temp = head;
		while (jump > 0) {
			temp = temp.next;
		}
		Node new_node = new Node(val);
		Node temp2 = temp.next;
		temp.next = new_node;
		new_node.next = temp2;
	}

	public void RemoveAtIndex(int index) {

		int jump = index - 1;
		Node temp = head;
		while (jump > 0) {
			temp = temp.next;
		}
		temp.next= temp.next.next;
	}
	

}
