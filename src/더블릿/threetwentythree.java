//	���α׷� ��: complete
//	���ѽð�: 1 ��
//	
//	�������� �ڽ��� ������ ����� ���� �ڽ��� �Ǵ� ���� �������� �Ѵ�.
//	6 �� �������̴�. 6 �� �����
//	1 2 3 6
//	�� �� �ڽ��� ������ ����� �� 1 + 2 + 3 = 6 �� 6 �� �������̴�.
//	
//	�Է�
//	1000 ������ �ڿ����� �Է¹޴´�.
//	���
//	�������̸� yes , �ƴϸ� no �� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	6
//	���
//	yes
//	�Է�
//	8
//	���
//	no

package ����;

import java.util.Scanner;

public class threetwentythree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		
		for(int i = 1; i < num ; i++)
		{
			if(num%i == 0)
			{
				sum = sum + i;
			}
		}
		
		if(sum == num)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}