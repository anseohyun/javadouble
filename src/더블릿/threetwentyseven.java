//	프로그램 명: triangular_sum(open)
//	제한시간: 1 초
//	
//	n 번째 삼각수 T(n) 다음과 같다.
//	T(n) = 1 + 2 ... + n
//	T(4) 는 아래와 같다.
//	   X
//	  X X
//	 X X X
//	X X X X
//	삼각수의 가중치의 합 w(n)이 다음과 같이 정의될 때 이를 구하는 것이 문제이다.
//	
//	입력
//	300 이하인 n 이 입력된다.
//	출력
//	w(n) 값을 출력한다.
//	
//	입출력 예
//	입력
//	3
//	출력
//	45

package 더블릿;

import java.util.Scanner;

public class threetwentyseven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		int T = 0;
		
		for(int i = 1 ; i <= num ; i++)
		{
			for(int j = 1 ; j <= (i+1) ; j++)
			{
				T = T + j;
			}
			
			sum  = sum + i*T;
			T = 0;
		}
		
		System.out.println(sum);
	}

}
