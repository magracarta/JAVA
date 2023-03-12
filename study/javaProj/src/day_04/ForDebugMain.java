package day_04;

public class ForDebugMain {
	public static void main(String[] args) {
		int tot = 0; 							//---1
		System.out.println("for 문 이전");		//---2
		
		for(int i=0; i<30; i+=10) {
			//i = 0 (초기값은 최초 1회 실행)   ---3
			//       i(10)<30 			  ---4
			//             i+=10(10)  	  ---8
			
			//	       i(30)<30 			  ---19 for 문 탈출 i소멸
			int a =4; 					// ---5,10,15
			//for 문 내부에서의 변수선언은 for문이 돌때마다 선언, 소멸을 반복함.
			System.out.println(i+a);
			//				0+4            ----6
			//				10+4            ----11
			// a 소멸						---7
			
		}
		System.out.println("for 문 종료");//  ---20
		
		
		
		
	}
}
