package type.primitive;
/**
 * char : ���� 1���� �����ϴ� Ÿ��
 * 
 * ���������δ� ���ڷ� �����ϴ� Ư¡�� �ִ�
 * @author Administrator
 *
 */
public class CharTest {

	public static void main(String[] args) {
		// 1. ���� : Ÿ���̸� �����̸�;
		char input;
		
		// 2. �ʱ�ȭ :�����̸� = ��;
		input = 'a';
		/*
		input = 'A+'; // �� ���� �̻��� �����Ϸ��ϴ� ����
		input = A;	  // '' ����ǥ �ȿ� ���ڸ� ���� �ʾ����Ƿ� ����
		*/
		// 3. ���
		System.out.println("input=" + input);
		
		// 4. char �� ���������� ���ڷ� ����Ǵ� �� Ȯ��
		// ������ �����ϴ� ���� code �� �����ϸ鼭
		// ���ڸ� �����ϴ� ���� input �� ���� ����
		int code = input;
		
		System.out.println("code="+ code);
		
		// code �� ������ �����ϴ� �����̹Ƿ�
		// + 1 �ϴ� ��������� �Ͽ� ���� ������Ű��
		code = code + 1;
		System.out.println("code="+ code);
		// + 1 ������ �������� ������ ����(char)�� �ٲپ� ���
		System.out.println("(char)code="+ (char)code);
		
	}

}
