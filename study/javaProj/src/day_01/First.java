package day_01;

public class First { // 대표 클래스 시작
	public static void main(String[] args) { // main 메소드 시작
		System.out.println("첫번째 입니다.");
		//콘솔창에 출력하는 메소드
		
		//1. 숫자
		System.out.println(100);
		System.out.println(123.456);
		System.out.println(15+7);
		System.out.println(15-7);
		System.out.println(15*7);
		System.out.println(15/7);
		System.out.println(15%7);
		
		//2. 문자
		System.out.println('a');
		//System.out.println('');
		//System.out.println('abcd');
		System.out.println('가');
		System.out.println('■');
		System.out.println('日');
		
		//3. 문자
		System.out.println("a");
		System.out.println("");
		System.out.println("abcdwdof");
		System.out.println("100"+"50");//숫자가아님 문자열이다.
		
		//4. 서식문자
		/* 
		 /'  => ' 
		 /" => "
		 /t => 탭
		 /n => 줄바꿈
		 
		 
		  */
		System.out.println("나폴레옹은 '이 산이 아닌데?' 라고 생각했다.");
		System.out.println("나폴레옹은 \"줄이야!\"라고 생각했다.");
		System.out.println("아기상어\t뚜루루 뚜루\n귀여운\t뚜루루두루\n바다속\t뚜루루 뚜루\n아기상어");
		
		System.out.println("장수풍뎅이");//출력문 이후 줄바꿈 실행
		System.out.print("사슴벌레");//출력문만 실행
		System.out.print("소벌레");
		System.out.print("양벌레");
		
		System.out.println("\nprintln");
		System.out.println();
		System.out.println("print 끝");
		//System.out.print(); 줄력 내용이 없으면 에러 : println 과 차이점
		
		
	} // main 메소드 끝
}//대표 클래스 끝

