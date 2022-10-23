package ch6;

class Sample{
	void m1() {
		System.out.println("m1");
	}
	int m2() {
		return 10*10;
	}
	double m3() {
		double pi = 3.14;
		return pi;
	}
	int[] m4() {
		int[] i = {1,2,3,4,5};
		return i;
	}
	String m5() {
		return "java";
	}
	Employee m6(){
		Employee e1 = new Employee();
		return e1;
	}
	Person m7(){
		Person p1 = new Person();
		p1.name = "박정보";
		if(p1.name.contentEquals("박정보")) {
			//return p1;
		}
		else {
			p1= new Person();
			p1.name = "박정보";
			//return p2;
		}
		return p1;	
			
	}
	void m8() {
		System.out.println("m8 시작");
		if(1>0) {
			return;
		}
		System.out.println("m8 종료");
		
	}
}

public class ReturnTest {

	public static void main(String[] args) {
		Sample s = new Sample();
		Employee r6 = s.m6();
		System.out.println(r6);
		r6.name = "xxx";
		
		
		String r5 = s.m5();
		int[] r4 = s.m4();
		double r3 = s.m3();
		int r2 = s.m2();
		s.m1();
		s.m8();
		System.out.println("main종료");
	}

}
