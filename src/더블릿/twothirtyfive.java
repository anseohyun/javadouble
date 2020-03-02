//	프로그램 명: pool
//	제한시간: 1 초
//	
//	수영장에서 다이빙에 몇 번 실패한 이후 Wilbur는 자기 뒷마당에 직사각형 모양의 수영장을 지으려 한다.
//	Wilbur는 가상의 좌표축을 설정하고 직사각형의 변이 좌표축과 평행하도록 수영장을 짓는다.
//	Wilbur는 종이 위에 수영장의 네 꼭지점을 그려놓았는데, Wilbur의 친구가 몰래와서 그 꼭지점들 일부를 지워버렸다.
//	Wilbur는 화가 났지만 이내 마음을 가라앉히고 생각했다. n개의 꼭지점이 남아있을때 이 정보로 원래 지워지기 전의 꼭지점들을 알아 낼 수 있을까?'
//	
//	입력 형식
//	첫줄은 n(1<=n<=4)가 입력된다. Wilbur의 친구가 지우지 않은 꼭지점의 수이다.
//	다음 n줄은 두 정수 xi와 yi(-1000<=xi,yi<=1000)가 입력된다. 남아있는 꼭지점의 좌표이다.
//	꼭지점들은 임의의 순서대로 입력된다.
//	이 꼭지점들은 서로 다른 좌표를 가지고 있고, 사각형의 변은 좌표축과 평행하다.
//	출력 형식
//	남아있는 좌표들로 원래 꼭지점들을 알아 낼 수 있는 경우에 그 사각형의 넓이를 출력한다.
//	원래 꼭지점들을 확실하게 알아 낼 수 없는 경우 -1을 출력한다.
//	
//	입출력 예
//	입력
//	2
//	0 0
//	1 1
//	출력
//	1
//	입력
//	1
//	1 1
//	출력
//	-1

package 더블릿;

import java.util.Scanner;

public class twothirtyfive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x[] = new int[n+1];
		int y[] = new int[n+1];
		int res;
		
		for(int i = 0 ; i < n ; i++)
		{
			x[i+1] = sc.nextInt();
			y[i+1] = sc.nextInt();
		}
		
		if(n == 4)
		{
			for(int j = 1 ; j <= 4 ; j++)
			{
				int i = 1;
					if(i != j)
					{
						if(x[i] != x[j] && y[i] != y[j])
						{
							res = (x[j] - x[i])*(y[j] - y[i]);
							if(res < 0)
							{
								System.out.println(res*(-1));
							}
							else
							{
								System.out.println(res);
							}
						}
					}
				}
			
		}
		else if(n == 3)
		{
//			System.out.println(1);
			for(int j = 1 ; j <= 3 ; j++)
			{
//				System.out.println(1);
				int i = 1;
//				System.out.println(x[i]+ " " + x[j]);
//				System.out.println(y[i]+ " " + y[j]);		
				if(x[j] != 0 || y[j] != 0)
				{		
//				System.out.println(x[i]+ " " + x[j]);
//				System.out.println(y[i]+ " " + y[j]);
//				System.out.println();
					if(i != j)
					{
//						System.out.println(1);
						if(x[i] != x[j] && y[i] != y[j])
						{
//							System.out.println(x[i] + " " +x[j] +" " +12);
							
							res = (x[j] - x[i])*(y[j] - y[i]);
							if(res < 0)
							{
								System.out.println(res*(-1));
								while(true)
								{
									break;
								}
							}
							else
							{
								System.out.println(res);
								while(true)
								{
									break;
								}
							}
						}
						else
						{
							i =2;
//							System.out.println(1);
//							System.out.println(x[i]+ " " + x[j]);
//							System.out.println(y[i]+ " " + y[j]);
//							System.out.println();
							if(i != j)
							{
//								System.out.println(1);
								if(x[i] != x[j] && y[i] != y[j])
								{
//									System.out.println(x[i] + " " +x[j] +" " +12);
									
									res = (x[j] - x[i])*(y[j] - y[i]);
									if(res < 0)
									{
										System.out.println(res*(-1));
										while(true)
										{
											break;
										}
									}
									else
									{
										System.out.println(res);
										while(true)
										{
											break;
										}
									}
								}
							}
						}	
					}
				}
			}
		}
		else if(n == 2)
		{
			if(x[1] == x[2] || y[1] == y[2])
			{
				System.out.println(-1);
			}
			else
			{
				res = (x[1] - x[2])*(y[1] - y[2]);
				if(res < 0)
				{
					System.out.println(res*(-1));
				}
				else
				{
					System.out.println(res);
				}
			}
		}
		else
		{
			System.out.println(-1);
		}
		
	}

}
