import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.lang.System;
public class TemperatureConverterControl extends JFrame implements ActionListener{
	JPanel content;
	//button
	JButton ftoc;
	JButton ftok;
	JButton ctok;
	JButton ctof;
	JButton ktof;
	JButton ktoc;
	JTextField text;
	public TemperatureConverterControl(){
		content = new JPanel(new GridLayout(2, 0));
		text = new JTextField(3);
		ftoc = new JButton("F to C");
		ftok = new JButton("F to K");
		ctok = new JButton("C to K");
		ctof = new JButton("C to F");
		ktof = new JButton("K to F");
		ktoc = new JButton("K to C");
		
		//add action listener
		
		ftoc.addActionListener(this);
		ftok.addActionListener(this);
		ctok.addActionListener(this);
		ctof.addActionListener(this);
		ktof.addActionListener(this);
		ktoc.addActionListener(this);
		
		//content add
		
		content.add(text);
		content.add(ftoc);
		content.add(ftok);
		content.add(ctok);
		content.add(ctof);
		content.add(ktof);
		content.add(ktoc);
		
		this.getContentPane().add(content);
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		String input = text.getText();
		boolean parseSuc = true;
		try{
			Double.parseDouble(input);
		} catch(NumberFormatException num){
			parseSuc = false;
		}
		if(parseSuc){
			Double degrees = Double.parseDouble(input);
			//String dieInfo = numOfSides + "-sided die";
			//label.setText(dieInfo);
			//dieDisplay.setText("You rolled: " + diceNumber(numOfSides));
			//System.out.println(dieInfo);
		} else {
			//alert saying that invalid input was given
		}
		
	}

}
