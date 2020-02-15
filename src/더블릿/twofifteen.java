//	프로그램 명: punch_game
//	제한시간: 1 초
//	
//	어느 PC방에는 펀치 게임이 있다. Eddy는 지금 이 복싱 게임을 플레이 하고 있다.
//	현재 Eddy와 붙고 있는 인공지능은 HP가 100 남았다. Eddy는 제한시간 안에 공격을 써서 상대를 이겨야 한다. 단,현재는 제한시간 때문에 공격을 10회 이하만 할 수 있다.
//	다음은 복싱 게임의 공격들이다.
//	주먹: 10 데미지
//	날아차기 : 15 데미지
//	아도겐 : 30 데미지
//	연속펀치:40 데미지
//	던지기 : 45 데미지
//	주먹,날아차기,아도겐,연속펀치,던지기 횟수를 입력받고, 제한시간 초과이면 time out,총 데미지가 100 이하이면 game over,총 데미지가 100 이상이면 you win을 출력하는 프로그램을 작성하여라.
//	단,time out이자 you win이면 time out만 출력하고,time out이자 game over이면 time out만 출력한다.
//	
//	입력
//	주먹,날아차기,아도겐,연속펀치,던지기 횟수가 공백을 두고 입력된다.
//	출력
//	제한시간 초과이면 time out,공격의 데미지의 합이 100이상이면 you win,공격의 데미지의 합이 100 미만이면 game over을 출력한다.
//	
//	입출력 예
//	입력
//	4 6 7 8 9
//	출력
//	time out

package 더블릿;

import java.util.Scanner;

public class twofifteen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int attack_1 = sc.nextInt();
		int attack_2 = sc.nextInt();
		int attack_3 = sc.nextInt();
		int attack_4 = sc.nextInt();
		int attack_5 = sc.nextInt();
		int num = 0;
		int damage = 100;
		
		
		while(attack_1>0)
		{
			damage = damage - 10;
			num++;
			attack_1--;
		}
		while(attack_2>0)
		{
			damage = damage - 15;
			num++;
			attack_2--;
		}
		while(attack_3>0)
		{
			damage = damage - 30;
			num++;
			attack_3--;
		}
		while(attack_4>0)
		{
			damage = damage - 40;
			num++;
			attack_4--;
		}
		while(attack_5>0)
		{
			damage = damage - 45;
			num++;
			attack_5--;
		}
		if(num>10)
		{
		System.out.println("time out");	
		}
		else
		{
			if(damage<0)
			{
				System.out.println("you win");
			}
			else
			{
				System.out.println("game over");
			}
		}

	}

}
