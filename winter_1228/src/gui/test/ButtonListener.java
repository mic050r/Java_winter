package gui.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ButtonListener implements ActionListener {

	JButton btn1, btn2;
	JLabel lb1;
	
	public ButtonListener(JButton btn1, JButton btn2, JLabel lb1) {
		super();
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.lb1 = lb1;
	}
	//콜바이 래퍼런스
	@Override
	public void actionPerformed(ActionEvent e) {
		ImageIcon icon = null; //지역변수 선언
		JButton btnSource = (JButton) e.getSource(); // JButton으로 형변환하기
		// 위랑 똑같은 내용 Object btnSource = e.getSource();
		if (btnSource == btn1) {
			icon = new ImageIcon("imgs/ive.jpg");
		} else if (btnSource == btn2) {
			icon = new ImageIcon("imgs/TXT.jpg");
		} else {
			icon = new ImageIcon("imgs/bp.jpg");
		}
		lb1.setIcon(icon);	

	}

}
