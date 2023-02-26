package day_02;

public class TypeMain {

	public static void main(String[] args) {
		
		boolean bo = true; //참 거짓을 나타내는 1바이트 짜리 
		System.out.println(bo);
		bo = false;
		System.out.println(bo);
		//bo = 1;
		//bo = true;
		//bo= "true"; boolean은 true false 만 들어감 다른건 안들어감!!
		
		byte bb = 100; // -128 ~127 매우 작은 단위 까지만 사용가능
		System.out.println(bb);
		//bb= true;
		//bb = "1234";
		bb = 127;
		//bb = 128;
		System.out.println(bb);
		
		short sh = 128;
		System.out.println(sh);
		sh = -32768;
		System.out.println(sh);
		sh = 32767;
		//sh = 32768;
		System.out.println(sh);
		int i = 2147483647;
		System.out.println(i);
		// i = 2147483648;
		
		
		long lo = 2147483648L; //long의 번주를 포함하려면 l붙여야한다.
		System.out.println(lo);
		lo = 9223372036854775807L; //이이상은 만들어서 표현해야한다... 자료형으론 불가능.
		System.out.println(lo);
		
		
		bb = 123;
//		bb = 1234.456;
		
		float ff = 123;
		ff = 132.456F;
		System.out.println(ff);
		
		
		double dd = 456;
		System.out.println(dd);
		
		dd = 456.798;
		System.out.println(dd);
		
		
		char ch = 'a';
		System.out.println(ch);
		//ch = true;
		//ch = 123.456;
		ch = 100; // 아스키 코드 => 숫자 100에 해당하는 문자 d 97=A 65=a 45 =0
		System.out.println(ch);
		
		//스트링은클래스 => 기본 자료형이 아님
		String ttt ="adss";
		System.out.println(ttt);
		
	}
}
