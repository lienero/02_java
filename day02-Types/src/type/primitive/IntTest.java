package type.primitive;

/**
 * int : ������ Ÿ���� ���� �⺻/��ǥ Ÿ��
 * ----------------------------------------
 * int Ÿ���� �׽�Ʈ�ϴ� Ŭ�����̴�.
 * @author Administrator
 *
 */
public class IntTest {

	public static void main(String[] args) {
		// 1. ����, 2. �ʱ�ȭ
		// ������ ��, �� �ٿ� ������ �޸�(,)�� �����Ͽ�
		// ������ ���� ����
		// �� ��, Ÿ���� �� �տ� �ѹ��� �����ϸ� �ȴ�.
		int num1 = 5, num2 = 28;
		int num3, num4, num5;
		
		int num6;
		int num7;
		int num8;
		
		// num3, num4, num5 �� ���ؼ�
		// num1, num2�� ���� ����� �ʱ�ȭ
		num3 = num1 * num2; // ����
		num4 = num2 / num1; // ������ ��
		num5 = 25 / num1;   // ������ ��
		
		// 3. ��� : ���� �� ���
		System.out.println("5 * 28 = " + num3);
		System.out.println("28 / 5 = " + num4);
		System.out.println("25 / 5 = " + num5);
	}

}
