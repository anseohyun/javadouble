//	프로그램 명: div_mul(open)
//	제한시간: 1 초
//	
//	a,b,q 가 정수이고 다음 식이 만족할 때
//	b = a× q (단,a‡0)
//	a 는 b 의 약수, b 는 a 의 배수로 약속되어 진다.
//	a 가 b 의 약수이면 a | b 로 표시하고 그렇지 않으면 a ł b 로 표시한다.
//	
//	입력
//	두 정수 m , n 이 차례로 주어진다. m , n 값으로 0 이 입력될 수 있다. (-100 <= m,n <= 100)
//	참고로 0 은 모든 수의 배수이고 어떤 수의 약수는 될 수 없다.
//	출력
//	기호 ł 는 !| 로 대신한다.
//	m 이 n 의 약수이면 m | n 를 아니면 m !| n 를 출력한다. 숫자와 기호 사이에는 한 칸의 공백을 둔다.
//	
//	입출력 예
//	
//	입력
//	2 4
//	출력
//	2 | 4
//	
//	입력
//	3 4
//	출력
//	3 !| 4

package 더블릿;

import java.util.Scanner;

public class twoeight {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		if(m != 0)
		{
			if(n%m == 0)
			{
				System.out.println(m+" | "+n);
			}
			else
			{
				System.out.println(m+" !| "+n);
			}
		}
		else
		{
			System.out.println(m+" !| "+n);
		}

	}

}
