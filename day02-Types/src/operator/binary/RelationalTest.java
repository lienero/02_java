package operator.binary;

/**
 * <, >, <=, >=, ==, !=
 * 
 * �� ������ ���� ���ϴ� 
 * �񱳿����ڸ� �׽�Ʈ�ϴ� Ŭ����
 * 
 * ���� ������ ����� boolean Ÿ������ �����
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class RelationalTest {

	public static void main(String[] args) {
		// 1. ����, 2. �ʱ�ȭ
		int a = 1; 
		int b = -5;
		
		// 3. �񱳿����� ���
		System.out.println("� �� ������");
		System.out.println("--------------------------");
		
		System.out.printf("(%d == %d) : %b%n", a, b, (a == b));
		System.out.printf("(%d != %d) : %b%n", a, b, (a != b));
		
		System.out.println("--------------------------");
		System.out.println("��� �� ������");
		System.out.println("--------------------------");
		
		System.out.printf("(%d > %d) : %b%n", a, b, (a > b));
		System.out.printf("(%d < %d) : %b%n", a, b, (a < b));
		System.out.printf("(%d >= %d) : %b%n", a, b, (a >= b));
		System.out.printf("(%d <= %d) : %b%n", a, b, (a <= b));
		
		// ��Ŭ���� IDE �� ����Ű
		// ctrl + d : Ŀ���� �ִ� �� ��ü ����
		// alt + shift + a : ������ ���� ��� ���
		// alt + up/down : �� ��ü ���� �̵�
		// ctrl + shift + l : ����Ű ���� �ȳ�â ����
		// ctrl + F6 : ���� �ִ� ���� ���̿� �̵�
		
		
	}

}
