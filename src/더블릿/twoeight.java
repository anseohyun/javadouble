//	���α׷� ��: div_mul(open)
//	���ѽð�: 1 ��
//	
//	a,b,q �� �����̰� ���� ���� ������ ��
//	b = a�� q (��,a��0)
//	a �� b �� ���, b �� a �� ����� ��ӵǾ� ����.
//	a �� b �� ����̸� a | b �� ǥ���ϰ� �׷��� ������ a �� b �� ǥ���Ѵ�.
//	
//	�Է�
//	�� ���� m , n �� ���ʷ� �־�����. m , n ������ 0 �� �Էµ� �� �ִ�. (-100 <= m,n <= 100)
//	����� 0 �� ��� ���� ����̰� � ���� ����� �� �� ����.
//	���
//	��ȣ �� �� !| �� ����Ѵ�.
//	m �� n �� ����̸� m | n �� �ƴϸ� m !| n �� ����Ѵ�. ���ڿ� ��ȣ ���̿��� �� ĭ�� ������ �д�.
//	
//	����� ��
//	
//	�Է�
//	2 4
//	���
//	2 | 4
//	
//	�Է�
//	3 4
//	���
//	3 !| 4

package ����;

import java.util.Scanner;

public class twoeight {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		if(m != 0)
		{
			if(n%m == 0)
			{
				System.out.println(m+" | "+n);
			}
			else
			{
				System.out.println(m+" !| "+n);
			}
		}
		else
		{
			System.out.println(m+" !| "+n);
		}

	}

}
