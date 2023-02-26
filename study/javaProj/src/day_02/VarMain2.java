package day_02;

public class VarMain2 {

	public static void main(String[] args) {
		int a;//변수 선언
		a = 10;//변수 대입
		
		System.out.println(a); //변수 호출
		
		int b;
		
		//System.out.println(b); // 대입하지 않은 변수 호출 불가
		
		int c = 30;//변수 선언 및 초기화 (초기화 : 최초 대입 - 보통 선언과 같이 실행)
		System.out.println(c); 
		//int a;  동일한 이름의 변수 선언 불가
		
		//변수 이름 규칙
		//int + = 3; 특수 기호 불가
		int __ = 5; // _사용 가능 but 두개이상 쓰기 선호
		System.out.println(__); 
		
		//int 9 = 8; 시작이 숫자가 되는건 불가
		int a9 =8 ;
		System.out.println(a9);
		
		//int int =7; 예약어 사용불가
		//int aa bb =6; 띄어쓰기 불가
		
		int 국어 =88;
		System.out.println(국어);
		
		/*
		 
		 bit(전구 1개)	(기계제어, 해커하는 쪽)	            <- 기호신호  //-> 정보 데이터 byte 부터 따진다 (웹/게임기 포스기/모바일 : 운영쪽)
		                                        BCD        ASCII		  EBCDIC(byte)
		 1       2    3       4         5       6          7               8
		 2       4    8       16        32      64         128             256 
		 ---------------------------------------------------------------------------------------
		 0:off   00   000    0~9:10개           0~9:10개    +특수기호       +부호(양수:0, 음수:1)
		 1:on    01   001	                   a~z:26개                         글자가 표현이 잘 안됨.     
		         10   010                      A~Z:26개
		         11   011                         ----
		         	  100                         62개
		              101
		              110
		              111
		
		 */
		
		int q = 5, w= 6, e = 7; //다중 선언 및 초기화 가능
		System.out.println(q+","+w+","+e);
		
		//int z=x=v=8; 불가
		
		//int y =u , u = i, i =8; 순서 로인해 사용 불가
		
		int y = 9, u=y , i =u;

		//직사각형 : h-가로  k - 세로
		int h = 5, k = 7; 
		int o = h*k;//넓이
		int p = (h+k)*2;//둘레
		
		System.out.println("가로 : "+h);
		System.out.println("세로 : "+k);
		System.out.println("넓이 : "+o);
		System.out.println("둘레 : "+p);
		
		
		int height = 5, width = 7;
		int area = height*width;
		int border = (height+width)*2;
		
		//번호
		int number = 12;
		int num = 34;
		
		//학생 번호
		int studentNumber = 45;
		int stdnum = 45; // 앞글자 혹은 자음 위주로 줄임
		int stdNum = 90; // 카멜 표기법 - 합성단어 첫글자 대문자로
		
		
		int std_num = 87; // 언더스코어 (대소문자 구분이 안가는 프로그램에서 주로 사용)
		
		
	
		
		
	}

}
