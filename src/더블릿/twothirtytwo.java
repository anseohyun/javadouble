//	프로그램 명: reduction
//	제한시간: 1 초
//	
//	560 * 400 밀리미터 이미지를 표준 용지( 218 * 280 mm) 로 복사하려고 한다.
//	이 복사기는 축소 기능이 있어 용지에 맞게 가능한 크게 복사하려고 하는 경우 50 % 축소 복사하면 된다. 물론 90 도 회전 할수도 있다.( 랜드스케이프 모드)
//	문제는 복사할 이미지와 복사용지가 주어질 때 이 이미지를 복사용지에 잘림이 없이 최대로 넣기 위한 위한 축소 % 를 구하는 문제이다.
//	
//	입력
//	4 개의 정수가 입력으로 주어진다. 처음 두 수는 복사할 이미지의 크기이고 다음 두 수는 복사용지의 크기이다.
//	출력
//	답은 1 에서 100% 사이의 정수이다.
//	
//	입출력 예
//	입력
//	560 400 218 280
//	출력
//	50%
//	입력
//	10 25 88 10
//	출력
//	100%
//	입력
//	8 13 5 1
//	출력
//	12%
//	입력
//	199 333 40 2
//	출력
//	1%

package 더블릿;

import java.util.Scanner;

public class twothirtytwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextInt();
		double B = sc.nextInt();
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		if(A>B)
		{
			if(a>b)
			{
			}
			else
			{
				double swi;
				swi = a;
				a = b;
				b = swi;
			}
		}
		else
		{
			if(a>b)
			{
				double swi;
				swi = A;
				A = B;
				B = swi;
			}
			else
			{
				double swi1;
				swi1 = A;
				A = B;
				B = swi1;
				
				double swi2;
				swi2 = A;
				A = B;
				B = swi2;
			}
		}
		
		double Aa = (a/A)*100;
		int reAa = (int)Aa;
		double Bb = (b/B)*100;
		int reBb = (int)Bb;		
		
	
		if(reAa < reBb)
		{
			if(reAa>100)
			{
				System.out.println(100+"%");
			}
			else
			{
				System.out.println(reAa+"%");
			}
		}
		else			
		{
			if(reBb>100)
			{
				System.out.println(100+"%");
			}
			else
			{
				System.out.println(reBb+"%");
			}
		}
		
	}
}
