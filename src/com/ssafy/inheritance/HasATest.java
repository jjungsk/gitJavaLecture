package com.ssafy.inheritance;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;


public class HasATest {
	
	Frame f = new Frame("HasATEST~~!!!");
	Button push = new Button("PUSH@@@");
	
	public HasATest() {
//		LayoutManager mgr = new FlowLayout();
//		f.setLayout(mgr);
		f.setLayout(new FlowLayout());
//		f.setTitle("HasATest!!!!");
//		push.setLabel("Push");
		push.setBackground(new Color(25,138,59));
		f.add(push);
		f.setBackground(Color.CYAN);
		f.setSize(500, 300);
		f.setLocation(200, 200);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new HasATest();
	}

}
