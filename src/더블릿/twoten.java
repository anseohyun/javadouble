//	���α׷� ��: saju
//	���ѽð�: 1 ��
//	
//	���� ������ �Է� �޾� , ���� ���ڸ� Ǯ���ϴ� ���α׷��� �ۼ��ϼ���.
//	
//	�Է�
//	�� ���� ��,��,�� �� �Է����� �־�����.
//	���
//	���� + �� + �� �� ����Ͽ� ������ ���ڰ� 0 �̸� '�������!' �̶�� ����ϰ� , �׷��� ������ '����ϼ���!' �� ���
//	
//	����� ��
//	�Է�
//	1991 1 25 
//	���
//	����ϼ���!
//	�Է�
//	1992 3 25
//	���
//	�������!

package ����;

import java.util.Scanner;

public class twoten {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		if((year+month+day)%10 == 0)
		{
			System.out.println("�������!");
		}
		else
		{
			System.out.println("����ϼ���!");
		}
	}
}
