//	���α׷� ��: equation
//	���ѽð�: 1 ��
//	
//	����� ���� �������� ���� �ִ�.
//	ax + b = cx + d
//	�� �÷� a,b,c,d �� �־��� �� �������� ��(��)�� ���ϴ� ���� ���α׷����� �ذ��Ϸ��� �Ѵ�.
//	
//	�Է�
//	a , b , c, d �� �Է����� �־�����. �� ���� -1000 �̻� 1000 ���� �����̴�.
//	���
//	���� �� �� �̻� �����ϸ� many , �������� ������ none �ƴϸ� ���� ���� �Ҽ� ���� ���ڸ����� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	3 2 3 2
//	���
//	many
//	�Է�
//	3 2 3 8
//	���
//	none
//	�Է�
//	4 2 3 8
//	���
//	6.000

package ����;

import java.util.Scanner;

public class twotwentythree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double d = sc.nextInt();
		String result = String.format("%.3f", (d-b)/(a-c));
		
		if(a == c && b == d)
		{
			System.out.println("many");
		}
		else if(a == c && b != d)
		{
			System.out.println("none");
		}
		else
		{
			System.out.println(result);
		}
		
	}

}
