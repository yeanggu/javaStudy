package ch4;

public class GugudanTest {

	public static void main(String[] args) {
		/*int total = 0;
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				total = i*j;
				System.out.println(i+"*"+j+"="+total);
			}	
		}*/
		
		int total = 0;
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				if(j==5) {
					//System.out.print("->");
					//5단만 출력 생략 = j가 5인경우 반복 수행 무시
					//continue;
					//break;
				}	
				total = i*j;
				System.out.print(j+"*"+i+"="+total+"\t");

			}
				System.out.print("\n");
					
		}
		
		
		
		
		
	}

}
