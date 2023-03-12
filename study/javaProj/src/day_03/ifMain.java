package day_03;

public class ifMain {
	public static void main(String [] args) {
		
		if(true){
				System.out.println("참이지롱");
				System.out.println("참이지롱");
				System.out.println("참이지롱");
				System.out.println("참이지롱");
		}
		System.out.println("--------------if 종료--------------1");
		
		if(false) // 중괄호가 없을 경우 if 문 다음 실행 구문 1개만 종속구문임.
			System.out.println("참이지롱2");
			
		
		System.out.println("참이지롱2");
		System.out.println("참이지롱2");
		System.out.println("참이지롱2");
		
		System.out.println("--------------if 종료---------------2");
		
		if(true){
			
		}
//		if(true) 중괄호 없을 경우 종속 구문 1개가 반드시 필요
	System.out.println("--------------if 종료---------------3");
	
	int b= 20, c,d;
	
	if(true){
		int a = 10;//내부 변수  : if 문 현재 구간에서만 사용가능
		//다른 구간일 경우 중복선언 가능
		c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	System.out.println("--------------if 종료--------------4");
	System.out.println( b + "" + c);
	
	boolean bo = true;
	if(bo){ //변수 같이 변할수 있음.반드시 실행한다는 보장이 안되어있기때문에 d가 초기값이 없다고 생각하게 된다.
		    //(신뢰 할수 없는 코드)
		int a = 10;
		d = 30;
		//현재 구간이 반드시 실행한다는 보장이 없음
		System.out.println(a+"a: d"+d);
	}
	//System.out.println(d);
	
	System.out.println("--------------if 종료--------------5");
	
	if(true){
		System.out.println("if~else 참이지롱 1");
	}else{
		System.out.println("if~else 거짓이지롱 1");
	}
	System.out.println("if~else 종료 ------1");
	
	if(false){
		System.out.println("if~else 참이지롱 2");
	}else{
		System.out.println("if~else 거짓이지롱 2");
	}
	System.out.println("if~else 종료 ------2");
	
	bo = true;
	int e,f;
	if(bo){
		// e:  초기화 되지 않고 조건문을 변수로 처리하여도
		//     모든 경우에서 외부변수를 초기화 
		int a = 11;
		e = 50;
		f = 10;
		System.out.println("if~else 참이지롱 3: "+a);
	}else{
		int a = 22;
		e =60;
		System.out.println("if~else 거짓이지롱 3: "+a);
	}
	System.out.println("if~else 종료 ------3 "+e );
	//System.out.println("if~else 종료 ------3 "+e +"" + f);
	//f는 둘다있는것이 아니기때문에 작동 x
	

	int jum = 68;
	if(jum >= 80){
		System.out.println("합격");
	}else {
		System.out.println("불합격");
	}
	System.out.println("if~else 종료 ------4 ");
	
	if(jum >= 80){
		System.out.println("우수");
	}else if(jum >= 60){
		if(jum % 2 ==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		System.out.println("양호");
	}else if(jum >= 40){
		System.out.println("정상");
	}else {
		System.out.println("미흡");
	}
	
	
	
	}
}
