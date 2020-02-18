//	프로그램 명: ftod(open)
//	제한시간: 1 초
//	
//	0 과 1 사이의 분수가 입력으로 주어질 때 소수이하 k 자리까지 출력하는 문제이다.
//	
//	입력
//	세 수가 입력으로 주어진다.
//	차례대로 분자, 분모 ,표현할 소수이하 자리 k 이다. 세수 모두 1000 이하의 자연수이다.
//	출력
//	출력 예의 형식으로 출력한다.
//	소수이하 유효자리를 포함하는 것은 보장되고 반올림은 하지 않는다.
//	
//	입출력 예
//	입력
//	6 7 2
//	출력
//	0.85

package 더블릿;

import java.util.Scanner;

public class threethirty {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numerator = sc.nextDouble();
		double denominator = sc.nextDouble();
		int k = sc.nextInt();
		String fraction = String.format("%."+k+"f", numerator/denominator);
		
		System.out.println(Math.floor(fraction));
	}
}