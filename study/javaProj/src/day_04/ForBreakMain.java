package day_04;

public class ForBreakMain {
	public static void main(String[] args) {
		BIG:for(int b =100; b<500; b+=100) {
			System.out.println("b 시작: " +b);
			SMALL:for(int s =1; s<5; s++) {
				System.out.println("\ts 시작: " +(b+s));
				/*if(s==3) {
					break;//작은 for 문 탈출
				}*/
				if(b==200) {
					break BIG;//레이블을 작성하면 큰 for문 전체 탈출가능
				}
				
				
				
				System.out.println("\ts 끝: " +(b+s));
			}
			/*if(b==200) {
				break;//작은 for 문 탈출
			}*/
			System.out.println("b 끝: " +b);
		}
		System.out.println("이중 For문 종료---------- ");
		
	}
}
