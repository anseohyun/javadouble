//	���α׷� ��: fact
//	���ѽð�: 1 ��
//	
//	�ڿ��� n �� ���ؼ� n!(n ���丮��) �� ������ ���� ��� �Ѵ�.
//	������ n �� �־��� �� n! �� ���ϴ� ���α׷��� �ۼ��ϴ� ���̴�.
//	
//	�Է�
//	12 ������ �ڿ����� �Է����� �־�����.
//	���
//	n! ���� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	5
//	���
//	120
 

package ����;

import java.util.Scanner;

public class threeseventeen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 1;

		for(int i = 1; i<=num;i++)
		{
			sum = sum*i;
		}
		System.out.println(sum);

	}
}