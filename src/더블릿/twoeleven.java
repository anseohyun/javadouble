//	���α׷� ��:leap_year
//	���ѽð�:1 ��
//	
//	�ڿ����� �Է����� �޾� �����̸� YES , �ƴϸ� NO �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	�����̶� ,
//	4�� ����̰� 100 �� ����� �ƴ�.
//	400 �� �����
//	�� ������ �ϳ��� ���̸� ����
//	
//	�Է�
//	�ԷµǴ� ���� 3000 ������ �ڿ����̴�.
//	
//	����� ��
//	�Է�
//	4
//	���
//	YES
//	�Է� 
//	100
//	���
//	NO
//	�Է�
//	200
//	��� 
//	NO
//	�Է� 
//	400
//	���
//	YES

package ����;

import java.util.Scanner;

public class twoeleven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num%4==0 && num%100!=0)
		{
			System.out.println("YES");
		}
		else if(num%400==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
