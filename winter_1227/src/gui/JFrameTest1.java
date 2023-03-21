package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest1 {

	public static void main(String[] args) {
		JFrame frame =  new JFrame();
		//사진 넣기
		JLabel lb1 = new JLabel(" ", JLabel.CENTER); //가운데로 수평정렬
		ImageIcon icon = new ImageIcon("imgs/chunsick!.jpg");
		lb1.setIcon(icon);
		frame.add(lb1);
		frame.setTitle("JFrame 연습1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200, 200);
		frame.setSize(500, 300);
		frame.setVisible(true);
	}

}
