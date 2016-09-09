import java.util.ArrayList;

public class Easy280 {

	static ArrayList<Integer> binaryCount = new ArrayList<Integer>();
	static int tens = 0;
	static int ones = 0;
	static int last;
	static int current;
	static int answer;

	public static void main(String[] args) {

		binaryCount.add(1);
		binaryCount.add(0);
		binaryCount.add(1);
		binaryCount.add(0);
		binaryCount.add(0);
		binaryCount.add(1);
		binaryCount.add(0);
		binaryCount.add(0);
		binaryCount.add(0);
		binaryCount.add(0);

		answer = binaryFingerCounter(binaryCount);
		if (answer == -1) System.out.println("INVALID");
		else System.out.println(answer);
	}

	public static int binaryFingerCounter(ArrayList<Integer> count) {
		if (count.size() != 10) System.out.println("Invalid entry");

		if (((int) count.get(4)) == 1) tens = 50;
		if (((int) count.get(5)) == 1) ones = 5;
		
		last = count.get(0);
		
		for (int i = 0; i < 10; i++) {
			current = i;
			if (i < 5 && current == 0 && last == 1) return -1;
			if (i >= 5 && current == 1 && last == 0) return -1;
			last = i;
		}
		for (int i = 0; i < 4; i++) {
				if (((int) count.get(i)) == 1) {
					tens += 10;
				}
			
		}
		for (int i = 6; i < 10; i++) {
			if (((int) count.get(i)) == 1) {
				ones += 1;
			}
		}
		return tens + ones;
	}

}
