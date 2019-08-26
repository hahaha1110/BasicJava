package chapter23.que;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
	public static void main(String[] args) {
		// LinkedList �ν��Ͻ� ����
		Queue<String> que = new LinkedList<String>();
		
		que.offer("Box");
		que.offer("Toy");
		que.offer("Robot");
		
		// ������ ������ ������ Ȯ��
		System.out.println("next : " + que.peek());
		
		// ù ��°, �� ��° �ν��Ͻ� ������
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		// ������ ������ ������ Ȯ��
		System.out.println("next : " + que.peek());
		
		// ������ �ν��Ͻ� ������
		System.out.println(que.poll());
	}
}
