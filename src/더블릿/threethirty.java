//	���α׷� ��: ftod(open)
//	���ѽð�: 1 ��
//	
//	0 �� 1 ������ �м��� �Է����� �־��� �� �Ҽ����� k �ڸ����� ����ϴ� �����̴�.
//	
//	�Է�
//	�� ���� �Է����� �־�����.
//	���ʴ�� ����, �и� ,ǥ���� �Ҽ����� �ڸ� k �̴�. ���� ��� 1000 ������ �ڿ����̴�.
//	���
//	��� ���� �������� ����Ѵ�.
//	�Ҽ����� ��ȿ�ڸ��� �����ϴ� ���� ����ǰ� �ݿø��� ���� �ʴ´�.
//	
//	����� ��
//	�Է�
//	6 7 2
//	���
//	0.85

package ����;

import java.util.Scanner;

public class threethirty {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numerator = sc.nextDouble();
		double denominator = sc.nextDouble();
		int k = sc.nextInt();
		String fraction = String.format("%."+k+"f", numerator/denominator);
		
		System.out.println(fraction);
	}

}
