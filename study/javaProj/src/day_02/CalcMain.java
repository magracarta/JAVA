package day_02;

public class CalcMain {
	public static void main(String [] args) {
			System.out.println("2.1 산술 연산자");
			int a =15, b=7;
			
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
			

			//System.out.println(ture + false);
			//System.out.println(ture + 10);
			

			System.out.println("장동건" + "장서건");
			System.out.println("장동건" + 10);
			System.out.println("장동건" + true);
			//System.out.println("장동건" - "장서건");
			//System.out.println("장동건" - 10);
			//System.out.println("장동건" - true);
			
			System.out.println(3+4*5);
			System.out.println((3+4)*5);
			
			
			System.out.println("2.2 비교연산자");
			
			a = 20; b = 10;
			System.out.println(a==b);
			System.out.println(a<=b);
			System.out.println(a>=b);
			System.out.println(a!=b);
			System.out.println(a>b);
			System.out.println(a<b);
			
			String a2 = "장동건" , b2 = "정우성";
			System.out.println(a2==b2);
			System.out.println(a2!=b2);
			
			System.out.println(true==true);
			System.out.println(true==false);
			//숫자열끼리 비교가능 문자열 끼리는 비교할수가 없다.
			
			
			System.out.println("2.3 논리 연산자");
			boolean bo1 = false , bo2 = true; 
			System.out.println(bo1 && bo2);			
			System.out.println(bo1 || bo2);			
			System.out.println(bo1 ^ bo2);			
			System.out.println(!bo1);
			
			
			int age = 23;
			String color = "파랑";
			//boolean ageChk = age <= 25;
			//boolean ccChk = color == "빨강";
			
			//System.out.println("And:" + (ageChk && ccChk));
			//System.out.println("And:" + (ageChk || ccChk));

			System.out.println("And:" + (age <= 25 && color == "빨강"));
			System.out.println("And:" + (age <= 25 || color == "빨강"));
			
			
			
	}
	
	
	
}
