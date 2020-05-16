package _07_binary_converter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JTextField field = new JTextField(20);
	static JLabel label = new JLabel("binary to ASCII");
	static JButton button = new JButton("convert");
	public static void main(String[] args) {
		
		panel.add(field);
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
		
		BinaryConverter con = new BinaryConverter();
		con.Butt();
		
		
		
	}
	 void Butt(){
		button.addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String anything = convert(field.getText());
		label.setText(anything);
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}


	
}
