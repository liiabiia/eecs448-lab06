import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.lang.System;
public class TemperatureConverterControl extends JFrame implements ActionListener{
	JPanel content;
	JLabel label;
	//button
	JButton ftoc;
	JButton ftok;
	JButton ctok;
	JButton ctof;
	JButton ktof;
	JButton ktoc;
	JTextField text;
	JFrame popUp;
	public TemperatureConverterControl(){
		content = new JPanel(new GridLayout(2, 0));
		popUp = new JFrame("Dialogue");
		text = new JTextField(3);
		ftoc = new JButton("F to C");
		ftok = new JButton("F to K");
		ctok = new JButton("C to K");
		ctof = new JButton("C to F");
		ktof = new JButton("K to F");
		ktoc = new JButton("K to C");
		label = new JLabel("Enter a temperature to convert");
		
		//add action listener
		
		ftoc.addActionListener(this);
		ftok.addActionListener(this);
		ctok.addActionListener(this);
		ctof.addActionListener(this);
		ktof.addActionListener(this);
		ktoc.addActionListener(this);
		
		//content add
		content.add(label);
		content.add(text);
		content.add(ftoc);
		content.add(ftok);
		content.add(ctok);
		content.add(ctof);
		content.add(ktof);
		content.add(ktoc);
		
		
		this.getContentPane().add(content);
		
		
	}
	public Component getContent(){
		return (content);
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
			switch(e.getActionCommand()){
			case "F to C":
				//f to c conversion
				double tempFC = (degrees - 32) * (5.0 / 9.0);
				String newText = "Temperature in C: " + String.format("%.2f",tempFC);
				label.setText(newText);
				System.out.println(newText);
				break;
				
			case "F to K":
				//f to k conversion
				double tempFK = ((degrees - 32) * (5.0 / 9.0)) + 273.15;
				String newText2 = "Temperature in K: " + String.format("%.2f",tempFK);
				label.setText(newText2);
				System.out.println(newText2);
				break;
			case "C to K":
				//c to k conversion
				double tempCK = degrees + 273.15;
				String newText3 = "Temperature in K: " + String.format("%.2f",tempCK);
				label.setText(newText3);
				System.out.println(newText3);
				break;
			case "C to F":
				//c to f conversion
				double tempCF = (degrees * (9.0/5.0))  + 32 ;
				String newText4 = "Temperature in F: " + String.format("%.2f",tempCF);
				label.setText(newText4);
				System.out.println(newText4);
				break;
			case "K to F":
				//k to f conversion
				double tempKF = ((degrees - 273.15) * (9.0/5.0)) + 32 ;
				String newText5 = "Temperature in F: " + String.format("%.2f",tempKF);
				label.setText(newText5);
				System.out.println(newText5);
				break;
			case "K to C":
				//k to c conversion
				double tempKC = degrees - 273.15;
				String newText6 = "Temperature in C: " + String.format("%.2f",tempKC);
				label.setText(newText6);
				System.out.println(newText6);
				break;
			default:
				//display error message
				label.setText("OOPS! Something went wrong...");
				break;
			}
		} else {
			JOptionPane.showMessageDialog(popUp, "Error, invalid input");
		}
		
	}

}
