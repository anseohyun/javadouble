//	���α׷� ��: rounders(open)
//	���ѽð�: 1 ��
//	
//	10 ���� ū ���̸� ���� �ڸ����� �ݿø��ϰ� , ����� 100 ���� ũ�� 10 �� �ڸ����� �ݿø��ϰ� , ����� 1000 ���� ũ�� ����� 100 �� �ڸ����� �ݿø��ϰ� , ....
//	
//	�Է�
//	�ݿø� �� �� x �� �־�����. 0 <= x <= 99 999 999
//	���
//	�ݿø� �� ����� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	15
//	���
//	20
//	�Է�
//	5
//	���
//	5
//	�Է�
//	99
//	���
//	100
//	�Է�
//	12345678
//	���
//	10000000
//	�Է�
//	44444445
//	���
//	50000000

package ����;

import java.util.Scanner;

public class threethirtyfour {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		
		if(num < 10)
		{
			System.out.println(num);
		}
		else
		{
			for(int i = 1 ; i < 1000000000 ; )
			{
				if(i*10 > num)
				{
					System.out.println(num);
					break;
				}
				else if(num < 10) 
				{
					break;
				}
				else
				{						
					if(num%(i*10) >= 5*((i*10)/10))
					{
						num = (num-(num%(i*10)))+(i*10);
					}
					else
					{
						num = num - (num%(i*10));
					}
				}

				i = i*10;
			}		
			
		}
		
	}

}