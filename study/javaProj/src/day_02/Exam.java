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
	  		korean =100,
			english = 100, 
			math = 100, 
			sum = english+math+korean;
			
		double average = ((double)sum/3);  //정수이기때문에 정수로 만든다 -> 정수가 아닌 수로 만든다.			
		double average2 = (double)(int)(average*100)/100;
		
		String grade = average >=90? "수":
					   average >=80? "우":
					   average >=70? "미":
					   average >=60? "양":"가";
	    int ss =(int)average/10;		
	    System.out.println(ss);
	    
	    String grade3;
	    switch((int)average/10) {
	    case 9,10:
	    	grade3="수";
	    	break;
	    case 8:
	    	grade3="우";
	    	break;
	    case 7:
	    	grade3="미";
	    	break;
	    case 6:
	    	grade3="양";
	    	break;
	    default : 
	    	grade3="가";
	    	break;
	    }
	    
	  	System.out.println("번호:"+classNum);
	  	System.out.println("국어:"+korean);
	  	System.out.println("영어:"+english);
	  	System.out.println("수학:"+math);
	  	System.out.println("총점:"+sum);
	  	System.out.println("평균:"+average);
	  	System.out.println("평균2:"+average2);
	  	System.out.println("등급:"+grade);
	  	
	  	
	  	String grade2; 
	  	if(average >= 90){
	  		grade2 = "수";
	  	} else if(average >= 80) {
	  		grade2 = "우";
	  		if( korean >= 80 && english>=80 && math >=80){
	  			grade2 += "(균등)";	
	  		}
	  	} else if(average >= 70) {
	  		grade2 = "미";
	  	} else if(average >= 60) {
	  		grade2 = "양";
	  	}else {
	  		grade2 = "가";
	  	}
	  	
	  	System.out.println("등급:"+grade2);
	  	System.out.println(grade3);
	  	
	}
}
