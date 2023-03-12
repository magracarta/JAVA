package day_04;

public class WhileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;//초기값
		while(a<10) {//조건
			System.out.println("while 실행"+(a));
			a++;//증감
		}
		
		//1부터 100까지 짝수들의 합을 구해라
		a =1;
		int tot = 0;
		//while(a<=100) {
		while(true) {
			a+=a%2;
			if(a>100)break;
			tot+=a;
			System.out.println(a+" : " +tot);
			a+=2;
			
		}
		System.out.println("1->100짝수 합계: "+ tot);
		
		a=1;
		while(a<20) {
			int one = a%10;
			int three = one%3;
			if(one!= 0 && three==0) {
				System.out.println("짝");
			}else {
				System.out.println(a);
			}
			a++;
		}
		
	}

}
