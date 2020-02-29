//	프로그램 명: parking
//	제한시간: 1 초
//	
//	미챌이 롱 스트리트를 쇼핑할 때 차를 가게 앞에 주차 후 필요한 가게로 걸어간다. 당신은 미챌을 도와 그가 걷는 거리가 최소가 되는 주차 지점을 찾는 것이다. 주차지점은 구역번호로 나누어져 있고 , 한 구역당 주차비를 지불해야 한다.
//	미챌은 주차 비를 두번 낼 생각이 없다. 그리고 다리가 튼튼해서 모든 백을 들고 왔다리 갔다리 하는데는 개의치 않는다.
//	
//	입력
//	첫 번째 수는 미챌이 방문할 가게 수 n 이고 , 다음 n 개의 수는 가게 번호 Xi 이다.( 1 ≤ n ≤ 20, 0 ≤ Xi ≤ 99 )
//	출력
//	최적의 위치에 주차해서 걷는 거리의 최소 값을 출력한다.
//	
//	입출력 예
//	입력
//	4
//	24 13 89 37
//	출력
//	152
//	입력
//	6
//	7 30 41 14 39 42
//	출력
//	70

package 더블릿;

import java.util.Scanner;

public class threefourtyseven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int park[] = new int[n];
		int res = 0;
		
		for(int i = 0 ; i < n ; i++)
		{
			park[i] = sc.nextInt();
		}

		for(int i = 0 ; i < n-1 ; i++)
		{
			for(int j = 0 ; j < n-1 ; j++)
			{
				if(park[j] > park[j+1])
				{
					int num;
					num = park[j];
					park[j] = park[j+1];
					park[j+1] = num;
				}
			}
		}
		
		for(int i = n-1 ; i > 0 ; i--)
		{
			res = res +  park[i] - park[i-1];
		}
		
		System.out.println(res*2);
			
	}

}
