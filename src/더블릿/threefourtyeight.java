//	프로그램 명: speed_limit
//	제한시간: 1 초
//	
//	빌과 테드는 여행을 하고 있다. 그런데 차의 거리 측정기가 고장이 나서 그들은 얼마만큼의 거리를 여행한 지를 알수가 없다. 다행스럽게도 , 빌은 스톱워치를 가지고 있어 속도와 그들이 달린 총 시간을 기록할 수가 있다.
//	처음부터 2 시간이 경과할 때 까지 시속 20 마일로 , 6 시간이 경과할 때까지 시속 30 마일로 7 시간이 경과할 때 까지 시속 10 마일로 달렸다면 아래와 같이 기록했다.
//	시속	경과시간
//	20	2
//	30	6
//	10	7
//	~ 2 시간까지 시속 20 마일
//	~ 6 시간까지 시속 30 마일
//	~ 7 시간까지 시속 10 마일
//	총 거리는 2 * 20 + 4(6-2) * 30 + 1(7-6) * 10 = 40 + 120 + 10 = 170 이다.
//	
//	입력
//	첫 수는 줄 수 n ( 1 <= n <= 10) 이고 , 다음 n 라인이 주어진다. 각 줄의 첫 수는 시간당 마일이고 , 두번째 수는 경과 시간 이다.
//	출력
//	출력 예의 형식으로 출력한다.
//	
//	입출력 예
//	입력
//	3
//	20 2
//	30 6
//	10 7
//	출력
//	170 miles
//	입력
//	2
//	60 1
//	30 5
//	출력
//	180 miles
//	입력
//	4
//	15 1
//	25 2
//	30 3
//	10 5
//	출력
//	90 miles

package 더블릿;

import java.util.Scanner;

public class threefourtyeight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int mile[] = new int[n];
		int time[] = new int[n];
		int res = 0;
		
		for(int i = 0 ; i < n ; i++)
		{
			mile[i] = sc.nextInt();
			time[i] = sc.nextInt();
		}
		
		for(int i = n ; i > 0 ; i--)
		{
			if(i>1)
			{
				res = res + mile[i-1]*(time[i-1]-time[i-2]);
			}
			else
			{
				res = res + mile[i-1]*time[i-1];
			}
		}
		
		System.out.println(res+" miles");
	}

}
//				System.out.println(mile[i-1]+ " " +time[i-1]+" "+ res);
