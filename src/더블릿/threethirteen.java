//	���α׷� ��: 3np1
//	���ѽð�: 1 ��

//	������ �Է����� �޾�,
//	¦���̸� 2 �� ������ , Ȧ���̸� 3 ���ؼ� 1 �� ����
//	1 �� �� �� ���� �ݺ�
//	6 �� �Է����� �־�����
//	6 3 10 5 16 8 4 2 1
	
//	�Է�
//	1000 ������ �ڿ����� �Է����� �־�����.
//	���
//	���� ���ڸ��� ���� �����Ѵ�.
	
//	����� ��
	
//	�Է�
//	4
//	���
//	4 2 1

package ����;

import java.util.Scanner;

public class threethirteen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.print(num);
		
		while(num != 1)
		{
			if(num%2 == 0)
			{
				num = num/2;
				System.out.print(" "+num);
			}
			else
			{
				num = num*3+1;
				System.out.print(" "+num);
			}
		}

	}

}
