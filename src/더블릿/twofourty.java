//	���α׷� ��: queen
//	���ѽð�: 1 ��
//	
//	N*M ���ڿ��� ������ �� �밢��,���� ���μ����� �������� Queen�� �� �� ���ٰ� �� ��, Quuen�� ��ġ�� �� �ִ� �ִ� ������ ���ϴ� �����̴�.
//	�Ʒ��� ���� 6*6 ���ڿ����� 6���� ��ġ�� �� �ִ�.
//	
//	�Է�
//	�Է��� ù �ٿ��� �������� ũ�⸦ ��Ÿ���� N(4 <= N <= 263-1) �� �������� ũ�⸦ ��Ÿ���� M(4 <= M <=263-1) �� �־�����.
//	���
//	�ִ�� ��ġ�� �� �ִ� Queen�� ���� ����Ͽ���.
//	
//	����� ��
//	�Է� ��
//	6 6
//	��� ��
//	6

package ����;

import java.util.Scanner;

public class twofourty {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		if(N < M)
		{
			System.out.println(N);
		}
		else
		{
			System.out.println(M);
		}

	}

}
