//	프로그램 명: rounders(open)
//	제한시간: 1 초
//	
//	10 보다 큰 수이면 일의 자리에서 반올림하고 , 결과가 100 보다 크면 10 의 자리에서 반올림하고 , 결과가 1000 보다 크면 결과를 100 의 자리에서 반올림하고 , ....
//	
//	입력
//	반올림 할 수 x 가 주어진다. 0 <= x <= 99 999 999
//	출력
//	반올림 한 결과를 출력한다.
//	
//	입출력 예
//	입력
//	15
//	출력
//	20
//	입력
//	5
//	출력
//	5
//	입력
//	99
//	출력
//	100
//	입력
//	12345678
//	출력
//	10000000
//	입력
//	44444445
//	출력
//	50000000

package 더블릿;

import java.util.Scanner;

public class threethirtyfour {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		
		if(num < 10)
		{
			System.out.println(num);
		}
		else
		{
			for(int i = 1 ; i < 1000000000 ; )
			{
				if(i*10 > num)
				{
					System.out.println(num);
					break;
				}
				else if(num < 10) 
				{
					break;
				}
				else
				{						
					if(num%(i*10) >= 5*((i*10)/10))
					{
						num = (num-(num%(i*10)))+(i*10);
					}
					else
					{
						num = num - (num%(i*10));
					}
				}

				i = i*10;
			}		
			
		}
		
	}

}