//	���α׷� ��: profit
//	���ѽð�: 1 ��
//	
//	������ ������ a �̰� , ������ b % ������ �ٿ��� ������ �������� ������ �� �ȸ��� �ʾ� ������ c% �� �����ؼ� �ȾҴ�. �� ������ �Ⱦ������� ������ ���Ͽ���.
//	
//	�Է�
//	a,b,c �� �Է����� �־�����. (��� �ڿ����̰� a < 100000 , b,c < 100)
//	���
//	������ �Ҽ� ù° �ڸ����� �ݿø��Ͽ� ����Ѵ�. ���ظ� �� ��쿡�� loss �� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	100 10 10
//	���
//	loss
//	�Է�
//	100 10 8
//	���
//	1

package ����;

import java.util.Scanner;

public class twothirtynine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double oriprice;
		double disprice;
		double profit;
		
		oriprice = (a/100)*(b+100);
		disprice = (oriprice/100)*(100-c);
		
		if(disprice < a)
		{
//			System.out.println(oriprice);
//			System.out.println(a);
//			System.out.println(disprice);
			System.out.println("loss");
		}
		else
		{
//			System.out.println(oriprice);
//			System.out.println(a);
//			System.out.println(disprice);
			profit = disprice - a;
			System.out.println(String.format("%.0f", profit));
		}
		
		
	}

}
