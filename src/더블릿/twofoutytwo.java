//	프로그램 명: quadratic
//	제한시간: 1 초
//	
//	2차 방정식이 a*x^2 + b*x + c = 0 형태로 주어질 때, 실수 범위에서 근의 개수와 근을 출력하는 프로그램을 작성해보자.
//	
//	입력
//	3개의 정수 a, b, c 가 빈 칸으로 구분되어 입력으로 주어진다. (-100000 < a, b, c < 100000)
//	출력
//	첫 번째 줄에는 근의 개수를 출력한다. (근이 없으면 0, 1개이면 1, 2개이면 2)
//	두 번째 줄에는 근을 작은 숫자부터 순서대로 빈 칸으로 구분하여 출력한다.
//	근의 값은 소수점 아래 3자리까지 반올림해서 출력한다.
//	
//	입출력 예
//	입력
//	1 -3 1
//	출력
//	2
//	0.382 2.618

package 더블릿;

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
