//	���α׷� ��: even_odd(open)
//	���ѽð�: 1 ��
//	¦,Ȧ������ ���� ���� �����
//	���������� ¦��(even)���� , Ȧ��(odd)������ ���� ¦���̰� , ¦/Ȧ���� ���� �ִ� ��� Ȧ���� �ȴٴ� ���� ,
//	���������� ���ϴ� �� �� �� ¦���� �ϳ��� �ִ� ��쿡�� ¦���� �ȴٴ� ���� �˾Ҵ�.
//	�̸� ��ǻ�ͷ� Ȯ�� �� ����� �ߴ�.
//	
//	�Է�
//	1000 ������ �� �ڿ����� �Է����� �־�����.
//	���
//	������� ��� ���� �������� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	5 8
//	���
//	odd+even=odd
//	odd*even=even
//	�Է�
//	8 5
//	���
//	even+odd=odd
//	even*odd=even
//	�Է�
//	5 3
//	���
//	odd+odd=even
//	odd*odd=odd

package ����;

import java.util.Scanner;

public class twowixteen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num_1 = sc.nextInt();
		int num_2 = sc.nextInt();
		String num1;
		String num2;
		
		if(num_1%2==0)
		{
			num1 = "even";
		}
		else
		{
			num1 = "odd";
		}
		if(num_2%2==0)
		{
			num2 = "even";
		}
		else
		{
			num2 = "odd";
		}
		
		if((num_1+num_2)%2 == 0)
		{
			System.out.println(num1+"+"+num2+"="+"even");
		}
		else
		{
			System.out.println(num1+"+"+num2+"="+"odd");
		}
		
		if((num_1*num_2)%2 == 0)
		{
			System.out.println(num1+"*"+num2+"="+"even");
		}
		else
		{
			System.out.println(num1+"*"+num2+"="+"odd");
		}

	}

}
