//	프로그램 명: coci_tablica
//	제한시간: 1 초
//	페리카는 수학을 잘 한다. 단 그의 하나의 약점은 더하기와 나누기이다. 그를 돕기 위해 선생님은 다음과 같은 문제를 제시했다.
//	
//	2행 2렬 테이블이 주어지고 4 개의 숫자 A,B,C,D 가 주어진다.
//	이 테이블의 값은 다음과 같이 약속한다.
//	a/c + b/d
//	문제는 시계 방향 90 도 씩 회전하면서 테이블의 값을 구할 때 가장 큰 값을 얻기위한 최소 회전 수를 구하는 것이다.
//	다음은 90 도 회전 하는 경우의 그림이다.
//	
//	입력
//	첫 줄에는 A,B 가
//	두 번째 줄에는 C,D 가 주어진다.
//	네 수는 정수이고 100 을 넘지 않는다.
//	출력
//	최소 회전 수를 출력한다.
//	
//	입출력 예
//	입력
//	1 2
//	3 4
//	출력
//	2
//	입력
//	5 9
//	7 2
//	출력
//	0
//	입력
//	41 99
//	100 13
//	출력
//	1


package 더블릿;

import java.util.Scanner;

public class twotwentyfive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		double num[] = new double[4];
		
		num[0] = a/c + b/d;
		num[1] = c/d + a/b;
		num[2] = d/b + c/a;
		num[3] = b/a + d/c;
		
		double max = num[0];
		
		for(int i = 1 ; i < 4  ; i++)
		{
			if(max<=num[i])
			{
				max = num[i];
			}
		}
		
		if(max == num[0])
		{
			System.out.println(0);
		}
		else if(max == num[1])
		{
			System.out.println(1);
		}
		else if(max == num[2])
		{
			System.out.println(2);
		}
		else
		{
			System.out.println(3);
		}

	}

}
