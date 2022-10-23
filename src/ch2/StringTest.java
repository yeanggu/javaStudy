package ch2;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "j";
		char c1 = 'j';
		int i1=100;
		
		System.out.println(s1);//String-0개이상 문사열 ""
		System.out.println(c1);//char-1개문자''
		
		System.out.println(s1+c1);
		System.out.println(s1+i1);
		System.out.println(c1+i1);
		//+ - 1. 숫자덧셈 - 정수/실수 + 정수/실수
		//+ - 2. 문자열 결합 - String + 다른타입, 다른타입 + String, String + String
		
		byte b1 = 127; //1byte정수 = 8bit / [부호1bit][값7bit] => -2^7 ~ 2^7-1 => -128~127
		int b2 = 1280000000; //4byte
		
		int i2 = 127;//127(4byte)
		byte b3 = (byte)i2;//127 (1byte)
		        //(타입명)
		
		int i3 = 97; //'a'->97 'A'->65 '0'->48
		System.out.println(i3);
		System.out.println((char)i3);
		//'A'출력
		System.out.println((char)(i3-32));//A
		
		
		
	}

}
