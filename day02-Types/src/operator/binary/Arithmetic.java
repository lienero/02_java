package operator.binary;

/**
 * +, -, *, /, % : ���� ��� ������
 * ---------------------------------------------
 * �������� ���ʿ� ���� Ÿ�� ������ ���ؼ�
 * ��� ������ ����
 * 
 * ��� ������ �� ���� ������ �� �߿���
 * Ÿ���� ū ���� Ÿ������ ���߾� ����ȴ�.
 * 
 * @author Administrator
 *
 */
public class Arithmetic {

	public static void main(String[] args) {
		// 1. ����
		int input1;
		int input2;
		
		// 2. �ʱ�ȭ
		input1 = 222;
		input2 = 100;
		
		// 3. ���
		System.out.println("input1 + input2 =" + (input1 + input2));
		System.out.println("input1 - input2 =" + (input1 - input2));
		System.out.println("input1 * input2 =" + (input1 * input2));
		System.out.println("input1 / input2 =" + (input1 / input2));
		System.out.println("input1 % input2 =" + (input1 % input2));
		
		System.out.println("=============================================");
		System.out.println("input1 + input2 =" + input1 + input2);
		// input1 + intput2 �� ��ȣ�� ����Ͽ� �켱������ ������ ������
		// �ռ� ���ڿ��� ���տ����� ���� �Ͼ.

	}

}
