//	���α׷� ��: fairy
//	���ѽð�: 1 ��
//	
//	��� ������ �־���. �� ������ 2000�⿡ �� ������� Ž�谡�� ó�� ���Ұ�, 8�⸶�� ���̽� �غ����� ���δٰ� �Ѵ�.
//	�⵵�� �Է¹޾�,�� ������ ��Ÿ���� ���̸� O, �ƴϸ� X�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (����:2000�� ������ ������ �߰ߵ��� �ʴ´�.)
//	
//	�Է�
//	�⵵�� �Է¹޴´�. �Է��� ���������� ���� �ʴ´�.
//	���
//	������ ��Ÿ���� ���̸� O,�ƴϸ� X�� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	2011
//	���
//	X
//	�Է�
//	2016
//	���
//	O

package ����;

import java.util.Scanner;

public class twofourteen {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if((year-2000)%8==0 && year >= 2000)
		{
			System.out.println("O");
		}
		else if((year-2000)%8 !=0 || year < 2000)
		{
			System.out.println("X");
		}
		
	}
}