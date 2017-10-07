package com.mychat.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;

import com.mychat.fvk.Fwk;
import com.mychat.main.MainTest;

public class Action implements ActionListener/*, KeyListener*/ {
	private MainTest mt;
	
	public Action(MainTest mt){
		this.mt=mt;
	}
//	@Override
//	public void keyPressed(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
////	}
//	@Override
//	public void keyReleased(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void keyTyped(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton button=(JButton) e.getSource();

		Sorter sort =new Sorter(button.getParent().getParent().getParent().getParent().getParent());
		//Controller contr=getController(button.getActionCommand());
		//contr.keyPressed();
	}
	
}
	