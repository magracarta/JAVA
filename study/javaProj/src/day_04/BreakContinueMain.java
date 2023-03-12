package day_04;

public class BreakContinueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0; i<5; i++) {
			System.out.println("break 시작: "+i);
			if(i == 2) {
				break;
			}
			System.out.println("break 끝: "+i);
		}
		
		System.out.println("break 종료---------- ");
		
		for(int i =0; i<5; i++) {
			System.out.println("continue 시작: "+i);
			if(i == 2) {
				continue;
			}
			System.out.println("continue 끝: "+i);
		}
		
		System.out.println("continue 종료---------- ");
		
		for(int i =0; i<5; i++) {
			System.out.println("if 시작: "+i);
			if(i != 2) {
				System.out.println("if 끝: "+i);
			}	
		}
		System.out.println("if 종료---------- ");
		
		
	}

}
