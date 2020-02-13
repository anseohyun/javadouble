//	프로그램 명: factor
//	제한시간: 1 초
//	
//	주어지는 수의 약수를 출력하는 문제이다.
//	
//	입력
//	10000 이하의 자연수가 입력으로 주어진다.
//	출력
//	작은 수부터 한 줄에 한 개씩 출력한다.
//
//	입출력 예
//	입력
//	4
//	출력
//	1 
//	2 
//	4
//	입력
//	6
//	출력
//	1 
//	2 
//	3 
//	6

package 더블릿;

import java.util.Scanner;

public class threeeighteen {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for(int i = 1; i <= num ; i++)
		{
			if(num%i == 0)
			{
				System.out.println(i);
			}
		}
	}
}
