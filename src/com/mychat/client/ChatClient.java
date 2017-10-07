package com.mychat.client;
import java.awt.*;
import javax.swing.*;

import com.mychat.controller.EnterButtonController;
import com.mychat.controller.QuitButtonController;
import com.mychat.controller.SendButtonController;
import com.mychat.main.MainTest;
import com.mychat.controller.Action;

public class ChatClient extends JFrame{
public JTextArea outputArea;
public JTextField inputField;

private JButton sendButton;
private JButton quitButton;
private MainTest mt;
public ChatClient(MainTest mt){
	this.mt=mt;
	
}
public void launchFrame(){
	outputArea=new JTextArea(10,50);
	inputField=new JTextField(50);
	//inputField.addKeyListener(new Action(mt));
	inputField.setActionCommand("INPUT_FIELD");
	
	sendButton=new JButton("Send");
	sendButton.addActionListener(new Action(mt));
	sendButton.setActionCommand("SEND");
	
	quitButton=new JButton("Quit");
	quitButton.addActionListener(new Action(mt));
	quitButton.setActionCommand("QUIT");

	
	add(outputArea,BorderLayout.WEST);
	add(inputField, BorderLayout.SOUTH);
	JPanel panel=new JPanel();
	panel.setLayout(new GridLayout(2,1));
	
	panel.add(sendButton);
	panel.add(quitButton);
	add(panel, BorderLayout.CENTER);
	pack();
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	


}
}
