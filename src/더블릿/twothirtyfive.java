//	���α׷� ��: pool
//	���ѽð�: 1 ��
//	
//	�����忡�� ���̺��� �� �� ������ ���� Wilbur�� �ڱ� �޸��翡 ���簢�� ����� �������� ������ �Ѵ�.
//	Wilbur�� ������ ��ǥ���� �����ϰ� ���簢���� ���� ��ǥ��� �����ϵ��� �������� ���´�.
//	Wilbur�� ���� ���� �������� �� �������� �׷����Ҵµ�, Wilbur�� ģ���� �����ͼ� �� �������� �Ϻθ� �������ȴ�.
//	Wilbur�� ȭ�� ������ �̳� ������ ��������� �����ߴ�. n���� �������� ���������� �� ������ ���� �������� ���� ���������� �˾� �� �� ������?'
//	
//	�Է� ����
//	ù���� n(1<=n<=4)�� �Էµȴ�. Wilbur�� ģ���� ������ ���� �������� ���̴�.
//	���� n���� �� ���� xi�� yi(-1000<=xi,yi<=1000)�� �Էµȴ�. �����ִ� �������� ��ǥ�̴�.
//	���������� ������ ������� �Էµȴ�.
//	�� ���������� ���� �ٸ� ��ǥ�� ������ �ְ�, �簢���� ���� ��ǥ��� �����ϴ�.
//	��� ����
//	�����ִ� ��ǥ��� ���� ���������� �˾� �� �� �ִ� ��쿡 �� �簢���� ���̸� ����Ѵ�.
//	���� ���������� Ȯ���ϰ� �˾� �� �� ���� ��� -1�� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	2
//	0 0
//	1 1
//	���
//	1
//	�Է�
//	1
//	1 1
//	���
//	-1

package ����;

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
