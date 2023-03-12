package day_03;

public class Switchmain {
	public static void main(String [] args) {
		//switch(true){x
		//switch(132.456){x
		//switch('a'){
		//switch("아기상어"){
		//switch(20){
		switch(20){
		case 30:
			System.out.println("30 지이롱");
			
		case 20:
			System.out.println("20 지이롱");
			
		case 10:
			System.out.println("10 지이롱");
			
		case 50:
			System.out.println("50 지이롱");
			
			
			/*
			 case 30: case 값 중첩 불가
			 
			 * */
		}
		System.out.println("switch 종료---------1");
		
		switch(0){
		case 30:
			System.out.println("30 지이롱");
			break;
		case 20:
			System.out.println("20 지이롱");
			break;
		default://위치가 중요하지 않음
			System.out.println("기본값입니다.");
			break;
		case 10 ,100: //동시에 여러값 가능
			System.out.println("10,100 지이롱");
			break;
		case 50:
			System.out.println("50 지이롱");
		}
		System.out.println("switch 종료---------2");
	
		
		String pos = "대리";
		int basic = 400;
		double bonus = 0;
		switch(pos) {
		case "부장":
			bonus = 0.5;
			break;
		case "과장":
			bonus = 0.3;
			break;
		case "대리":
			bonus = 0.2;
			break;
		case "사원":
			bonus = 0.1;
			break;
		
		}
		
		int money = basic + (int)(basic * bonus);
		
		System.out.println(money);
		
//		커피종류
		String  menu = "아메리카노";
		int price = 0;
		int num = 3;
		int sumpr; 
		switch(menu) {
		case "아메리카노":
			price = 2000;
			break;
		case "아시아노":
			price = 3000;
			break;
		case "아프리카노":
			price = 4000;
			break;
		}
		sumpr =price *num; 
		System.out.println(menu + num+"잔 :" + sumpr );
		
		/*
		 평점 만점 : 4.5로 환산하여 등급을 구하시오.
		 4.5 A+
		 4.0 A
		 3.5 B+
		 3.0 B
		 2.5 C+
		 2.0 C
		 1.5 D+
		 1   D
		     F
		  
		 */
		
		double jumsu = 2.8;
		String hackjum ="";
		
		switch((int)jumsu) {
		case 4:
			hackjum="A";
			break;
		case 3:
			hackjum="B";
			break;
		case 2:
			hackjum="C";
			break;
		case 1:
			hackjum="D";
			break;
		default:
			hackjum="F";
			break;
		}
		if((int)(jumsu*10) - (int)jumsu*10 >= 5) hackjum +="+";
		System.out.println(hackjum);
		
		
		double jum = jumsu;
		System.out.println((int)(jum*2));
		
		String grade ="";
		switch ((int)(jum*2) ) {
		case 9:
			grade="A+";
			break;
		case 8:
			grade="A";
			break;
		case 7:
			grade="B+";
			break;
		case 6:
			grade="B";
			break;
		case 5:
			grade="C+";
			break;
		case 4:
			grade="c";
			break;
		case 3:
			grade="D+";
			break;
		case 2:
			grade="D";
			break;
		case 1:
			grade="F";
			break;
		}
		System.out.println(grade);
	}
}
