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

//4. 독립된 ActionListener 클래스를 사용하자
public class JFrameTest5 extends JFrame {
	// JPanel 만들기
	ImageIcon icon = new ImageIcon("imgs/yeonJun.jpg");
	JLabel lb1 = new JLabel(icon, JLabel.CENTER);
	JPanel pan = new JPanel();
	// 버튼만들기
	JButton btn1 = new JButton("Ive");
	JButton btn2 = new JButton("Tomorrow by Together");
	JButton btn3 = new JButton("Black Pink");

	public JFrameTest5() {
		
		ButtonListener btnListener = new ButtonListener(btn1, btn2, lb1); //ButtonListener에서 만든 객체를 리스너에게 전달하기 
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
		new JFrameTest5();
	}
}
