package com.ssafy.abstracttest;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

import com.ssafy.inheritance.IsATest;

public class ButtonTest extends Frame {
//	Frame f = new Frame("HasATEST~~!!!");
	Button color = new Button("change color@@@");
	Button change = new Button("Button Color change");
	
	public ButtonTest() {
		super("Abstract Test");
//		LayoutManager mgr = new FlowLayout();
//		f.setLayout(mgr);
		setLayout(new FlowLayout());
//		f.setTitle("HasATest!!!!");
//		push.setLabel("Push");
		color.setBackground(new Color(25,138,59));
		add(color);
		add(change);
		setBackground(Color.black);
		setSize(500, 300);
		setLocation(200, 200);
		setVisible(true);
		
		
		// 4. 자신의 생성자로 객체 생성 (dynamic 객체 생성)
		ActionListener al1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Random random = new Random();
				int r = random.nextInt(256);
				int g = random.nextInt(256);
				int b = random.nextInt(256);
				setBackground(new Color(r,g,b));
			}
		};
		
		ActionListener al2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Random random = new Random();
				int r = random.nextInt(256);
				int g = random.nextInt(256);
				int b = random.nextInt(256);
				color.setBackground(new Color(r,g,b));
			}
		};
		
		
//		color.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				Random random = new Random();
//				int r = random.nextInt(256);
//				int g = random.nextInt(256);
//				int b = random.nextInt(256);
//				setBackground(new Color(r,g,b));
//				
//			}
//		});
		color.addActionListener(al1);
		change.addActionListener(al2);
		
//		this.addWindowListener(new WindowListener() {
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				// TODO Auto-generated method stub
//				System.exit(0);
//				
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("X를 눌러서 프로그램 종료");
				System.exit(0);
			}
			
			
		});
	}
	
	public static void main(String[] args) {
		new ButtonTest();
	}

}
