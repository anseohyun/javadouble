//	���α׷� ��: center1
//	���ѽð�: 1 ��
//	
//	���� ������ ������ �� n �� �߰����� �Ѵ�.
//	1 + 2 + 3 + ... + n-1 = (n+1) + (n+2) + (n+3)+ ..+ (n+m) (m�� 1 �̻��� �ڿ���)
//	���� ��� , 4 �� 1+2+3=6 �̰� 5 ���� ���ʴ�� ���ذ� �� 5+6=11 �̹Ƿ� 4 �� �߰����� �� �� ����.
//	6 �� 1+2+3+4+5=15 �̰� 7+8=15 �̹Ƿ� 6 �� �߰����̴�.
//	���� �ϳ��� �Է����� �޾� �߰��� ������ �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	
//	�Է�
//	10,000 ������ �ڿ����� �Է����� �־�����.
//	���
//	�߰����̸� O , �ƴϸ� X �� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	6
//	���
//	O
//	�Է�
//	10
//	���
//	X

package ����;

import java.util.Scanner;

public class threetwentysix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum_1 = 0;
		int sum_2 = 0;
		
		for(int i = 1 ; i < num ; i++)
		{
			sum_1 = sum_1 + i;
		}

		for(int j = (num+1) ; j >= (num+1) ; j++)
		{
			sum_2 = sum_2 + j;
			
			if(sum_2>sum_1)
			{
				System.out.println("X");
				break;
			}
			else if(sum_2==sum_1)
			{
				System.out.println("O");
				break;
			}
		}
		
	}

}
