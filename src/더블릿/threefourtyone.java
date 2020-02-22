//	프로그램 명: nf
//	제한시간: 1 초
//	
//	약수의 개수의 성질에서 알아두면 유용한 것 몇가지
//	소수는 약수의 개수가 두 개 ( 1 과 자기 자신)
//	소수의 제곱은 약수의 개수가 3
//	제곱수는 약수의 개수가 홀수개
//	제곱수가 아닌 수의 약수의 개수는 쌍으로 존재하므로 짝수개이다.
//	12 의 약수
//	( 1 , 12 )
//	( 2 , 6 )
//	( 3 , 4 )
//	6 개로 짝수
//	제곱수는 제곱이 되는 수는 자신이 곱해져서 제곱수가 되므로 홀수개가 된다.
//	16 의 약수
//	( 1 , 16)
//	( 2 , 8 )
//	( 4 , 4 )
//	5 개로 홀수
//	문제는 어떤 수를 입력으로 받아 제곱수인지를 판별하는 것이다.
//	
//	입력
//	1 에서 10000 사이의 자연수가 입력으로 주어진다.
//	출력
//	제곱수이면 yes 아니면 no 를 출력한다.
//	
//	입출력 예
//	입력
//	4
//	출력
//	yes
//	입력
//	8
//	출력
//	no

package 더블릿;

import java.util.Scanner;

public class threefourtyone {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int n = 0;
		
		for(int i = 1 ; i <= num ; i++)
		{
			if(num % i == 0)
			{
				n++;
			}
		}
		
		if(n % 2 == 0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
