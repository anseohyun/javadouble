//	프로그램 명: kangaroo
//	제한시간: 1 초
//	
//	캥거루 세 마리가 게임을 하고 있다.
//	한 줄로 서서 자기가 위치한 곳의 유일한 번호를 가지고 바깥에 있는 캥거루는 두 캥거루 사이로 점프를 할 수 있다.
//	가장 많은 점프를 할수 있는 점프 수를 구하는게 문제이다.
//	
//	입력
//	처음 위치한 곳의 위치가 정수 A,B,C 로 주어진다.(0 < A < B < C < 100)
//	출력
//	최대 점프 수를 출력한다.
//	
//	입출력 예
//	입력
//	2 3 5
//	출력
//	1
//	입력
//	3 5 9
//	출력
//	3
//	
//	입출력 보충
//	첫번째 입출력 예에서
//	처음 2 , 3 , 5 에서 2 번 캥거루가 3 , 5 사이 4 로 점프할 수 있고, 그러면 3 , 4 , 5 ..... 3 , 5 번 캥거루가 더 이상 점프할 공간이 없다.
//	처음 2 , 3 , 5 에서 5 번 캥거루는 2 , 3 사이로 점프 할 수가 없다.
//	 답은 1

package 더블릿;

import java.util.Scanner;

public class twotwenty {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if((B-A)>=(C-B))
		{
			System.out.println(B-A-1);
		}
		else if((B-A)<(C-B))
		{
			System.out.println(C-B-1);			
		}

	}

}
