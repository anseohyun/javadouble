//	���α׷� ��: coci_kornislav
//	���ѽð�: 1 ��
//	
//	[���] ���� �װ��� �־��� �� �� ���� �������� �� ���� 90 �� ���� �������� ���� �簢���� ���� �� �� �� �ִ� ������ ���ϴ°��� �����̴�.
//	���� ��� , 1 2 3 4 �� �־����ٸ� �ִ� ������ 3 �̴�.
//	
//	����� ��
//	input 
//	1 2 3 4 
//	output 
//	3 
//	input 
//	4 4 3 4 
//	output 
//	12 

package ����;

import java.util.Scanner;

public class twotwentyone {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr []  = new int[4];
		
		for(int i = 0 ; i < 4 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int j = 0 ; j < 3 ; j++)
		{
			for(int i = 0 ; i < 3 ; i++)
			{
				if(arr[i] > arr[i+1])
				{
					int blank;
					blank = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = blank;
				}
			}
		}
		System.out.println(arr[0]*arr[2]);

	}

}
