//	���α׷� ��: steps
//	���ѽð�: 1 ��
//	
//	���� (0.0) ���� �����Ͽ� �׸��� ���� 0,1,2,3,... �� ���ڸ� ����.
//	���� ��� , 1 , 2 , 3 �� ��ǥ (1,1) , (2,0) , (3,1) �̴�.
//	(x,y) ��ǥ�� �Է����� �޾� �� ��ǥ�� ������ ���ڸ� ����Ͻÿ�. x, y �� ������ 0 ... 5000 �̴�.
//	
//	�Է�
//	x,y ��ǥ�� �Է����� �־�����.
//	���
//	�Ҵ�� ��ȣ�� ����Ѵ�. �Ҵ�� ��ȣ�� ���� ��� 'No Number' �� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	4 2
//	���
//	6
//	�Է�
//	6 6
//	���
//	12
//	�Է�
//	3 4
//	���
//	No Number

package ����;

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
