//	���α׷� ��: 1ton1
//	���ѽð�: 1 ��
//	
//	�ڿ��� n �� �Է����� �޾� 1 ���� n ������ ������ ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	
//	�Է�
//	1000 ������ �ڿ����� �Է����� �־�����.
//	���
//	���⿡ ���õ� �������� ��� �Ѵ�. ��µǴ� ���ڻ��̿� ������ ����.
//	
//	����� ��
//	�Է�
//	5
//	���
//	1+2+3+4+5=15

package ����;

import java.util.Scanner;

public class threeeight {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i < num ; i++)
		{
			System.out.print(i+"+");
			sum = sum + i;
		}
		
		sum = sum + num;
		System.out.println(num+"="+sum);
	}

}
