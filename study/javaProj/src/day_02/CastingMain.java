package day_02;

public class CastingMain {
	public static void main(String[] args) {
		byte bo = 100;
		short sh = bo;//작은 형변환, 묵시적 형변환 , up casting 
		
		System.out.println(bo + "," + sh);
		
		sh = 123;
		bo = (byte)sh; //강제 형변환, 명시적 형변환 , down casting
		System.out.println(bo + "," + sh);
		
		
		double dd  = bo;
		System.out.println(bo + "," + dd);
		dd = 97;
		bo = (byte)dd;
		System.out.println(bo +","+ dd);
		
		
		dd = 52.456;
		bo = (byte)dd; //byte로 넘어가면 뒤에 소수점이 사라진다.
		System.out.println(bo +","+ dd);
		
		char ch = 'a';
		bo = (byte)ch;
		System.out.println(bo +","+ ch); //문자를 숫자로 바뀌
		
		bo = 102;
		ch = (char)bo;
		System.out.println(bo +","+ ch); //숫자를 문자로
		
		
		boolean bb =true;
		//bo = (byte)bb;
		bo = 0;
		//bb = bo;
		
		String ttt = "100";
		//bo = (byte)ttt;
		ttt = "false";
		//bb = (boolean)ttt;
		
		bo = 38;
		//ttt = (String)bo;
		ttt = ""+bo;
		System.out.println(ttt +","+ bo);
		dd = 135.789;
		ttt = "" + dd;
		System.out.println(ttt +","+ dd);
		bb = true;
		ttt = "" + bb;
		System.out.println(ttt +","+ bb);
		
		
		sh = 128;
		bo = (byte)sh;
		System.out.println(bo +","+ sh);
		

		sh = 129;
		bo = (byte)sh;
		System.out.println(bo +","+ sh);
		sh = 130;
		bo = (byte)sh;
		System.out.println(bo +","+ sh);
		sh = 255;
		bo = (byte)sh;
		System.out.println(bo +","+ sh);
		sh = 257;
		bo = (byte)sh;
		System.out.println(bo +","+ sh);
		
		
		/*
		 byte 				 short
		 0000 0000   0      0  0000 0000 0000 0000
		 0000 0001   1      1  0000 0000 0000 0001
         0000 0010   2	    2  0000 0000 0000 0010 
         ....
         0111 1110  126    126 0000 0000 0111 1110
         0111 1111  127    127 0000 0000 0111 1111
         1000 0000  -128   128 0000 0000 1000 0000
         0000 0001  -127   129 0000 0000 1000 0001	
         0000 0010  -126   130 0000 0000 1000 0010
         ...	 	 
         1111 1110  -2   254 0000 0000 1111 1110
         1111 1111  -1   255 0000 0000 1111 1111
1        0000 0000  0    256 0000 0001 0000 0000
1        0000 0001  1    257 0000 0001 0000 0001
		 */
		
		//왠만하면 위의 상황이 나오지 않게 하는것이 좋다.
		
	}
}















