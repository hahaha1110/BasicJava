package chapter19;

/**
 * *���� ���� ������ 
 * 	public : ��𼭳�
 *  default : ���� ��Ű��������
 *  protected : default + ��Ӱ��迡 �ִ� Ŭ�������� ���� ����
 *  private : Ŭ�������ο�����
**/
public class ObjectFinalize {
	
	public static void main(String[] args) {
		Person p1 = new Person("������");
		Person p2 = new Person("������");
		
		// ���� ����� ������ �÷����� ������� ����
		p1 = null;
		p2 = null;
		
		System.gc(); // ������ �÷����� ������ ��û
		System.runFinalization(); // �Ҹ��� ������ �ν��Ͻ��� finalize �޼ҵ� ȣ���� ��û
		System.out.println("end of program");
	}
}//ObjectFinalize
