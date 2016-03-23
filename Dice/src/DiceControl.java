import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;

public class DiceControl extends JFrame implements ActionListener {
	JPanel content;
	JButton button;
	JLabel label;
	JTextField text;
	public DiceControl(){
		content = new JPanel();
		button = new JButton("Roll die");
		label = new JLabel(diceNumber());
		text = new JTextField(20);
		button.addActionListener(this);
		content.add(button);
		content.add(label);
		content.add(text);
		
	}
	public Component getContent(){
		return (content);
	}
	private String diceNumber(){
		//do something
		return ("");
	}
	public void actionPerformed(ActionEvent e){
		
	}

}
