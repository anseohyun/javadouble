//	프로그램 명: saju
//	제한시간: 1 초
//	
//	생년 월일을 입력 받아 , 사주 팔자를 풀이하는 프로그램을 작성하세요.
//	
//	입력
//	세 정수 년,월,일 이 입력으로 주어진다.
//	출력
//	연도 + 월 + 일 을 계산하여 마지막 숫자가 0 이면 '운수대통!' 이라고 출력하고 , 그렇지 않으면 '노력하세요!' 를 출력
//	
//	입출력 예
//	입력
//	1991 1 25 
//	출력
//	노력하세요!
//	입력
//	1992 3 25
//	출력
//	운수대통!

package 더블릿;

import java.util.Scanner;

public class twoten {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		if((year+month+day)%10 == 0)
		{
			System.out.println("운수대통!");
		}
		else
		{
			System.out.println("노력하세요!");
		}
	}
}