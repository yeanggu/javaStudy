package ch6;

class Math{
	
	int factorial(int su){
		int re = 1;
		/*if(su==1) {
			re = 1; //1!=1 2!=2*1 3!=3*2 ....
		}
		else {
			re = su * factorial(su-1);
		}*/
		for(int i=su;i>=1;i--) {
			re = re*i;
		}
		
		return re;
	}
}


public class FactorialTest {

	public static void main(String[] args) {
		Math m = new Math();
		int result = m.factorial(5);
		System.out.println("5!="+result);

	}

}
