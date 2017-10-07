package com.mychat.controller;



import com.mychat.client.ChatClient;
import com.mychat.main.MainTest;

public class EnterButtonController implements Controller {
private ChatClient chat;

public EnterButtonController(ChatClient chat2){
	this.chat=chat2;
	
}

	public void keyPressed() {
		chat.outputArea.append(chat.inputField.getText());
		chat.inputField.setText("");
		}
	}

