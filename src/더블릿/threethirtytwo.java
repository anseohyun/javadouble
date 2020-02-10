//	���α׷� ��: arith_seq(open) : ��������
//	���ѽð�: 1 ��

//	���������̶� ������ �װ��� ���̰� ������ ������ ���Ѵ�.
//	���� ��� ���� ������ �̷�� ������ n �ױ��� ���� �ϸ�,
//	1,3,5,7,9,...,2n-1
//	�� ������ ����(ù° ��) a �� 1 �̰� ������ ���� ���� d �� 2 (����) �� ���� �����̴�.
//	���� ������ �� ���� ���� ����
//	2,4,6,8,10,...,2n
//	1,5,9,13,...,4n-3
//	-1,-3,-5,-7,...,-2n+1
//	������ ���� a �� ���� d �� an �� �־��� �� �� �� an �� �� ��° �� �ΰ� ã�� ���̴�.

//	�Է�
//	�� ���� a , d , an �� �־�����. -1000 < a,d < 1000 , -100000 < an < 100000
//	�� , d �� 0 �� �ƴϴ�.
//	���
//	an �� �� ��° �� �� ���� ����Ѵ�. ���� �� ������ ���� �ƴϸ� X �� ����Ѵ�.

//	����� ��
//	�Է�
//	1 2 9
//	���
//	5
//	�Է�
//	2 2 9
//	���
//	X

package ����;

import java.util.Scanner;

public class threethirtytwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int d = sc.nextInt();
		int an = sc.nextInt();
		
		int num = 1;
		boolean correct = false;
		
		for(int i = a ; -100000 < i && i < 100000 ; i = i + d)
		{
			if(an == i)
			{
				correct = true;
				break;
			}
			else
			{
				correct = false;
			}
			num++;
		}
		
		if(correct == true)
		{
			System.out.println(num);
		}
		if(correct == false)
		{
			System.out.println("X");
		}
		

	}

}
