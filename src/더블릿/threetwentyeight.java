//	���α׷� ��: modular_inverse(open)
//	���ѽð�: 1 ��
//	��ȣ�п��� ��ⷯ �ι���(modular inverse)�� ���ϴ� ���� �ٽ����� �κ��̴�.
//	
//	x , m �� �־�����. 0 < x < m
//	x �� ��ⷯ �ι����� ���� ������ �����ϴ� ������ ���� n �̴�.( 0 < n < m )
//	x*n �� m ���� ���� �� �������� 1 �̴�.
//	���� ��� , 4*13 = 52 = 17 * 3 + 1 ���� 52 �� 17 �� ���� �� �������� 1 �̴�. �׷��� 13,4 �� ��(modulo) 17 �� ���� modular inverse �̴�.
//	x �� m �� �־��� �� ��ⷯ �ι��� n �� ���ϴ� ���� �����̴�.
//	
//	�Է�
//	�ڿ��� x �� m �� �־�����. (m <= 100)
//	���
//	���� ���� ��� "No such integer exists." �� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	4 17
//	���
//	13
//	�Է�
//	6 10
//	���
//	No such integer exists.

package ����;

import java.util.Scanner;

public class threetwentyeight {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int m = sc.nextInt();
		int check = 0;
		
		for(int i = 1 ; i < m ; i++)
		{
			if((x*i)%m == 1)
			{
				System.out.println(i);
				check = 1;
				break;
			}
		}
		if(check == 0)
		{
			System.out.println("No such integer exists.");
		}
		
	}

}
