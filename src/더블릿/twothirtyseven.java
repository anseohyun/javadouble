//	���α׷� ��: example_switch
//	���ѽð�: 1 ��
//	
//	�⵵ , ���� �Է����� �޾� �� ���� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	�� �⵵�� �����̸� 2 ���� 29 �̰� , �ƴϸ� 28 ��.
//	
//	�Է�
//	�� ���� y , m �� �Է����� �־�����. y �� 1000 �̻� , m �� 1 ���� 12 ������ �����̴�.
//	���
//	�ش� ���� �� ���� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	2009 10
//	���
//	31

package ����;

import java.util.Scanner;

public class twothirtyseven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		int m = sc.nextInt();
		
		if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
		{
			System.out.println(31);
		}
		else if(m == 4 || m == 6 || m == 9 || m == 11)
		{
			System.out.println(30);
		}
		else if(y%4 == 0 && y%400 == 0 && y%1000 == 0)
		{
			System.out.println(29);
		}
		else
		{
			System.out.println(28);
		}
				
	}

}
