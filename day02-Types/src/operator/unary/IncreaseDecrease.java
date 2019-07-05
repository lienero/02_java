package operator.unary;

/**
 * ���׿����ڸ� �׽�Ʈ�غ��� Ŭ����
 * ---------------------------------
 * +,- : ��ȣ���� ������
 * 		 ������ ���ʿ� �ٿ��� �ش� ������ �ִ� ���� ����
 * 		 �ش� ������ �ִ� ���� ���� ��ȣ�� ����
 * ---------------------------------------------------------
 * ++,-- : ���� ������
 * 		   ������ ����/�����ʿ� �ٿ���
 * 		   �ش� ������ ���� 1�� ������ �ϰų�
 * 		   1�� ���ҽ�Ű�� ������ ����
 * ----------------------------------------------------------
 * @author Administrator
 *
 */
public class IncreaseDecrease {

	public static void main(String[] args) {
		// 1. ����, 2. �ʱ�ȭ
		int ten = 10;
		int count = 0;
		
		// 3. - �����ڷ� ��ȣ�� ����
		System.out.println("ten="+ ten);
		
		ten = -ten; // ==> -1 * ten);
		System.out.println("ten=" + ten);
		
		ten = -ten; // 
		System.out.println("ten=" + ten);
		
		ten = +ten; // ==> ���Ͽ��� : 1 * ten;
		System.out.println("ten=" + ten);
		
		// 4. ++, -- �����ڷ� count�� ���� ����
		System.out.println(++count); // count = count + 1 ������� ����
		System.out.println(count++); // count = count + 1 ����Ŀ� ����
		System.out.println(count);   // 2
		System.out.println(--count); // count = count - 1 ������� ����
		System.out.println(count--); // count = count - 1 ����Ŀ� ���� 
		System.out.println(count);   // 0
		System.out.println("=============================>");
		
		System.out.println(count++); 
		System.out.println(count++); 
		System.out.println(count++); 
		System.out.println(count++); 
		System.out.println(count++); 
		System.out.println(count);   
		
		System.out.println("=============================>");
		System.out.println(count--); 
		System.out.println(count--); 
		System.out.println(count--); 
		System.out.println(count--); 
		System.out.println(count--); 
		System.out.println(count);
	}

}
