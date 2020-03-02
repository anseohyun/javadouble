//	프로그램 명: example_switch
//	제한시간: 1 초
//	
//	년도 , 달을 입력으로 받아 이 달의 날 수를 구하는 프로그램을 작성하시오.
//	이 년도가 윤년이면 2 월은 29 이고 , 아니면 28 일.
//	
//	입력
//	두 정수 y , m 이 입력으로 주어진다. y 는 1000 이상 , m 은 1 에서 12 사이의 정수이다.
//	출력
//	해당 달의 날 수를 출력한다.
//	
//	입출력 예
//	입력
//	2009 10
//	출력
//	31

package 더블릿;

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
