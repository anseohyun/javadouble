//	프로그램 명: clo
//	제한시간: 1 초
//	
//	석현이는 새로 시계를 샀다.
//	시계를 바라보던 석현은 정각 12시에는 시침과 분침, 그리고 초침이 12에서 겹친다는 것을 알았다.
//	석현은 그 후 정각 12시마다 시계를 바라보며 신기해하곤 했다. 그러나 석현은 정각 12시에 시계가 겹치는 것만으로는 만족하지 못해서 당신에게 도움을 청하러 왔다.
//	당신의 목표는 현재 시각이 입력될 때, 몇 시 몇 분 쯤에 시침과 분침이 겹칠 지를 맞히는 것이다.
//	
//	입력
//	첫 줄에 현재 시각 N ( 1 <= N <= 12 )이 입력된다.
//	출력
//	겹칠 시각의 분을 소수점 6자리까지 출력한다. 만약 그 시각에 겹치지 않는다면 "CAN'T SEE!"를 출력한다.
//	
//	입출력 예
//	입력
//	12
//	출력
//	0.000000
//	입력
//	6
//	출력
//	32.727273
//	입력
//	11
//	출력
//	CAN'T SEE!

package 더블릿;

import java.util.Scanner;

public class twofourtyone {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextInt();
		double x = (N/11)*60;
		
		if(N == 12)
		{
			System.out.println("0.000000");
		}
		else if((N*5 <= x) && (x < (N+1)*5))
		{
			System.out.println(String.format("%.6f", x));
		}
		else
		{
			System.out.println("CAN'T SEE!");
		}
	}

}




