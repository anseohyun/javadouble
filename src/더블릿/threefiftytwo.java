//	���α׷� ��: count
//	���ѽð�: 1 ��
//	
//	�׸��� ���� ��Ģ�� ������ ������ �ִ�.
//	ù ���� 1/1 , �� ��° ���� 1/2 , �� ��° ���� 2/1 , �� ��° ���� 3/1 , �ټ��� ° ���� 2/2, ...
//	�� ��° �׿� ����� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
//	
//	�Է� ����
//	�Է��� 1 ���� 2 * 109 ���� �ڿ��� �̴�.
//	��� ����
//	����� �Ʒ� ��� ���� �������� �Ѵ�.
//	
//	����� ��
//	�Է�
//	14
//	���
//	14 IS 2/4

package ����;

import java.util.Scanner;

public class threefiftytwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int x = 1;
		int y = 2;
		int i;
			
		if(a == 1)
		{
			System.out.println(a + " IS " + "1/1");
		}
		else if(a == 2)
		{
			System.out.println(a + " IS " + "1/2");
		}
		else
		{
			for(i = 2 ; i <= a ; )
			{
				if(x > y)
				{
					while(x != 1 || y%2 !=1)
					{
						if(y == 1 && x%2 == 0)
						{
							x++;
							i++;
						}
						else
						{
							x--;
							y++;
							i++;
						}
						if(a == i)
						{
							System.out.println(a + " IS " + x + "/" + y);
							return;
						}
					}
				}
				else if(x < y)
				{
					while(y != 1 || x%2 != 0)
					{
						if(x == 1 && y%2 ==1)
						{
							y++;
							i++;
						}
						else
						{
							x++;
							y--;
							i++;
						}
						if(a == i)
						{
							System.out.println(a + " IS " + x + "/" + y);
							return;
						}
					}
				}
			}
		}
	}

}
