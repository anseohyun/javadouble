//	프로그램 명: 1ton
//	제한시간: 1 초
//	
//	자연수를 입력으로 받아 1 부터 n 까지 합을 출력하는 프로그램을 작성하시오.
//	3 을 입력으로 받으면
//	1 + 2 + 3 = 6
//	6 을 출력한다.
//	
//	입력
//	1000 이하의 자연수가 입력으로 주어진다.
//	출력
//	1부터 n까지의 합
//	
//	입출력 예
//	입력
//	5
//	출력
//	15


package 더블릿;

import java.util.Scanner;

public class threefifteen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();
		int sum = 0;
		
		for(int i = 1;i <= num ; i++)
		{
			sum = sum + i;
		}
		
		System.out.println(sum);
		
	}

}
