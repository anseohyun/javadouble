//	프로그램 명: count
//	제한시간: 1 초
//	
//	그림과 같은 규칙을 가지는 수열이 있다.
//	첫 항은 1/1 , 두 번째 항은 1/2 , 세 번째 항은 2/1 , 네 번째 항은 3/1 , 다섯번 째 항은 2/2, ...
//	몇 번째 항에 어떤수가 오는지를 알아내는 프로그램을 작성하시오.
//	
//	입력 형식
//	입력은 1 부터 2 * 109 까지 자연수 이다.
//	출력 형식
//	출력은 아래 출력 예의 형식으로 한다.
//	
//	입출력 예
//	입력
//	14
//	출력
//	14 IS 2/4

package 더블릿;

import java.util.Scanner;

public class threefiftytwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int x = 1;
		int y = 2;
		int i;
			
		if(a == 1)
		{
			System.out.println(a + " IS " + "1/1");
		}
		else if(a == 2)
		{
			System.out.println(a + " IS " + "1/2");
		}
		else
		{
			for(i = 2 ; i <= a ; )
			{
				if(x > y)
				{
					while(x != 1 || y%2 !=1)
					{
						if(y == 1 && x%2 == 0)
						{
							x++;
							i++;
						}
						else
						{
							x--;
							y++;
							i++;
						}
						if(a == i)
						{
							System.out.println(a + " IS " + x + "/" + y);
							return;
						}
					}
				}
				else if(x < y)
				{
					while(y != 1 || x%2 != 0)
					{
						if(x == 1 && y%2 ==1)
						{
							y++;
							i++;
						}
						else
						{
							x++;
							y--;
							i++;
						}
						if(a == i)
						{
							System.out.println(a + " IS " + x + "/" + y);
							return;
						}
					}
				}
			}
		}
	}

}
