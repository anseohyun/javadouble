//	
//	���α׷� ��: perfect
//	
//	���ѽð�: 1 ��
//	������(perfect) , ������(deficient) , ���׼�(abundant) �� ����ϴ� ����.
//	�������� �ڽ��� ������ ����� ���� �ڽŰ� ���� �� , �������� ���� �ڽ��� ������ ������ , ���׼��� ū��
//	
//	�Է�
//	�� ���� 60,000 ���� �۴�.
//	���
//	���� 5 �ڸ� Ȯ���� �����ʿ� ���߾� ����� 2 ĭ �����̽��� �� �� ���� ������ ����Ѵ�.
//	
//	����� ��
//	�Է�
//	15
//	���
//       15  DEFICIENT
//	�Է�
//	28
//	���
//	     28  PERFECT
//	�Է�
//	56
//	���
//	     56  ABUNDANT

package ����;

import java.util.Scanner;

public class threetwentyfour {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		String result_num = String.format("%5d", num);
		
		for(int i = 1;i < num;i++)
		{
			if(num%i == 0)
			{
				sum = sum + i;
			}
		}

		if(sum == num)
		{
			System.out.println(result_num+"  "+"PERFECT");
		}
		else if(sum<num)
		{
			System.out.println(result_num+"  "+"DEFICIENT");
		}
		else
		{
			System.out.println(result_num+"  "+"ABUNDANT");
		}
	}

}
