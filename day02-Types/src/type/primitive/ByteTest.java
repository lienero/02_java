package type.primitive;

/**
 * byte : 1byte(8bit) �� �ش��ϴ� ������ŭ
 * 		  ������ �����ϴ� Ÿ��
 * ----------------------------------------
 * 8bit = 2�� 8����
 *	    = 256
 *		= 256���� ���ڸ� ǥ������
 *		= -128 ~ 0 ~ 127 ���� ǥ������
 *	------------------------------------------
 * @author Administrator
 *
 */
public class ByteTest {

	public static void main(String[] args) {
		// 1. ����
		byte buffer;
		
		// 2. �ʱ�ȭ
		buffer = 0;
		
		// 3. ��� : ���
		System.out.println("buffer=" + buffer);
		
		// 4. ���� ����
		buffer = 127;
		System.out.println("buffer=" + buffer);
		
		buffer = -128;
		System.out.println("buffer=" + buffer);
		
		// 5. ���� ������ ��� ���� �����Ϸ��� �õ�
		// Type mismatch: cannot convert from int to byte
//		buffer = 128; 
			
	}

}
