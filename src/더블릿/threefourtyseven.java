//	���α׷� ��: parking
//	���ѽð�: 1 ��
//	
//	��ç�� �� ��Ʈ��Ʈ�� ������ �� ���� ���� �տ� ���� �� �ʿ��� ���Է� �ɾ��. ����� ��ç�� ���� �װ� �ȴ� �Ÿ��� �ּҰ� �Ǵ� ���� ������ ã�� ���̴�. ���������� ������ȣ�� �������� �ְ� , �� ������ ������ �����ؾ� �Ѵ�.
//	��ç�� ���� �� �ι� �� ������ ����. �׸��� �ٸ��� ưư�ؼ� ��� ���� ��� �Դٸ� ���ٸ� �ϴµ��� ����ġ �ʴ´�.
//	
//	�Է�
//	ù ��° ���� ��ç�� �湮�� ���� �� n �̰� , ���� n ���� ���� ���� ��ȣ Xi �̴�.( 1 �� n �� 20, 0 �� Xi �� 99 )
//	���
//	������ ��ġ�� �����ؼ� �ȴ� �Ÿ��� �ּ� ���� ����Ѵ�.
//	
//	����� ��
//	�Է�
//	4
//	24 13 89 37
//	���
//	152
//	�Է�
//	6
//	7 30 41 14 39 42
//	���
//	70

package ����;

import java.util.Scanner;

public class threefourtyseven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int park[] = new int[n];
		int res = 0;
		
		for(int i = 0 ; i < n ; i++)
		{
			park[i] = sc.nextInt();
		}

		for(int i = 0 ; i < n-1 ; i++)
		{
			for(int j = 0 ; j < n-1 ; j++)
			{
				if(park[j] > park[j+1])
				{
					int num;
					num = park[j];
					park[j] = park[j+1];
					park[j+1] = num;
				}
			}
		}
		
		for(int i = n-1 ; i > 0 ; i--)
		{
			res = res +  park[i] - park[i-1];
		}
		
		System.out.println(res*2);
			
	}

}
