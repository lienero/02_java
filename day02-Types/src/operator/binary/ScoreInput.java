package operator.binary;

import java.util.Scanner;

/**
 * &&, || :������ AND, OR ������
 * --------------------------------
 * �ݵ�� ��ȣ�� �� �� ���ļ� �� ��
 * 
 * �Էµ� ������ 0 ~ 100 ������ ������
 * �Ǵ��ϴ� Ŭ����
 * 
 * �������� && �� �׽�Ʈ�Ѵ�.
 * @author Administrator
 *
 */

public class ScoreInput {

	public static void main(String[] args) {
		// 1. ����
		// �Է°� ������ ���� ����
		int score;
		
		// �Է�ó���� ���� ��ĳ�� ����
		Scanner  scan; // import : ctrl + shift + o ����Ű�� �Է�
		
		// 2. �ʱ�ȭ
		// ��ĳ�� �ʱ�ȭ
		scan = new Scanner(System.in);
		// ������ ��ĳ�ʷ� ���� �Է��Ͽ� �ʱ�ȭ
		score = scan.nextInt();
		
		// 3. �Էµ� ���� ������ �Ǵ�
		// 0 <= score <= 100
		/*
		 * WHERE score >= 0
		 *   AND score <= 100
		 *   
		 */
		if (score >= 0 && score <= 100) {
			System.out.printf("%d ��(��) ��ȿ�� �����Դϴ�.%n", score);
		} else {
			System.out.printf("%d ��(��) ������ ��� �����Դϴ�.%n", score);
		}
		
	}

}
