//	프로그램 명: beat
//	제한시간: 1 초
//	
//	수퍼볼 선데이날이다. 전반전이 끝난 후 막간을 이용해서 지역 해커는 게임의 스코어를 맞추는 게임을 제안했다.
//	즉 두 팀의 점수의 합 과 차가 주어질 때 , 두 팀의 점수를 알아내는 것이다.
//	
//	입력
//	두 개의 수 s , d 가 입력으로 주어진다. s 는 합이고 , d 는 차( 큰수 - 작은수)이다.
//	출력
//	각 테스트 데이터당 두 팀의 점수를 큰 수 , 작은 수 순으로 출력한다. 가능하지 않는 경우에는 impossible 을 출력한다. 점수는 음수가 될 수 없다.
//	
//	입출력 예
//	입력
//	40 20
//	출력
//	30 10
//	입력
//	20 40
//	출력
//	impossible

package 더블릿;

import java.util.Scanner;

public class twothirty {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int d = sc.nextInt();
		int teamA;
		int teamB;
		int check = 0;
		
		for(teamA = 0 ; teamA <= s ; teamA++)
		{
			teamB = s - teamA;
			if(teamB - teamA == d)
			{
				System.out.println(teamB + " " + teamA);
				check++;
				break;
			}
		}
		
		if(check == 0)
		{
			System.out.println("impossible");
		}
		
	}

}