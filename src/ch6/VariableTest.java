package ch6;

class A{
	int i;
	void m() {
		int j = 20; //m메소드 지역변수
		//인스턴스변수는 초기화하지 않아도 자동으로 초기화됨.
		//인스턴스 변수 -> 참조변수.인스턴스변수명
		//But 지역변수는 꼭 초기화를 해야함
		System.out.println(i+j);
		//for(int k=0;i<10;k++) {
		//	System.out.println(k);
		//}
	}
	void m2() {
		System.out.println(i);
	}
}


public class VariableTest {

	public static void main(String[] args) {
		A a1 = new A();
		a1.m2();
		a1.m();
		
	}

}
