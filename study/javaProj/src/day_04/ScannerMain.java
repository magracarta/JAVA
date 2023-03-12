package day_04;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("문자열 입력 : ");
		
		String ttt = sc.nextLine();
		System.out.println("ttt : "+ttt);
		System.out.println("문자열 입력 : ");
		ttt = sc.next();
		System.out.println("ttt : "+ttt);
		ttt = sc.next();
		System.out.println("ttt : "+ttt);
		
		
		System.out.print("정수 입력 : ");
		int i =sc.nextInt();
		System.out.println("nextInt: "+i);
		
		

		System.out.print("실수 입력 : ");
		double dd =sc.nextDouble();
		System.out.println("nextInt: "+dd);
		
		

		System.out.print("boolean 입력 : ");
		boolean bb =sc.nextBoolean();
		System.out.println("nextInt: "+ bb);
		*/
		
		System.out.print("정수 입력 : ");
		int i =sc.nextInt();
		System.out.println("nextInt: "+i);
		sc.nextLine();
		System.out.println("문자열 입력 : ");
		String ttt = sc.nextLine();
		System.out.println("문자열 입력 : "+ttt);
		//정수 입력 후 문자열 입력 불가...(엔터값을 가지고있기때문에)
		
		
		
		
		
	}

}
