import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Easy254 {

	static String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", 
			"i", "j", "k", "l", "m", "n", "o", "p", "q", 
			"r", "s", "t", "u", "v", "w", "x", "y", "z"};
	static String inputChar, outputChar;
	static int inputCharIndex, outputCharIndex;
	static JFrame frame;
	static String getInput;
	static JTextField txtEncodeBox;
	static JLabel lblOutput;
	static JTextField txtOutput;

	public static void main(String[] args) {

		// Initialization window

		frame = new JFrame("Atbash Cipher En/Decoder");
		frame.setBounds(100, 100, 500, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtEncodeBox = new JTextField();
		txtEncodeBox.setBounds(15, 50, 400, 30);
		frame.getContentPane().add(txtEncodeBox);
		txtEncodeBox.setColumns(10);

		JLabel lblEncodeBox = new JLabel("Phrase to be Translated to/from Atbash: ");
		lblEncodeBox.setBounds(15, 20, 250, 30);
		frame.getContentPane().add(lblEncodeBox);
		
		JButton btnEncode = new JButton("Encode/Decode");
		btnEncode.setBounds(15, 90, 200, 30);
		frame.getContentPane().add(btnEncode);
		
		lblOutput = new JLabel("Phrase encoded/decoded: ");
		lblOutput.setBounds(15, 130, 200, 30);
		frame.getContentPane().add(lblOutput);
		
		txtOutput = new JTextField();
		txtOutput.setBounds(15, 160, 400, 30);
		frame.getContentPane().add(txtOutput);
		
		// mouseClick MouseListener
		
		btnEncode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (txtEncodeBox.getText() != null) {
					txtOutput.setText(encodeDecode(txtEncodeBox.getText()).toString());
				} else {
					JOptionPane.showMessageDialog(null, "Please enter a phrase");
				}
			}
		});
		

		frame.setVisible(true);

		

		//System.out.println(output);
		//"gsrh rh zm vcznkov lu gsv zgyzhs xrksvi"


	}
	
	public static StringBuffer encodeDecode(String input) {
		StringBuffer inputSB = new StringBuffer(input);
		StringBuffer output = new StringBuffer();

		for (int i = 0; i < input.length(); i++) {
			inputChar = Character.toString(input.charAt(i));
			inputCharIndex = Arrays.asList(alphabet).indexOf(inputChar);

			outputCharIndex = 25 - inputCharIndex;
			if (outputCharIndex == 26) outputChar = inputChar;
			else outputChar = alphabet[outputCharIndex];

			output.append(outputChar);
		}
		return output;
	}
}
