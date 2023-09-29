
import java.util.Scanner;

public class SinglyLinkedList {

	public static class Node {
		public int value;
		public Node next;

		Node(int value) {

			this.value = value;
		}

	}

	public static void printList(Node head) {

		if (head == null) {

			System.out.println("List empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.value);
				temp = temp.next;
				if (temp != null) {
					System.out.print("->");
				} else {
					System.out.println();
				}

			}
		}

	}

	public static Node addToHead(Node headNode, int value) {
		Node newNode = new Node(value);
		if (headNode != null) {
			newNode.next = headNode;

		}
		return newNode;

	}

	public static Node addToTail(Node headNode, int value) {

		Node newNode = new Node(value);

		if (headNode == null) {
			return newNode;

		} else {
			// Xac dinh Last Node
			Node lastNode = headNode;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}

			// Gan Last Node
			lastNode.next = newNode;
		}

		return headNode;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Node currentList = null;
		Node newList;

		System.out.println(" 1. Add to Head: \n 2. Add to Tail: \n Chon chuc nang:");

		int sw = sc.nextInt();

		switch (sw) {

		case 1:

			while (true) {

				System.out.println("Nhap phan tu moi vao dau list: ");
				int node = sc.nextInt();

				newList = addToHead(currentList, node);

				System.out.println("LinkedList sau khi them: ");
				printList(newList);

				currentList = newList;

			}
		case 2:

			while (true) {

				System.out.println("Nhap phan tu moi vao cuoi list: ");
				int node = sc.nextInt();

				newList = addToTail(currentList, node);

				System.out.println("LinkedList sau khi them: ");
				printList(newList);

				currentList = newList;

			}

		}

	}

}
