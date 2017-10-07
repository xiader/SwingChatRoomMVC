package com.mychat.fvk;

import java.awt.Container;
import java.util.*;

import com.mychat.client.ChatClient;
import com.mychat.controller.EnterButtonController;
import com.mychat.main.MainTest;

public class Fwk {
    private static Fwk _instance = null;
    private MainTest mt;
    private EnterButtonController ebk = null;
    private ChatClient chat;

    private Fwk(ChatClient chat) {
    	this.chat=chat;
    		ebk=new EnterButtonController(chat);
    	
    	
    	
    	
    }

    public synchronized static Fwk getInstance(ChatClient chat) {
        if (_instance == null)
            _instance = new Fwk(chat);
        return _instance;
    }
    

  
    public synchronized EnterButtonController getEnterButtonController() {
        
        return ebk;
    }
    
}