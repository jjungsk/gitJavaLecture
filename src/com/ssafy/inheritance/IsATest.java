package com.ssafy.inheritance;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class IsATest extends Frame {
//	Frame f = new Frame("HasATEST~~!!!");
	Button push = new Button("PUSH@@@");
	
	public IsATest() {
		super("Is A Test");
//		LayoutManager mgr = new FlowLayout();
//		f.setLayout(mgr);
		setLayout(new FlowLayout());
//		f.setTitle("HasATest!!!!");
//		push.setLabel("Push");
		push.setBackground(new Color(25,138,59));
		add(push);
		setBackground(Color.black);
		setSize(500, 300);
		setLocation(200, 200);
		setVisible(true);
		
		push.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Random random = new Random();
				int r = random.nextInt(256);
				int g = random.nextInt(256);
				int b = random.nextInt(256);
				setBackground(new Color(r,g,b));
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		new IsATest();
	}

}
