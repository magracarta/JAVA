package day_04;

public class ForStarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int line = 0; line<5; line++) {
			for(int star = 4; star >=line; star--) {
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for(int line = 0; line<5; line++) {
			
			for(int star = 5; star >=0; star--) {
				if(line < star) {
					System.out.print("&");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
