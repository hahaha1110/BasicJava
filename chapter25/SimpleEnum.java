package chapter25;

// ������
enum Scale{
	DO, RE, MI, FA, SO, RA, TI // public static final ����� ������ ����(�������̽� ���� ����� ������ ��������)
}

public class SimpleEnum {
	public static void main(String[] args) {
		Scale sc = Scale.DO;
		System.out.println(sc);
		
		switch (sc) {// �⺻������ ������ ���� Scale.DO���� ǥ�������� case�������� �����ϰ� ǥ���ϱ�� ��ӵǾ�����
		case DO:
			System.out.println("��");
			break;
		case RE:
			System.out.println("��");
			break;
		case MI:
			System.out.println("��");
			break;
		case FA:
			System.out.println("��");
			break;
		case SO:
			System.out.println("��");
			break;
		case RA:
			System.out.println("��");
			break;
		case TI:
			System.out.println("��");
			break;
		default:
			break;
		}
	}
}
