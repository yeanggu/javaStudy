package ch14;
/*
interface MyFunction{
	//public abstract int max(int a, int b);
}
class MyFunctionChild implements MyFunction{
	public int max(int a, int b) {
		return a>b?a:b;
	}
}

public class AnonymousTest {

	public static void main(String[] args) {
		MyFunction c = new MyFunctionChild();
		int bigger = c.max(3, 5);
		System.out.println(bigger);
		
	}

}
*/
/*
interface MyFunction{
	int max(int a, int b);
}

public class AnonymousTest {

	public static void main(String[] args) {
		MyFunction c = new MyFunction() {
			public int max(int a, int b) {
				return a>b?a:b;
			}
		};	
		
		int bigger = c.max(10, 5);
		System.out.println(bigger);
		
	}
}
*/


interface MyFunction{
	int max(int a, int b);//1개만 메소드
}

interface MyFunction2{
	int mul(int a);
}

interface MyFunction3{
	String add(String s, int i);
}

public class AnonymousTest {
	public static void main(String[] args) {
		//MyFunction c = (int a, int b) -> a>b?a:b;//람다식
		
		MyFunction c = (int a, int b) -> {System.out.println("{}생략불가"); return a>b?a:b;};
		int bigger = c.max(10, 5);
		System.out.println(bigger);	
		
		MyFunction2 c2 = (int a) -> {return a*a;};
		System.out.println(c2.mul(10));
		MyFunction3 c3 = (s,i) -> s+i;
		System.out.println(c3.add("java", 100));
	}
}