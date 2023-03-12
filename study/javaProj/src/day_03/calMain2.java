package day_03;

public class calMain2 {
	public static void main(String [] args) {
		System.out.println("1. 1 증감 연산자");
		int a =5;
		//a =a+1;
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		//a**; no
		//a%% 증강 연산자는 더하기랑	빼기만 가능
		System.out.println("a++: "+a++); // 후치 연산
		System.out.println(a);
		
		System.out.println("++a: "+ ++a); //전치 연산
		System.out.println(a);
		
		
		int aa=5, bb=6, cc=10, dd;
		dd= aa++ +  ++cc - bb-- * --aa + aa++;
		     
		System.out.println(aa+"," + bb + "," + cc+"," +  dd);
		
		a = 4;
		//a = a+3;
		a += 3;
		
		System.out.println(a);
		
		System.out.println("a-=2 : "+(a-=2));
		System.out.println("a*=6 : "+(a*=6));
		System.out.println("a/=3 : "+(a/=3));
		System.out.println("a%=7 : "+(a%=7));
		
		

		System.out.println("3. 조건 연산자");
		System.out.println(true? "참이지롱" : "거짓 부렁");
		System.out.println(false? "참이지롱" : "거짓 부렁");
		
		a = 88;
		String res = a >= 80 ? "합격" : "불합격";
		System.out.println(a + " : " + res);
		
		a = 68;
		// 80 > 60 > 40 순서대루..
		res = a >= 80 ? "우수" : 
			  a >= 60 ? "양호" :
			  a >= 40 ? "정상" : 
			  "미흡";
			  
		System.out.println(a + " : " + res);
		
		int sum = 80;
		String rank = sum >= 90 ? "수": sum >= 80 ? "우": sum >= 70 ? "미": sum >= 60 ? "양" : "가";
		System.out.println(sum + " : " + rank);
		
		
	}
}










