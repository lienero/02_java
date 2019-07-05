package type.casting;
/**
 * ������ ������ ���̿�
 * �� ��ȯ(Type Casting)��
 * �׽�Ʈ�ϴ� Ŭ�����̴�.
 * 
 * @author Administrator
 *
 */
public class TypeCastingTest {

	public static void main(String[] args) {
		// 1. ����, 2. �ʱ�ȭ
		double pi = 3.1415926535797;
		int number = 100;
		int result;
		
		// 3. �� ��ȯ : (Ÿ���̸�) �ǿ��갪;
		result = number + (int) pi;
		
		// 4. ��� : �� ���
		System.out.println("double pi=" + pi);
		System.out.println("int number=" + number);
		System.out.println("int result=" + result);
		
		// 5. byte Ÿ������ result �� ��ȯ ����
		byte buffer = (byte) result;
		System.out.println("int result=" + result);
		System.out.println("byte buffer=" + buffer);
	}

}
