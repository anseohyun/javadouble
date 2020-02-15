//	���α׷� ��: triangular_sum(open)
//	���ѽð�: 1 ��
//	
//	n ��° �ﰢ�� T(n) ������ ����.
//	T(n) = 1 + 2 ... + n
//	T(4) �� �Ʒ��� ����.
//	   X
//	  X X
//	 X X X
//	X X X X
//	�ﰢ���� ����ġ�� �� w(n)�� ������ ���� ���ǵ� �� �̸� ���ϴ� ���� �����̴�.
//	
//	�Է�
//	300 ������ n �� �Էµȴ�.
//	���
//	w(n) ���� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	3
//	���
//	45

package ����;

import java.util.Scanner;

public class threetwentyseven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		int T = 0;
		
		for(int i = 1 ; i <= num ; i++)
		{
			for(int j = 1 ; j <= (i+1) ; j++)
			{
				T = T + j;
			}
			
			sum  = sum + i*T;
			T = 0;
		}
		
		System.out.println(sum);
	}

}
