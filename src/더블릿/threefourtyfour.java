//	���α׷� ��: tf
//	���ѽð�: 1 ��
//	
//	���� ���� n �� �Է����� �޾� n = o * 2^p �� �Ǵ� Ȧ�� o �� ���� p �� ���ϴ� ���� �����̴�.
//	���� ��� 24 �� �Է����� ������ o = 3 , p = 3 �̴�.
//	
//	�Է�
//	���� n �� �Է����� �־�����. ( 1 <= n <= 10^6 )
//	���
//	�� �ٿ� o �� p �� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	24
//	���
//	3 3

package ����;

import java.util.Scanner;

public class threefourtyfour {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int o;
		int p = 1;
		int P = 0;
		
		if(n == 1)
		{
			System.out.println(1 + " " + 0);
		}
		else
		{
			while(n > p)
			{
				p = p*2;
				P++;
				if(n%p == 0)
				{
					if((n/p)%2 == 1)
					{
						o = n/p;
						System.out.println(o + " " + P);
						break;
					}
				}
				else
				{
					System.out.println(n + " " + 0);
					break;
				}
			}
		}

	}

}
