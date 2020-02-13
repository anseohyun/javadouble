//	프로그램 명: fact
//	제한시간: 1 초
//	
//	자연수 n 에 대해서 n!(n 팩토리얼) 은 다음과 같이 약속 한다.
//	문제는 n 이 주어줄 때 n! 을 구하는 프로그램을 작성하는 것이다.
//	
//	입력
//	12 이하인 자연수가 입력으로 주어진다.
//	출력
//	n! 값을 출력한다.
//	
//	입출력 예
//	입력
//	5
//	출력
//	120
 

package 더블릿;

import java.util.Scanner;

public class threeseventeen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 1;

		for(int i = 1; i<=num;i++)
		{
			sum = sum*i;
		}
		System.out.println(sum);

	}
}