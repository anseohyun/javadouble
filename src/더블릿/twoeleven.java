//	프로그램 명:leap_year
//	제한시간:1 초
//	
//	자연수를 입력으로 받아 윤년이면 YES , 아니면 NO 를 출력하는 프로그램을 작성하시오.
//	윤년이란 ,
//	4의 배수이고 100 의 배수가 아님.
//	400 의 배수임
//	두 가지중 하나라도 참이면 윤년
//	
//	입력
//	입력되는 수는 3000 이하의 자연수이다.
//	
//	입출력 예
//	입력
//	4
//	출력
//	YES
//	입력 
//	100
//	출력
//	NO
//	입력
//	200
//	출력 
//	NO
//	입력 
//	400
//	출력
//	YES

package 더블릿;

import java.util.Scanner;

public class twoeleven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num%4==0 && num%100!=0)
		{
			System.out.println("YES");
		}
		else if(num%400==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
