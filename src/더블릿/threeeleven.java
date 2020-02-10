package ´õºí¸´;

import java.util.Scanner;

public class threeeleven {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int arr []  = new int[7];
	for(int i = 0; i<7;i++)
	{
		arr[i] = sc.nextInt();
	}
	
	
	int max = arr[0];
	for(int p = 0; p<6; p++)
	{
		if(max < arr[p+1])
		{
			max = arr[p+1];
		}
	}
	
	int min = arr[0];	
	for(int j = 0; j<6;j++)
	{
		if(min > arr[j+1])
		{
			min = arr[j+1];
		}
	}
	
	System.out.println(max + " "+ min);
	
}
}
