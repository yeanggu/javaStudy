package ch7;

class NoSingleton{
	NoSingleton(){
		System.out.println("NoSingleton 생성자 호출");
	}
}

class Singleton{
	static private Singleton me = new Singleton();
	private Singleton(){
		System.out.println("Singleton 생성자 호출");
	}
	public static Singleton getInstance() {
		return me;
	}
}

class FinalClass{
	final double pi;
	FinalClass(){
		pi = 3.14;
	}
}


public class SingletonTest {

	public static void main(String[] args) {
		NoSingleton n1 = new NoSingleton();
		NoSingleton n2 = new NoSingleton();
		NoSingleton n3 = new NoSingleton();
		//Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		FinalClass fc = new FinalClass();
		System.out.println(fc.pi);
		
		}

}
