import java.util.Arrays;

public class Easy254 {

	static String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", 
			"i", "j", "k", "l", "m", "n", "o", "p", "q", 
			"r", "s", "t", "u", "v", "w", "x", "y", "z"};
	static String inputChar, outputChar;
	static int inputCharIndex, outputCharIndex;
	
	public static void main(String[] args) {
		
		StringBuffer input = new StringBuffer("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi");
		StringBuffer output = new StringBuffer();
		
		for (int i = 0; i < input.length(); i++) {
			inputChar = Character.toString(input.charAt(i));
			inputCharIndex = Arrays.asList(alphabet).indexOf(inputChar);
			
			outputCharIndex = 25 - inputCharIndex;
			if (outputCharIndex == 26) outputChar = inputChar;
			else outputChar = alphabet[outputCharIndex];
			
			output.append(outputChar);
		}
		
		System.out.println(output);
		
		
	}
}
