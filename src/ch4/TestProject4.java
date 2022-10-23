package ch4;

public class TestProject4 {

	public static void main(String[] args) {
		int lines = 10;
		
		for(int i=1;i<=lines;i++) {
			char c = 'a';
			for(int j=1;j<=i;j++){
				System.out.print((char)(c+j-1));
			}
			System.out.println();
		}
		
		
		
/*---------------------다이아몬드--------------------------		
		for(int i=1;i<=5;i++) {
			
			if(i<=3) {
				for(int s=3;s>=i;s--){
				    System.out.print(" ");
				}
				for(int j=1;j<=i*2-1;j++){
					System.out.print("*");
				}
				
			}else{
				for(int s=3;s<=i;s++){
				    System.out.print(" ");
				}
				for(int j=6;j>=i;j--) {
				System.out.print("*");
					if(i==5) {
						break;
					}
				}	
			}
			
			System.out.println();
			
		}
--------------------------트리-------------------------*/		
/*		
		for(int i=1;i<=5;i++) {
			
			for(int s=5;s>=i;s--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
----------------------------------------------------*/		
	}

}
