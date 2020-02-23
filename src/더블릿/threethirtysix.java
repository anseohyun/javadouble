//	프로그램 명: hangover
//	제한시간: 1 초
//	
//	얼마나 멀리 테이블 위에 카드를 쌓아 돌출 시킬 수 있을까?
//	만약 카드 한장을 가지고 있다면 카드 길이의 반 만큼의 돌출부를 만들 수 있다. (카드는 반드시 테이블에 수직으로 놓는다) 카드가 두개 있으면 맨 위의 카드는 아래 카드 위에 카드 길이의 반만큼 돌출 할 수 있고, 
//	바닥의 카드는 테이블위에 카드 길이의 1/3만큼 돌출 할 수 있다. 따라서 돌출부분의 총 합은 카드 길이의 5/6(1/2+1/3)이 된다.
//	일반적으로 n개의 카드를 쌓아 돌출 시킬 때 가장 위에 있는 카드는 2번째 카드 위에 1/2이 돌출되어 있고, 2번째 카드는 3번째 카드에 1/3이, 3번째 카드는 4번째 카드위에 1/4이, .. 
//	그리고 바닥의 카드는 테이블 위에 1/(n+1)이 돌출되어 총 길이는 카드길이의 1/2 + 1/3 + 1/4 + ... + 1/(n+1) 이 된다.
//	이 모습을 아래 그림에 나타내었다.
//	
//	입력
//	입력의 첫 줄에 양의 실수 c 가 주어진다. 이 값은 적어도 0.01 이상 5.20 이하이다. 총 자리수는 세자리.
//	출력
//	각각의 테스트 케이스에 대하여 적어도 입력 c 만큼의 카드 길이를 만들 수 있는 최소한의 필요 카드 개수를 출력하라. 예를 보고 정확한 출력 양식을 사용하라.
//	
//	입출력 예
//	입력
//	1.00
//	출력
//	3 card(s)
//	입력
//	3.71
//	출력
//	61 card(s)
//	입력
//	0.04
//	출력
//	1 card(s)
//	입력
//	5.19
//	출력
//	273 card(s)

package 더블릿;

import java.util.Scanner;

public class threethirtysix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double len = sc.nextDouble();
		double len_num = 0;
		double card;
		
		for(card = 2 ; len > len_num ; card++)
		{
			len_num = 1/card + len_num;	
			if(len < len_num)
			{
				break;
			}
		}
			
		int card_int = (int)card;
		System.out.println((card_int-1) + " card(s)");

	}

}
