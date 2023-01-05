package poo.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import poo.controller.GameController;
import poo.game.Diamond;
import poo.game.Hail;

public class GameView extends JFrame {
	// 20개의 똥 객체 참조값이 저장되는 배열
	Hail hails[] = new Hail[20];
	JLabel lblHails[] = new JLabel[hails.length];
	// 10개의 다이아몬드 객체 참조값이 저장되는 배열
	Diamond[] diamonds = new Diamond[5]; // hails.length / 2 => 10
	JLabel[] lblDiamonds = new JLabel[diamonds.length];
	// 캐릭터 생성
	JLabel charLbl = new JLabel(new ImageIcon("imgs/picapica2.gif"));
	private Image background=new ImageIcon(GameController.class.getResource("../imgs/background.jpg")).getImage();//배경이미지

	public GameView() {
		setLayout(null);
		getContentPane().setBackground(Color.WHITE); // 배경색을 흰색으로 설정
		Random random = new Random();
		HailThread hThread = null;
		DiamondThread dThread = null;

		// 20개의 무박 객체를 생성해서 배열에 저장
		for (int i = 0; i < hails.length; i++) {
			hails[i] = new Hail();
			hails[i].setX(i * 60); // X좌표 설정
			hails[i].setY(i * random.nextInt(50)); // Y좌표 설정
			hails[i].setW(40); // 너비 설정
			hails[i].setH(62); // 높이 설정
			hails[i].setImgName("imgs/poo2.gif");
			hails[i].setPoint(10);
			// 배열에 이미지 추가
			lblHails[i] = new JLabel(new ImageIcon(hails[i].getImgName())); 
			lblHails[i].setBounds(hails[i].getX(), hails[i].getY(), hails[i].getW(), hails[i].getH());//setBounds로 아까 설정한 값을 위치
			add(lblHails[i]);
			hThread = new HailThread(lblHails[i], hails[i]);
			hThread.start();
		}

		// 10개의 다이아몬드 객체를 생성해서 배열에 저장

		for (int i = 0; i < diamonds.length; i++) {
			diamonds[i] = new Diamond();
			diamonds[i].setX(i * 60 + random.nextInt(500)); // X좌표 설정
			diamonds[i].setY(i * random.nextInt(30));// Y좌표 설정
			diamonds[i].setW(16); // 너비 설정
			diamonds[i].setH(40); // 높이 설정
			diamonds[i].setImgName("imgs/ketchup2.png"); // 피카츄는 케찹을 좋아해서 이미지를 케찹으로 바꿈
			diamonds[i].setPoint(20);
			//배열에 이미지 추가
			lblDiamonds[i] = new JLabel(new ImageIcon(diamonds[i].getImgName()));
			lblDiamonds[i].setBounds(diamonds[i].getX(), diamonds[i].getY(), diamonds[i].getW(), diamonds[i].getH());
			add(lblDiamonds[i]);
			dThread = new DiamondThread(lblDiamonds[i], diamonds[i]);
			dThread.start();
		}

		charLbl.setBounds(470, 500, 60, 48);
		add(charLbl);
		addKeyListener(keyL);

		setTitle("똥 한 번 피해봐");
		setBounds(0, 0, 1200, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// pan.setBackground(Color.));
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null); // 윈도우 창을 화면의 가운데에 띄우는 역할
	}

	KeyAdapter keyL = new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				charLbl.setLocation(charLbl.getX(), charLbl.getY() - 10);
				break;
			case KeyEvent.VK_DOWN:
				charLbl.setLocation(charLbl.getX(), charLbl.getY() + 10);
				break;
			case KeyEvent.VK_LEFT:
				charLbl.setLocation(charLbl.getX() - 10, charLbl.getY());
				break;
			case KeyEvent.VK_RIGHT:
				charLbl.setLocation(charLbl.getX() + 10, charLbl.getY());
				break;
			}
		}
	};

	public class HailThread extends Thread {
		JLabel hailLbl;
		Hail hail;

		public HailThread(JLabel hailLbl, Hail hail) {
			this.hailLbl = hailLbl;
			this.hail = hail;
		}

		@Override
		public void run() {
			while (true) {
				Random random = new Random();
				if (hailLbl.getY() <= 600)
					hailLbl.setLocation(hailLbl.getX(), hailLbl.getY() + 10);
				else {
					hailLbl.setLocation(hailLbl.getX(), random.nextInt(70));
				}

				try {
					sleep(20 * random.nextInt(50));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public class DiamondThread extends Thread {
		JLabel diamondLbl;
		Diamond diamond;

		public DiamondThread(JLabel diamondLbl, Diamond diamond) {
			this.diamondLbl = diamondLbl;
			this.diamond = diamond;
		}

		@Override
		public void run() {
			while (true) {
				Random random = new Random();
				if (diamondLbl.getY() <= 600)
					diamondLbl.setLocation(diamondLbl.getX(), diamondLbl.getY() + 15);
				else {
					diamondLbl.setLocation(diamondLbl.getX(), random.nextInt(30));
				}

				try {
					sleep(10 * random.nextInt(40));
				} catch (InterruptedException e) {

				}
			}

		}
	}
	
	public void paint(Graphics g) {//그리는 함수
		g.drawImage(background, 0, 0, null);//background를 그려줌
}

}