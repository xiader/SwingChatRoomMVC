package com.mychat.main;

import com.mychat.client.ChatClient;
import com.mychat.controller.EnterButtonController;
import com.mychat.fvk.Fwk;

public class MainTest {

	public static void main(String[] args) {
		
		MainTest mt = new MainTest();
		ChatClient chat=new ChatClient(mt);
		chat.launchFrame();
		
		
		
	}

}
