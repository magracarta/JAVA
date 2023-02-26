package day_02;

public class Exam {
	public static void main(String[] args) {
		/*
		  클래스 이름 exam
		  번호 , 국어, 영어 , 수학 ,총점, 평균을 선언하고 출력하세요,
		  번호 , 국어, 영어 수학 정보 입력후 처리
		 
		 */
		
	  	int no =21,
	  		classNum = 21 , 
	  		korean =78,
			english = 81, 
			math = 92, 
			sum = english+math+korean;
			
		double average = ((double)sum/3);  //정수이기때문에 정수로 만든다 -> 정수가 아닌 수로 만든다.			
		double average2 = (double)(int)(average*100)/100;  
		
	  	System.out.println("번호:"+classNum);
	  	System.out.println("국어:"+korean);
	  	System.out.println("영어:"+english);
	  	System.out.println("수학:"+math);
	  	System.out.println("총점:"+sum);
	  	System.out.println("평균:"+average);
	  	System.out.println("평균2:"+average2);
	  	
	  	
	}
}
