//	프로그램 명: fill
//	제한시간: 1 초
//	[문제요약] 그림과 같은 포지션 별 정보가 주어지고 , 각 선수들의 속도 , 체중 , 힘 이 주어질 때 이 선수에게 맞는 포지션이 무엇인지를 출력하는 프로그램이다.
//	속도는 이하이면 통과 , 체중과 힘은 이상이면 통과
//		포지션               스피드    몸무게    힘 
//	wide receiver  4.5  150  200
//	lineman        6.0  300  500
//	quarterback    5.0  200  300
//	입력
//	세 수가 주어진다. 첫 수는 속도 , 무게 , 힘 이 주어진다. 세 수는 실수이다.
//	출력
//	가능한 포지션을 모두 출력하고 맞는 포지션이 하나도 없으면 No positions 을 출력한다.
//	여러 포지션이 가능한 경우 위 표에 주어진 순서대로 출력한다.
//	
//	입출력 예
//	입력
//	4.4 180 200
//	출력
//	Wide Receiver
//	입력
//	5.5 350 700
//	출력
//	Lineman
//	입력
//	4.4 205 350
//	출력
//	Wide Receiver Quarterback
//	입력
//	5.2 210 500
//	출력
//	No positions

package 더블릿;

import java.util.Scanner;

public class twoeightteen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double speed = sc.nextDouble();
		int weight = sc.nextInt();
		int power = sc.nextInt();
		int num = 0;
		
		if(speed <= 4.5)
		{
			if(weight >= 150)
			{
				if(power >= 200)
				{
					System.out.print("Wide Receiver ");
					num++;
				}
			}
		}
		if(speed <= 6.0)
		{
			if(weight >= 300)
			{
				if(power >= 500)
				{
					System.out.print("Lineman ");
					num++;
				}
			}
		}
		if(speed <= 5.0)
		{
			if(weight >=200)
			{
				if(power >= 300)
				{
					System.out.println("Quarterback");
					num++;
				}
			}
		}
		
		if(num == 0)
		{
			System.out.print("No positions");
		}
	}

}
