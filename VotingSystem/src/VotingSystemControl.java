import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.lang.System;

public class VotingSystemControl extends JFrame implements ActionListener {
	JPanel content;
	JLabel label;
	JLabel label1;
	JLabel label2;
	JFrame popUp;
	//first name
	JTextField first;
	//last name
	JTextField last;
	//buttons
	
	//candidate 1
	JButton candidate1;
	//candidate 2
	JButton candidate2;
	//candidate 3
	JButton candidate3;
	//candidate 4
	JButton candidate4;
	FileReader myFr;
	BufferedReader myBr;
	BufferedWriter myBw;
	FileReader in;
	FileWriter out;
	public VotingSystemControl(){
		content = new JPanel(new GridLayout(0, 2));
		popUp = new JFrame("Dialogue");
		first = new JTextField(3);
		last = new JTextField(3);
		candidate1 = new JButton("Blossom");
		candidate2 = new JButton("Bubbles");
		candidate3 = new JButton("Buttercup");
		candidate4 = new JButton("Mojo Jojo");
		label1 = new JLabel("First name: ");
		label2 = new JLabel("Last name: ");
		label = new JLabel("Choose from the above candidates");
		
		candidate1.addActionListener(this);
		candidate2.addActionListener(this);
		candidate3.addActionListener(this);
		candidate4.addActionListener(this);
		
		content.add(label1);
		content.add(first);
		content.add(label2);
		content.add(last);
		content.add(candidate1);
		content.add(candidate2);
		content.add(candidate3);
		content.add(candidate4);
		content.add(label);
		
		this.getContentPane().add(content);
		
		
		
	}
	public Component getContent(){
		return (content);
	}
	public void actionPerformed(ActionEvent e){
		//concatenate string
		String fname = first.getText();
		String lname = last.getText();
		String check = lname + "_" + fname + "_ballot.txt";
		boolean exists = false;
		boolean vote = false;
		try{
			myFr = new FileReader(check);
			myBr = new BufferedReader(myFr);
			exists = true;
			
		} catch (Exception oops){
			if(!(fname.equals("")) &&!(lname.equals(""))){
				vote = true;
			}
		}
		if(vote){
			//write which candidate
			try{
				out = new FileWriter(check);
				myBw = new BufferedWriter(out);
			} catch (Exception uhoh){
				System.out.println("Error: " + uhoh.getMessage());
			}
			switch (e.getActionCommand()){
			case "Blossom":
				try{
					myBw.write(fname + " " + lname + " voted for Blossom.");
					myBw.close();
				}catch (Exception e1){
					System.out.println("Error: " + e1.getMessage());
				}
				label.setText("Thanks for voting for Blossom.");
				break;
			case "Bubbles":
				try{
					myBw.write(fname + " " + lname + " voted for Bubbles.");
					myBw.close();
				}catch (Exception e1){
					System.out.println("Error: " + e1.getMessage());
				}
				label.setText("Thanks for voting for Bubbles.");
				break;
			case "Buttercup":
				try{
					myBw.write(fname + " " + lname + " voted for Buttercup.");
					myBw.close();
				}catch (Exception e1){
					System.out.println("Error: " + e1.getMessage());
				}
				label.setText("Thanks for voting for Buttercup.");
				break;
			case "Mojo Jojo":
				try{
					myBw.write(fname + " " + lname + " voted for Mojo Jojo.");
					myBw.close();
				}catch (Exception e1){
					System.out.println("Error: " + e1.getMessage());
				}
				label.setText("Thanks for voting for Mojo Jojo.");
				break;
			default:
				label.setText("OOPS! Something went wrong...");
				break;
				
				
			}
			
		}else if (exists){
				JOptionPane.showMessageDialog(popUp, "According to our records, you already voted! You can only vote once...");
		} else {
			JOptionPane.showMessageDialog(popUp, "Please enter a first name and last name to vote.");
		}
		
	}

}
