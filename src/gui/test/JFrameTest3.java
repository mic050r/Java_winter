package gui.test;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//JFrame 클래스
import javax.swing.JLabel;
import javax.swing.JPanel;

//2. Inner(내부)클래스로 ActionListener를 구현
public class JFrameTest3 extends JFrame {
	// JPanel 만들기
	ImageIcon icon = new ImageIcon("imgs/yeonJun.jpg");
	JLabel lb1 = new JLabel(icon, JLabel.CENTER);
	JPanel pan = new JPanel();
	// 버튼만들기
	JButton btn1 = new JButton("Ive");
	JButton btn2 = new JButton("Tomorrow by Together");
	JButton btn3 = new JButton("Black Pink");

	public JFrameTest3() {
		
		BtnListener btnListener = new BtnListener(); //내부클래스에서 만든 BtnListener와 연결됨
		btn1.addActionListener(btnListener); // 현재 클래스 값
		btn2.addActionListener(btnListener);
		btn3.addActionListener(btnListener);

		pan.add(btn1);
		pan.add(btn2);
		pan.add(btn3);
		add(pan, "North"); // 꼭 대문자로 스기

		add(lb1, "Center");
		setTitle("JFrame 상속 연습"); // JFrame. 필요없음 -> 상속받았기 때문
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 무조건 있어야함 끝내는것
		setLocation(200, 200); // x, y 좌표 /위치
		setSize(500, 300); // 너비 높이 길이 설정 /크기
		setVisible(true);
	}

	public static void main(String args[]) {
		new JFrameTest3();
	}

	// 내부 클래스, 현재 클래스안에다가 BtnListener를 구현한 것
	public class BtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) { //actionPerformed가 발생할 
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

}
