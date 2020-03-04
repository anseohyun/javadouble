//	프로그램 명: steps
//	제한시간: 1 초
//	
//	원점 (0.0) 에서 시작하여 그림과 같이 0,1,2,3,... 의 숫자를 쓴다.
//	예를 들어 , 1 , 2 , 3 은 좌표 (1,1) , (2,0) , (3,1) 이다.
//	(x,y) 좌표를 입력으로 받아 이 좌표에 쓰여진 숫자를 출력하시오. x, y 은 범위는 0 ... 5000 이다.
//	
//	입력
//	x,y 좌표가 입력으로 주어진다.
//	출력
//	할당된 번호를 출력한다. 할당된 번호가 없는 경우 'No Number' 를 출력한다.
//	
//	입출력 예
//	입력
//	4 2
//	출력
//	6
//	입력
//	6 6
//	출력
//	12
//	입력
//	3 4
//	출력
//	No Number

package 더블릿;

import java.util.Scanner;

public class threefiftyone {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int i = 0;
		int xnum[] = new int[4];
		int ynum[] = new int[4];
		int res = 0;
		
		xnum[0] = 0;
		xnum[1] = 1;
		xnum[2] = 2;
		xnum[3] = 3;
		ynum[0] = 0;
		ynum[1] = 1;
		ynum[2] = 0;
		ynum[3] = 1;
		
		for(i = 0 ; i <= 3 ; i++)
		{
			if(x == xnum[i] && y == ynum[i])
			{
				System.out.println(i);
				res++;
			}
		}
		
		i = 0;
		int j = 4;
		
		if(res == 0)
		{
			while(xnum[i] < x+5 && ynum[i] < y+5)
			{
				
					xnum[i] = xnum[i] + 2;
					ynum[i] = ynum[i] + 2;
					if(x == xnum[i] && y == ynum[i])
					{
						System.out.println(j);
						res++;
					}
				
				
					xnum[i+1] = xnum[i+1] + 2;
					ynum[i+1] = ynum[i+1] + 2;
					if(x == xnum[i+1] && y == ynum[i+1])
					{
						System.out.println(j+1);
						res++;
					}			
				
				
					xnum[i+2] = xnum[i+2] + 2;
					ynum[i+2] = ynum[i+2] + 2;
					if(x == xnum[i+2] && y == ynum[i+2])
					{
						System.out.println(j+2);
						res++;
					}
				
				
					xnum[i+3] = xnum[i+3] + 2;
					ynum[i+3] = ynum[i+3] + 2;
					if(x == xnum[i+3] && y == ynum[i+3])
					{
						System.out.println(j+3);
						res++;
					}					
				
				
				j = j+4;
				
			}
			
			if(res == 0)
			{
				System.out.println("No Number");
			}
		}

	}

}
