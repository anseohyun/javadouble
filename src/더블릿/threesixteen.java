//	���α׷� ��: Nsum(open)
//	���ѽð�: 1 ��
//	
//	N �� �־��� ��, 1+2+��+(N-1)+N �� ���ϸ� M �� ���� �� �ִ�. M �� �־��� ��, N �� ���Ͽ���.
//	
//	�Է�
//	ù° �ٿ� 1~N �� �� M �� �Էµȴ�. ���� ���Ҽ� ���� ���� �Է����� �־����� �ʴ´�.
//	���
//	ù° �ٿ� N �� ����Ѵ�. N �� Ŀ�� 100 �� ���� �ʴ´�.
//	
//	����� ��
//	�Է�
//	45
//	���
//	9

package ����;

import java.util.Scanner;

public class threesixteen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int i;
		
		for(i = 1 ; true ; i++)
		{
			sum = sum - i;
			if(sum==0)
			{
				System.out.println(i);
				break;
			}
			else if(sum<0)
			{
				break;
			}
		}

	}

}
