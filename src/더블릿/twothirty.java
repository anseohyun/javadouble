//	���α׷� ��: beat
//	���ѽð�: 1 ��
//	
//	���ۺ� �����̳��̴�. �������� ���� �� ������ �̿��ؼ� ���� ��Ŀ�� ������ ���ھ ���ߴ� ������ �����ߴ�.
//	�� �� ���� ������ �� �� ���� �־��� �� , �� ���� ������ �˾Ƴ��� ���̴�.
//	
//	�Է�
//	�� ���� �� s , d �� �Է����� �־�����. s �� ���̰� , d �� ��( ū�� - ������)�̴�.
//	���
//	�� �׽�Ʈ �����ʹ� �� ���� ������ ū �� , ���� �� ������ ����Ѵ�. �������� �ʴ� ��쿡�� impossible �� ����Ѵ�. ������ ������ �� �� ����.
//	
//	����� ��
//	�Է�
//	40 20
//	���
//	30 10
//	�Է�
//	20 40
//	���
//	impossible

package ����;

import java.util.Scanner;

public class twothirty {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int d = sc.nextInt();
		int teamA;
		int teamB;
		int check = 0;
		
		for(teamA = 0 ; teamA <= s ; teamA++)
		{
			teamB = s - teamA;
			if(teamB - teamA == d)
			{
				System.out.println(teamB + " " + teamA);
				check++;
				break;
			}
		}
		
		if(check == 0)
		{
			System.out.println("impossible");
		}
		
	}

}