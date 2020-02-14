//	프로그램 명: fairy
//	제한시간: 1 초
//	
//	어느 요정이 있었다. 이 요정은 2000년에 폴 존스라는 탐험가가 처음 보았고, 8년마다 페이스 해변에서 보인다고 한다.
//	년도를 입력받아,이 요정이 나타나는 해이면 O, 아니면 X를 출력하는 프로그램을 작성하시오. (참고:2000년 전에는 요정은 발견되지 않는다.)
//	
//	입력
//	년도를 입력받는다. 입력은 정수범위를 넘지 않는다.
//	출력
//	요정이 나타나는 해이면 O,아니면 X를 출력한다.
//	
//	입출력 예
//	입력
//	2011
//	출력
//	X
//	입력
//	2016
//	출력
//	O

package 더블릿;

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