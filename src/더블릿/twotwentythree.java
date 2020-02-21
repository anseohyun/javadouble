//	프로그램 명: equation
//	제한시간: 1 초
//	
//	주희는 일차 방정식을 배우고 있다.
//	ax + b = cx + d
//	의 꼴로 a,b,c,d 가 주어질 때 방정식의 해(근)를 구하는 것을 프로그램으로 해결하려고 한다.
//	
//	입력
//	a , b , c, d 가 입력으로 주어진다. 각 수는 -1000 이상 1000 이하 정수이다.
//	출력
//	근이 두 개 이상 존재하면 many , 존재하지 않으면 none 아니면 구한 근을 소수 이하 세자리까지 출력한다.
//	
//	입출력 예
//	입력
//	3 2 3 2
//	출력
//	many
//	입력
//	3 2 3 8
//	출력
//	none
//	입력
//	4 2 3 8
//	출력
//	6.000

package 더블릿;

import java.util.Scanner;

public class twotwentythree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double d = sc.nextInt();
		String result = String.format("%.3f", (d-b)/(a-c));
		
		if(a == c && b == d)
		{
			System.out.println("many");
		}
		else if(a == c && b != d)
		{
			System.out.println("none");
		}
		else
		{
			System.out.println(result);
		}
		
	}

}
