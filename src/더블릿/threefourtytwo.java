//	���α׷� ��: prime
//	���ѽð�: 1 ��
//	
//	1 ���� ū ���� N �� 1 �� N �ڽ� �̿��� ���� ����� ������ ���� ���� N �� �Ҽ���� �θ���.
//	�̸��׸�, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 ���� ��� �Ҽ��̴�.
//	4, 6, 16 ��� ���� �Ҽ��� �ƴϸ鼭 2 �̻��� �ڿ����� �ռ������ �����ϸ�,
//	1 �� �Ҽ��� �ƴϰ� �ռ����� �ƴ� ���̴�.
//	�־��� �ڿ��� N �� �Ҽ����� �ƴ����� �����϶�.
//	
//	�Է�
//	30,000 ������ �ڿ����� �Է����� �־�����.
//	���
//	�� ���� �Ҽ�(prime number)�̸� 'prime' �ƴϸ� 'not prime' �� ����Ͻÿ�.
//	
//	����� ��
//	�Է�
//	4
//	���
//	not prime
//	�Է�
//	7
//	���
//	prime

package ����;

import java.util.Scanner;

public class threefourtytwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int check = 0;
		
		for(int i = 2 ; i < num ; i++)
		{
			if(num%i == 0)
			{
				check++;
			}
		}
		
		if(check > 0)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}

	}

}
