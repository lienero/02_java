package type.primitive;
/**
 * long : int ���� ū ������ �����ϴ� Ÿ��
 * ---------------------------------------
 * long Ÿ���� ������ ���� �Ҵ��� ����
 * ���� �ڿ� �빮�� L, �ҹ��� l �� �ٿ���
 * �Ҵ��ؾ� �Ѵ�.
 * ---------------------------------------
 * 
 * @author Administrator
 *
 */
public class LongTest {

	public static void main(String[] args) {
		// 1. ����
		long miliSecond;
		
		// 2. �ʱ�ȭ
		miliSecond = 1000;
		System.out.println("mili Second=" + miliSecond);
		
		miliSecond = 3000L;
		System.out.println("mili Second=" + miliSecond);
		
		miliSecond = 5000l;
		System.out.println("mili Second=" + miliSecond);
	}

}
