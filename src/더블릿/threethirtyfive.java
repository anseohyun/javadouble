//	���α׷� ��: sc
//	���ѽð�: 1 ��
//	
//	������ �Է����� �޾� �� ������ �������� ���� ���ϴ� �����̴�.
//	�� ������ ������ ������ ����.
//	A : 100 - 90
//	B : 80 - 89
//	C : 70 - 79
//	D : 60 - 69
//	F : �� ��
//	
//	�Է�
//	1 ���� 100 ���� ������ �Է����� �־�����. �Էµ� ������ 100 ���� ���� �ʴ´�. -1 �� �Է��� ���̴�.
//	���
//	ù ���� �Էµ� ������ ���̰�
//	���� �� ���� ���ʴ�� A , B , C, D ,F ������ ���� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	100 90 60 58 -1
//	���
//	4
//	2
//	0
//	0
//	1
//	1
//	��� �� ����
//	4 �� �Էµ� ������ ���̰� , A ������ 2 �� , B,C ������ ���� D ������ 1 �� , F ������ 1 ��.

package ����;

import java.util.Scanner;

public class threethirtyfive {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int f = 0;
			
			int n = -1; 
			
			while(true)
			{
				int score = sc.nextInt();
				n++;
				
				if(score == -1)
				{
					break;
				}
				else if(score >=  90 && score <= 100)
				{
					a++;
				}
				else if(score >=  80 && score <= 89)
				{
					b++;
				}
				else if(score >=  70 && score <= 79)
				{
					c++;
				}
				else if(score >=  60 && score <= 69)
				{
					d++;
				}
				else
				{
					f++;
				}
			}
			
			System.out.println(n);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(f);
			

	}

}
