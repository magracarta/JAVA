package day_04;

import java.util.Scanner;

public class ScannerWhileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int tot =0;
		/*
		while(true) {
			System.out.print("숫자입력 (0 입력시 종료) :");
			int i = sc.nextInt();
			if(i==0) {
				break;
			}
			tot += i;
		}
		
		System.out.println("종료: " + tot);
		*/
		tot =0;
		
		String menuText = "";
		while(true) {
			System.out.print("메뉴를 골라주세요 : ");
			int menu = sc.nextInt();
			
			int price =0;
			if(menu == 0) break;
			else if(menu ==1) 
			{
				price =2500;
				menuText="아메리카노";
			}else if(menu ==2) {
				price =2700;
				menuText="아프리카노";
			}else if(menu ==3) {
				price =3000;
				menuText="아시아노";
			} 
			System.out.println("메뉴: " + menuText +"  "+price +"원");
			System.out.print("수량을 골라주세요 :");
			
			int count = sc.nextInt();
			System.out.println("수량" + count +"가격"+(price*count));
			tot += (price*count);
		}
		System.out.println("금액 합계: " + tot);
		
		
		
	}

}
