//	���α׷� ��: up_down
//	���ѽð�: 1 ��
//	
//	Nikky �� Byron ü���ð��� ������ �ϰ� �ִ�.
//	�������� Nikky ���Դ� a �� ���� �Ŀ� b �� �����ϰ� , Byron ���Դ� c �� ���� �� d �� �����ϴ� �۾��� �ݺ������� �ϰ� �ߴ�.
//	���� ���� ������ ������ �� ������ �ɸ��� �ð��� ����.
//	s ���� ���� �������� �ֽ��� �� ��� �� �� ���� ó�� ��ġ���� �ָ� �� �ִ°��� �˾Ƴ��� ���α׷��� �϶�.
//	
//	�Է�
//	5 ���� ���� a,b,c,d,s �� �־�����.
//	��, a,b,c,d �� 100 ������ �����̰� a > b , c > d �̰� s �� 10000 ������ �����̴�.
//	���
//	�� ���� �� �ϳ��� ����Ѵ�.
//	Nikky
//	Byron
//	Tied
//	
//	����� ��
//	�Է�
//	4
//	2
//	5
//	3
//	12
//	���
//	Byron
//	
//	����� ����
//	Nikky �� 12 ���� ���� ���´� 4 - 2 + 4 - 2 �� ù ��ġ���� 4 ���� ��ŭ �������� Byron �� 5 - 3 + 4 �� 6 ���� �������� Byron �� �� �ָ� ������ �ִ�.

package ����;

import java.util.Scanner;

public class twotwentynine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int s = sc.nextInt();
		
		int Nikky;	// Nikky�� ���� ��ġ
		int Byron;	// Byron�� ������ġ
		int nn = s/(a+b);		 
		int bb = s/(c+d);		 
		int N = s%(a+b); 
		int B = s%(c+d);		
		
		
		if(N > a)
		{
			Nikky = nn*(a-b) + a - (N-a);
		}
		else
		{
			Nikky = nn*(a-b) + N;
		}
		
		if(B > c)
		{
			Byron = bb*(c-d) + c - (B-c);
		}
		else
		{
			Byron = bb*(c-d) + B;
		}
		
		
		if(Nikky > Byron)
		{
			System.out.println("Nikky");
		}
		else if(Nikky < Byron)
		{
			System.out.println("Byron");
		}
		else
		{
			System.out.println("Tied");
		}
	}
}
