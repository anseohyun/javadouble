//	프로그램 명: ATM(open)
//	제한시간: 1 초
//	
//	영자는 ATM(Automated Teller Machine) 기에서 X $ 의 돈을 인출하고자 한다. 이 기계는 5 의 배수 금액 만을 취급한다. 단, 인출할 때 마다 0.5 $ 의 수수료를 내어야 한다.
//	거래 후의 계좌에서 남은 금액을 계산하라.
//	
//	입력
//	두 수가 입력으로 주어진다.
//	첫 수는 인출 할 금액으로 정수이고 0 < X <= 10000
//	다음 수는 소수 이하 두 자리 수를 가진 최초 계좌의 금액($)이다. 0 <= Y <= 2000
//	출력
//	거래 후의 잔액을 소수 이하 두자리로 출력한다. 정상 적인 인출이 불가능할 경우 원래의 금액을 출력한다. ATM 기계에는 충분한 돈이 있다는 것은 보장된다.
//	
//	입출력 예
//	입력
//	30 120.00
//	출력
//	89.50
//	입력
//	42 120.00
//	출력
//	120.00
//	입력
//	300 120.00
//	출력
//	120.00


package 더블릿;

import java.util.Scanner;

public class twotwelve {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double withdraw = sc.nextDouble();
		double balance = sc.nextDouble();
		
		if(withdraw%5==0)
		{
			System.out.println(balance-0.5-withdraw);
		}
		else
		{
			System.out.println(balance);
		}

	}

}
