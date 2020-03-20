//	프로그램 명: tpz(open)
//	제한시간: 1 초
//	
//	10 명의 사람에게 스타크래프트 종족 선호를 조사 했더니
//	테란 : 8
//	프로토스 : 7
//	저그 : 9
//	모든 종족을 좋아하는 가능한 최대 인원과 최소 인원을 구하는 것이 문제이다.
//	최대 인원은 7 , 아래 테이블은 가능한 한 경우의 예이다.(1,2,3,4,5,6,7)
//			1	2	3	4	5	6	7	8	9	10
//	테란		v	v	v	v	v	v	v	v		
//	프로토스		v	v	v	v	v	v	v			
//	저그		v	v	v	v	v	v	v	v	v	
//	최소 인원은 4 명 이고 가능한 한 경우(4,5,6,7) 의 예이다.
//			1	2	3	4	5	6	7	8	9	10
//	테란		v	v	v	v	v	v	v	v		
//	프로토스				v	v	v	v	v	v	v
//	저그		v	v	v	v	v	v	v		v	v
//	
//	입력
//	첫 줄에는인원 수 N (100 이하) 이 주어지고 다음 줄에는 세 개의 정수가 주어진다. 각 수는 N 을 넘지 않는다.
//	출력
//	한 줄에 최대 , 최소 인원수를 출력한다.
//	
//	입출력 예
//	입력
//	10
//	8 7 9
//	출력
//	7 4

package 더블릿;

import java.util.Scanner;

public class twothirtythree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		int P = sc.nextInt();
		int J = sc.nextInt();
	
		int max = 0;
		int mid = 0;
		int min = 0;
		
		if(T >= P && T>= J)
		{
			if(P >= J)
			{
				mid = P;
				min = J;
			}
			else
			{
				mid = J;
				min = P;
			}
			max = T;
		}
		else if(P >= T && P>= J)
		{
			if(T >= J)
			{
				mid = T;
				min = J;
			}
			else
			{
				mid = J;
				min = T;
			}
			max = P;
		}
		else if(J >= T && J>= P)
		{
			if(T >= P)
			{
				mid = T;
				min = P;
			}
			else
			{
				mid = P;
				min = T;
			}
			max = J;
		}

		System.out.print(min + " ");
		if((-(N-(min+mid))-(N-max))  < 0)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(-(N-(min+mid))-(N-max));
		}
		
	}
}
