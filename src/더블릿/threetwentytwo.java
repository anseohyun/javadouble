//	���α׷� ��: ft
//	���ѽð�: 1 ��
//	
//	�ڿ����� �Է����� �־�����. �� ���� ����� ����ϰ� , ���� �ٿ��� ����� ���� , 
//	���� �ٿ��� ����� ���� , ���� �ٿ��� ����� ���� ���� �ڸ����� ����Ѵ�.
//	
//	�Է�
//	�־����� ���� 1000 ������ �ڿ����̴�.
//	���
//	
//	����� ��
//	�Է�
//	6
//	���
//	1 2 3 6
//	4
//	12
//	6

package ����;

import java.util.Scanner;

public class threetwentytwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 0;
		int sum = 0;
		long time = 1;
		
		for(int i = 1 ; i <= n ; i++)
		{
			if(n%i == 0)
			{
				System.out.print(i + " ");
				num++;
				sum = sum + i;
				time = time * i%10;
			}
			
		}
		
		System.out.println();
		System.out.println(num);
		System.out.println(sum);
		System.out.println(time);
	}
}
