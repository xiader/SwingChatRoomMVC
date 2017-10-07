package com.mychat.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.mychat.client.ChatClient;

public class QuitButtonController implements Controller{
	
	public QuitButtonController(){
	
	}
	
	public void keyPressed() {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
