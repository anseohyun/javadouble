//	프로그램 명: rao(open)
//	제한시간: 1 초
//	
//	삼각형의 세 변의 길이가 주어질 때 이 삼각형이 직각(right) 삼각형인지 , 예각(acute) 삼각형 인지 , 둔각(obtuse) 삼각형인지를 판별 하라.
//	
//	입력
//	세 변의 길이 a,b,c 가 주어진다.(a,b,c 는 10000 이하의 자연수)
//	이루어질 수 없는 삼각형은 주어지지 않는다.
//	출력
//	right,acute,obtuse 중 하나를 출력한다.
//	
//	입출력 예
//	입력
//	5 3 4
//	출력
//	right

package 더블릿;

import java.util.Scanner;

public class twotwentyeight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int long_;
		int short_;
		
		if(a > b)
		{
			if(a > c)
			{
				long_ = a*a;
				short_ = b*b + c*c;
			}
			else 
			{
				if(b > c)
				{
					long_ = b*b;
					short_ = a*a + c*c;
				}
				else 
				{
					long_ = c*c;
					short_ = a*a + b*b;
				}
			}			
		}
		
		else
		{
			if(b > c)
			{
				long_ = b*b;
				short_ = a*a + c*c;
			}
			else 
			{
				if(a > c)
				{
					long_ = b*b;
					short_ = a*a + c*c;
				}
				else 
				{
					long_ = c*c;
					short_ = a*a + b*b;
				}
			}
		}
	
		
		
		if(long_ == short_)
		{
			System.out.println("right");
		}
		else if(long_ > short_)
		{
			System.out.println("obtuse");
		}
		else
		{
			System.out.println("acute");
		}

	}

}
