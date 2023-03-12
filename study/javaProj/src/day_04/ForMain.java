package day_04;

public class ForMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//      초기값  조건	   증감
		for(int i =0; i <= 10; i++) {
			System.out.println("for 이지롱"+i);
		}
		System.out.println("for 종룔 1-------");
		
		
		int tot = 0;
		for(int a = 10; a <= 100; a+=5) {
			tot += a;
			System.out.println(a+" : " +tot);
		}
		System.out.println("for 종룔 2-------");
		
		//1 => 100 짝수들의 합
		int total = 0;
		for(int i=1; i <=100; i+=2 ) {
			i += i%2;
			total += i;
			System.out.println(i+" : " +total);
		}
		System.out.println(total);
		
		
	}

}
