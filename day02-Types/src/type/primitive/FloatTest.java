package type.primitive;
/**
 * float, double : �Ǽ���(�Ҽ��� ǥ�� ����) �����͸�
 * 				   ǥ��, ���� �� �� �ִ� Ÿ��
 * -----------------------------------------------
 * float Ÿ���� ������ ���� �Ҵ��� ����
 * ���� �ڿ� �빮�� F, �ҹ��� f�� ���̻�� ���δ�.
 * 
 * 
 * @author Administrator
 *
 */
public class FloatTest {

	public static void main(String[] args) {
		// 1. ����
		float pi1;
		double pi2;
		
		// 2. �ʱ�ȭ
		pi1 = 3.14F;
		pi2 = 3.14;
		
		// 3. ��� : ���� �� ���
		System.out.println("float pi=" + pi1);
		System.out.println("double pi=" + pi2);
		System.out.println("=====================================");
		
		pi1 = 3.141592653589793238462643383279502884197169F;
		pi2 = 3.141592653589793238462643383279502884197169;
		System.out.println("float pi=" + pi1);
		System.out.println("double pi=" + pi2);

	}

}
