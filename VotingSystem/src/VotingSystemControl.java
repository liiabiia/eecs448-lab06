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

public class VotingSystemControl {
	JPanel content;
	JLabel label;
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
		
	}
	public Component getContent(){
		return (content);
	}

}
