//	프로그램 명: sc
//	제한시간: 1 초
//	
//	점수를 입력으로 받아 각 점수별 학점분포 수를 구하는 문제이다.
//	각 점수별 학점은 다음과 같다.
//	A : 100 - 90
//	B : 80 - 89
//	C : 70 - 79
//	D : 60 - 69
//	F : 그 외
//	
//	입력
//	1 에서 100 사이 정수가 입력으로 주어진다. 입력된 점수는 100 개를 넘지 않는다. -1 은 입력의 끝이다.
//	출력
//	첫 수는 입력된 점수의 수이고
//	다음 줄 부터 차례대로 A , B , C, D ,F 학점의 수를 출력한다.
//	
//	입출력 예
//	입력
//	100 90 60 58 -1
//	출력
//	4
//	2
//	0
//	0
//	1
//	1
//	출력 예 보충
//	4 는 입력된 점수의 수이고 , A 학점이 2 명 , B,C 학점은 없고 D 학점이 1 명 , F 학점이 1 명.

package 더블릿;

import java.util.Scanner;

public class threethirtyfive {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int f = 0;
			
			int n = -1; 
			
			while(true)
			{
				int score = sc.nextInt();
				n++;
				
				if(score == -1)
				{
					break;
				}
				else if(score >=  90 && score <= 100)
				{
					a++;
				}
				else if(score >=  80 && score <= 89)
				{
					b++;
				}
				else if(score >=  70 && score <= 79)
				{
					c++;
				}
				else if(score >=  60 && score <= 69)
				{
					d++;
				}
				else
				{
					f++;
				}
			}
			
			System.out.println(n);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(f);
			

	}

}
