//	프로그램 명: 1ton1
//	제한시간: 1 초
//	
//	자연수 n 을 입력으로 받아 1 부터 n 까지의 보기의 예와 같이 출력하는 프로그램을 작성하시오.
//	
//	입력
//	1000 이하의 자연수가 입력으로 주어진다.
//	출력
//	보기에 제시된 형식으로 출력 한다. 출력되는 문자사이에 공백은 없다.
//	
//	입출력 예
//	입력
//	5
//	출력
//	1+2+3+4+5=15

package 더블릿;

import java.util.Scanner;

public class threeeight {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i < num ; i++)
		{
			System.out.print(i+"+");
			sum = sum + i;
		}
		
		sum = sum + num;
		System.out.println(num+"="+sum);
	}

}
