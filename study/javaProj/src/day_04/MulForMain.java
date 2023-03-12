package day_04;

public class MulForMain {
	public static void main(String[] args) {
		/*
		for(int h =1; h<=12; h++) {
			System.out.println(h+"시");
			for(int m=0; m<60; m++) {
				System.out.println(h+":"+m);
				
			}
			//System.out.println(h+":"+m);
		}
		*/
		for(int h = 1; h<=9; h++) {
			System.out.println(h+"단");
			for(int c = 1; c <=9; c++) {
				System.out.println(h+"*"+c+"="+h*c);
			}
			
		}
		
		for(int h = 1; h<=9; h++) {
			System.out.print(h+"단\t");
		}
		for(int h = 1; h<=9; h++) {
			System.out.println(" ");
			for(int c = 1; c <=9; c++) {
				
				System.out.print(c+"*"+h+"="+h*c+"\t");
			}
			
		}
		
		
		
		
	}
}
