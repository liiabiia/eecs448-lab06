import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Random;
import java.lang.System;

public class DiceControl extends JFrame implements ActionListener {
	JPanel content;
	JButton button;
	JLabel label;
	JTextField text;
	JLabel dieDisplay; 
	JFrame popUp;
	public DiceControl(){
		popUp = new JFrame("Dialogue");
		content = new JPanel(new GridLayout(2, 0));
		dieDisplay = new JLabel("You rolled: ");
		label = new JLabel("Input die side number");
		text = new JTextField(3);
		button = new JButton("Roll");
		button.addActionListener(this); //change this to whatever you end up doing for the action
		
		content.add(dieDisplay);
		content.add(text);
		content.add(label);
		
		content.add(button);
		this.getContentPane().add(content);
	}
	public Component getContent(){
		return (content);
	}
	private int diceNumber(int side){
		//do something
		//random seeding http://stackoverflow.com/questions/3535574/getting-current-date-time-for-a-random-number-generators-seed
		//https://docs.oracle.com/javase/7/docs/api/java/util/Random.html
		Random randomGenerator = new Random(System.currentTimeMillis());
		int roll = randomGenerator.nextInt(side);
		//add 1 because mod gives you 0 to side-1
		roll +=1;
		
		
		
		return (roll);
	}
	public void actionPerformed(ActionEvent e){
		//FOUND ON: http://stackoverflow.com/questions/6456219/java-checking-if-parseint-throws-exception
			String input = text.getText();
			boolean parseSuc = true;
			try{
				Integer.parseInt(input);
			} catch(NumberFormatException num){
				parseSuc = false;
			}
			if(parseSuc){
				int numOfSides = Integer.parseInt(input);
				String dieInfo = numOfSides + "-sided die";
				label.setText(dieInfo);
				dieDisplay.setText("You rolled: " + diceNumber(numOfSides));
				System.out.println(dieInfo);
			} else {
				//alert saying that invalid input was given
				JOptionPane.showMessageDialog(popUp, "Error, invalid input");
			}
	}

}
