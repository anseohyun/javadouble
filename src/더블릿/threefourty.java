//	���α׷� ��: gcd_lcm
//	���ѽð�: 1 ��
//	
//	�� ���� �ִ� ������� �ּ� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	
//	�Է�
//	1000 ������ �ڿ����� �Է����� �޴´�.
//	���
//	�� �ٿ� �� ���� ����Ѵ�. ù��° ���� �ִ� ������̰� , ���� ���� �ּ� ������̴�.
//	
//	����� ��
//	�Է�
//	4 6
//	���
//	2 12

package ����;

import java.util.Scanner;

public class threefourty {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int big;
		int small;
		int max = 0;
		
		
		if(num1 > num2)
		{
			big = num1;
			small = num2;
			
		}
		else
		{
			big = num2;
			small = num1;
		}
				
		for(int i = 1 ; i <= big ; i++)
		{
			if(num1 % i == 0)
			{
				if(num2 % i == 0)
				{
					if(max < i)
					{
						max = i;
					}
				}
			}
		}
		
		System.out.print(max + " ");
		
		int min = big*small;
		
		for(int i = 1 ; min > big*i ; i++)
		{
			for(int j = 1 ; big*i >= small*j ; j++)
			{
				if(big*i == small*j)
				{
					if(min > big*i)
					{
						min = big*i;
					}
				}
			}
		}
		
		System.out.print(min);
		
		

	}

}
