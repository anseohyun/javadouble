//	프로그램 명: lunacy
//	제한시간: 1 초
//	
//	호규는 몇 달간의 다이어트와 사투 후에 몸무게에 대한 과도한 집착을 보이게 되었다. 그는 이상한 방식으로 자신을 합리화 했다.
//	"내가 다른 행성에서 태어났다면 몸무게가 휠씬 줄어들텐데"
//	물론 다른 행성은 아주 멀리 있지만 달만해도 무게가 확실히 줄어든다. 지구에서의 무게가 1 일 때 달에서는 0.167 이다.
//	
//	입력
//	하나이상의 데이터가 주어진다. 주어지는 수는 실수이고 입력의 끝은 음의 실수이다.
//	출력
//	각 입력에 대해서 아래 형식으로 출력한다.
//	"Objects weighing X on Earth will weigh Y on the moon."
//	X 는 지구에서의 무게이고 , Y 는 달에서의 무게이다. 둘다 소수이하 두자리까지 출력한다.
//	
//	입출력 예
//	입력
//	100.0
//	12.0
//	0.12
//	120000.0
//	-1.0
//	출력
//	Objects weighing 100.00 on Earth will weigh 16.70 on the moon.
//	Objects weighing 12.00 on Earth will weigh 2.00 on the moon.
//	Objects weighing 0.12 on Earth will weigh 0.02 on the moon.
//	Objects weighing 120000.00 on Earth will weigh 20040.00 on the moon.
//	
//	입출력 주의
//	이런 유형의 문제는 결과를 배열에 넣은 후 한꺼번에 출력하지 않으셔도 됩니다.
//	입력 받고 처리 후 바로 출력
//	입력 받고 처리 후 바로 출력
//	....
//	보통 입력 데이터가 하나로 주어지는 경우가 이런 유형의 문제입니다.
//	우리나라 정보올림피아드(koi) , 미국 정보올림피아드(usaco) 쪽에는 case 별로 채점을 하고 , 대학생 프로그래밍 경시대회(acm) 쪽에서는 데이터를 통으로 넣어서 오류를 확인 합니다.
//	통으로 가는 경우 문제를 준비하기에는 편하기는 합니다만 틀린 경우 데이터가 보이지 않아 오류를 찾기가 어렵습니다.
//	하지만 그 만큼 소스를 더 철저히 검증해야 하니 장점이라고도 할 수 있겠지요. 두가지 모두 장단점이 있는 것 같아 dovelet 에서는 가끔 통으로 가는 문제도 있습니다.

package 더블릿;

import java.util.Scanner;

public class threetwentynine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double weight;
		String wei_earth;
		String wei_moon;
	
		while(true)
		{
			weight = sc.nextDouble();
			wei_earth = String.format("%.2f", weight);
			wei_moon = String.format("%.2f", weight*0.167);
			
			if(weight > 0)
			{
				System.out.println("Objects weighing " + wei_earth + " on Earth will weigh " + wei_moon + " on the moon.");
			}
			else if(weight < 0)
			{
				break;
			}
		}
	}
}