package type.primitive;

/**
 * char : ���� 1���� �����ϴ� Ÿ��
 * --------------------------------
 * ���ڸ� �����ڵ� ǥ������� �����ϰ�
 * ����Ͽ� �׽�Ʈ�ϴ� Ŭ����
 * 
 * @author Administrator
 *
 */
public class CharUnicodeTest {

	public static void main(String[] args) {
		// 1. ����, 2. �ʱ�ȭ ���ÿ�
		char han = '\ud55c';
		char gul = '\uae00';
		// 3 .���
		System.out.println("han=" + han);
		System.out.println("gul=" + gul);
		System.out.println("han + gul=" + han + gul);
		
		System.out.println("===================================");

		System.out.println(han);
		System.out.println(gul);
		System.out.println(han + "" + gul);
	}

}
