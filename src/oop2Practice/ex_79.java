package oop2Practice;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ex_79 {
	// 클래스를 익명클래스로 전환
	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new evenHandler() {
			public void windowClosing(WindowEvent e) {
				System.out.println("aaa");
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
		

	}
}
class evenHandler extends WindowAdapter{
	
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}