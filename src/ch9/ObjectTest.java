package ch9;

public class ObjectTest {

	public static void main(String[] args) {
		MyObject o1 = new MyObject(100, "java");
		MyObject o2 = new MyObject(100, "java");
		
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		//패키지명.클래스명@16진수(hashcode주소값-객체구분식별자)
		//java.lang.Object@15db974
		System.out.println(o1/*.toString*/);//200-java형태 출력하도록 수정 - 메소드 오버라이딩
		System.out.println(o2);
		
		//equals 객체 동등성 비교
		// ==연산자 : 기본형 , 참조형 동등성 비교
		if(o1 == o2) {//주소비교, 연산자 오버라이딩 불가
			System.out.println("o1 == o2 true");
		}
		//if(o1.equals(o2)) {//주소비교, 메소드 오버라이딩 가능, 수정
		if(o1.equals(o2)) {//객체가 MyObject 타입, code, msg 변수값 동일하면 true
			System.out.println("o1.equals(o2) true");
		}
		
	}

}

class MyObject /*extends Object*/{
	int code;
	String msg;
	MyObject(int code, String msg){
		this.code = code;
		this.msg = msg;
	}
	@Override
	public int hashCode() {
		return code;
	}
	@Override
	public String toString() {
		System.out.println(getClass().getName());//Class c = getClass(); c.getName()
		return hashCode()+"";
	}
	@Override
	public boolean equals(Object obj) {
		//객체가 MyObject 타입, code, msg 변수값 동일하면 true
		if(obj instanceof MyObject) {
			if(this.code == ((MyObject)obj).code && this.msg.equals(((MyObject)obj).msg)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	

	
}
