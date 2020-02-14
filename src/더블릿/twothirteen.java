//	프로그램 명: calorie(open)
//	제한시간: 1 초
//	
//	어떤 가게에는 아주 간단한 메뉴만 있다. 각 음식의 항목은 숫자로 선택한다.
//	
//	3 가지의 버거 
//	
//	1 . Cheeseburger (461 Calories) 
//	2 . Fish Burger (431 Calories) 
//	3 . Veggie Burger (420 Calories) 
//	4 . no burger 
//	
//	3 가지 음료
//	
//	1 . Soft Drink ( 130 Calories)
//	2 . Orange Juice (160 Calories)
//	3 . Milk (118 Calories)
//	4 . no drink
//	
//	3 가지 side order(추가 주문)
//	
//	1 . Fries (100 Calories)
//	2 . Baked Potato (57 Calories) 
//	3 . Chef Salad (70 Calories) 
//	4 . no side order 
//	
//	3 가지 디저트 
//	1 . Apple Pie (167 Calories)
//	2 . Sundae (266 Calories)
//	3 . Fruit Cup (75 Calories)
//	4 . no dessert
//	선택한 음식의 총 칼로리를 계산 하시오.
//	
//	입력
//	1 에서 4 사이의 정수 4 개가 주어진다. 각 수는 버거,음료,추가주문,디저트 이다.
//	출력
//	총 칼로리를 출력 예의 형식으로 출력한다.
//	
//	입출력 예
//	입력
//	2 1 3 4
//	출력
//	Your total Calorie count is 631.

package 더블릿;

import java.util.Scanner;

public class twothirteen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int buger = sc.nextInt();
		int drink = sc.nextInt();
		int side = sc.nextInt();
		int desert = sc.nextInt();
		int cal = 0;

		if(buger==1)
		{
			cal = cal + 461;
		}
		else if(buger == 2)
		{
			cal = cal + 431;
		}
		else if(buger==3)
		{
			cal = cal + 420;
		}
		else
		{
		}

		if(drink == 1)
		{
			cal = cal + 130;
		}
		else if(drink == 2)
		{
			cal = cal + 160;
		}
		else if(drink==3)
		{
			cal = cal + 118;
		}
		else
		{
		}

		if(side == 1)
		{
			cal = cal + 100;
		}
		else if(side == 2)
		{
			cal = cal + 57;
		}
		else if(side==3)
		{
			cal = cal + 70;
		}
		else
		{
		}

		if(desert == 1)
		{
			cal = cal + 167;
		}
		else if(desert == 2)
		{
			cal = cal + 266;
		}
		else if(desert==3)
		{
			cal = cal + 75;
		}
		else
		{
		}

		System.out.println("Your total Calorie count is " + cal + ".");
	}

}
