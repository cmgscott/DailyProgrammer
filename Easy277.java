
public class Easy277 {
	
	public static void main (String[] args) {
		
		int numerator = 4096;
		int denominator = 1024;
		
		for (int i = 2; i <= (denominator / 2) + 1; i++) {
			if (numerator % i == 0 && denominator % i == 0) {
				numerator = numerator / i;
				denominator = denominator / i;
				i = 1;
			}
		}
		System.out.println(String.format("%d/%d", numerator, denominator));
		
	}

}
