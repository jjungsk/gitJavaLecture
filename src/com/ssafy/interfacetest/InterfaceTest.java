package com.ssafy.interfacetest;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class InterfaceTest extends Frame implements ActionListener, WindowListener {
//	Frame f = new Frame("HasATEST~~!!!");
	Button color = new Button("Background Color Change");
	Button change = new Button("Button Color Change");
	
	public InterfaceTest() {
		super("Abstract Test");
		setLayout(new FlowLayout());
		color.setBackground(new Color(25,138,59));
		add(color);
		add(change);
		setBackground(Color.black);
		setSize(500, 300);
		setLocation(200, 200);
		setVisible(true);
		
//		ActionListener al = new InterfaceTest(); // 새로운 al 객체를 계속 생성하여.. 감시가 어려움
		color.addActionListener(this); // this -> 현재 내 class를 감시
		change.addActionListener(this);
		this.addWindowListener(this);
	}
		
	
	public static void main(String[] args) {
		new InterfaceTest();
	}
	
	// interface
	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int r = random.nextInt(256);
		int g = random.nextInt(256);
		int b = random.nextInt(256);
		
		Object ob = e.getSource();
		if (ob == color) {
			setBackground(new Color(r,g,b));
		} else if (ob == change) {
			color.setBackground(new Color(r,g,b));
		}
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("아래로 내려감");
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("위로 올라감");
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
