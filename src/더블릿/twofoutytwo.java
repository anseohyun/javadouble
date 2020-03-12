//	���α׷� ��: quadratic
//	���ѽð�: 1 ��
//	
//	2�� �������� a*x^2 + b*x + c = 0 ���·� �־��� ��, �Ǽ� �������� ���� ������ ���� ����ϴ� ���α׷��� �ۼ��غ���.
//	
//	�Է�
//	3���� ���� a, b, c �� �� ĭ���� ���еǾ� �Է����� �־�����. (-100000 < a, b, c < 100000)
//	���
//	ù ��° �ٿ��� ���� ������ ����Ѵ�. (���� ������ 0, 1���̸� 1, 2���̸� 2)
//	�� ��° �ٿ��� ���� ���� ���ں��� ������� �� ĭ���� �����Ͽ� ����Ѵ�.
//	���� ���� �Ҽ��� �Ʒ� 3�ڸ����� �ݿø��ؼ� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	1 -3 1
//	���
//	2
//	0.382 2.618

package ����;

import java.util.Scanner;

public class twofoutytwo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double check = b*b - 4*a*c;
		double result;
		
		if(check > 0)
		{
			System.out.println(2);
			double sqrt = Math.sqrt(check);
			result = (((-b)-sqrt)/(2*a));
			System.out.print(String.format("%.3f"+" ", result));
			result = (((-b)+sqrt)/(2*a));
			System.out.println(String.format("%.3f"+" ", result));
		}
		else if(check == 0)
		{
			System.out.println(1);
			result = -b/(2*a);
			
			if(result == 0)
			{
				System.out.println("0.000");
				return;
			}
			System.out.println(String.format("%.3f", result));
		}
		else
		{
			System.out.println(0);
		}

	}

}
