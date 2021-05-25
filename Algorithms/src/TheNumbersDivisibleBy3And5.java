
public class TheNumbersDivisibleBy3And5 {
		
	public static void main(String[] args) {
		
		int num = 100;
		System.out.println("100 divides by 3");
		for(int i = 1;i<num; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("100 divides by 5");
		for(int a = 1; a< num; a++) {
			if(a % 5 == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
		System.out.println("100 divides by 5 and 3");
		for(int b = 1; b < 100 ; b++) {
			if(b % 3 == 0 && b % 5 == 0) {
				System.out.print(b + " ");
			}
		}
		
	}
}
