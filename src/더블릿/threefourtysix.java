//	���α׷� ��: bit_pos
//	���ѽð�: 1 ��
//	
//	���� ���� n �� �Է����� �޾� �� ���� �������� ��Ÿ������ �� 1 �� ��Ÿ���� ��ġ�� ���ϴ� ���� �����̴�.
//	���� �������� ��Ÿ������ �� ���� �������� �ڸ��� LSB(Least Significant Bit)�� �Ѵ�. LSB �� 0 �� ��ġ�� �����Ѵ�.
//	
//	�Է�
//	���� ���� n �� �Է����� �־�����. ( 1 <= n <= 10^6 )
//	���
//	1 �� ��Ÿ���� ��ġ�� ��� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	13
//	���
//	0 2 3

package ����;

import java.util.Scanner;

public class threefourtysix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int n = num;
		int i = -1;
		int rest = 0;

		while(n != 0 && n != 1)
		{
			rest = n%2;
			n = n/2;
			i++;
//			System.out.println(i);
//			System.out.println(n);
//			System.out.println(rest);
//			System.out.println();
			
			if(rest == 1)
			{
				System.out.print(i + " ");
//				System.out.println();		
			}
			
		}
		if(n == 1)
		{
			System.out.print(i+1);
		}
		

	}

}
