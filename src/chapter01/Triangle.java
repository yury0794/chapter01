package chapter01;

public class Triangle {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++){			
			for(int j=1;j<=i;j++){
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		for(int l=6;l>=1;l--){			
			for(int n=1;n<=l;n++){
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}