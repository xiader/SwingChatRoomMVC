package com.mychat.controller;

import java.awt.Container;

import com.mychat.client.ChatClient;
import com.mychat.fvk.Fwk;

public class Sorter {
	String name;
	private Container cont;
	private ChatClient chat;
	public Sorter(Container cont){
		this.cont=cont;
		chat=(ChatClient)cont;
		Fwk.getInstance(chat).getEnterButtonController().keyPressed();
	}
	
}
