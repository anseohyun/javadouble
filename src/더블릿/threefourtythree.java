//	���α׷� ��: rprime
//	���ѽð�: 1 ��
//	
//	�� ���� ���� ��(relatively prime)
//	�� ���� ������� 1 ���� �����ϴ� �� �� �ִ� ������� 1 �� ��
//	���� ���� ���� ���
//	4 �� 9 , 5 �� 8 , 8 �� 9 ...
//	
//	�Է�
//	�� ���� �Է����� �־�����. �� ���� 1000 ������ �ڿ����̴�.
//	���
//	���� ���̸� yes �ƴϸ� no �� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	4 9
//	���
//	yes
//	�Է�
//	4 7
//	���
//	yes
//	�Է�
//	6 8
//	���
//	no

package ����;

import java.util.Scanner;

public class threefourtythree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int small;
		int check = 0;
		
		if(num1 >= num2)
		{
			small = num2;
		}
		else
		{
			small = num1;
		}
		
		for(int i = 2 ; i <= small ; i++)
		{
			if(num1 % i == 0)
			{
				if(num2 % i == 0)
				{
					check++;
					System.out.println("no");
					break;
				}
			}
		}
		
		if(check == 0)
		{
			System.out.println("yes");
		}
			

	}

}
