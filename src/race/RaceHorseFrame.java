package race;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RaceHorseFrame extends JFrame {
	JLabel[] horses = new JLabel[5];
	HorseThread[] hts = new HorseThread[horses.length];
	int winnerIndex[] = new int[horses.length];
	int index;
	String comboStr[] = { "1번: Jerry", "2번: Turtle", "3번: Deer ", "4번: Wolf", "5번: Yellow bird" };
	JComboBox<String> combo = new JComboBox<String>(comboStr);
	int betingIndex;

	public RaceHorseFrame() {
		JPanel pan = new JPanel(null);
		ImageIcon icon = null;
		JLabel lineLbl = new JLabel(new ImageIcon("imgs/line.png"));
		lineLbl.setBounds(540, 10, 5, 500);
		JLabel flagLbl = new JLabel(new ImageIcon("imgs/flag.png"));
		flagLbl.setBounds(540, 5, 20, 27);
		pan.add(lineLbl);
		pan.add(flagLbl);

		JPanel panN = new JPanel();

		JButton btnBeting = new JButton("게임배팅");
		JButton btnStart = new JButton("게임시작");
		btnBeting.addActionListener(btnL);
		btnStart.addActionListener(btnL);
		panN.add(combo);
		panN.add(btnBeting);
		panN.add(btnStart);

		for (int i = 0; i < horses.length; i++) {
			icon = new ImageIcon("imgs/horse" + (i + 1) + ".gif");
			horses[i] = new JLabel(icon);
			horses[i].setLocation(0, 50 + i * 85);
			horses[i].setSize(60, 40);
			pan.add(horses[i]);
		}

		add(pan, "Center");
		add(panN, "North");
		setTitle("경주마 게임");
		setBounds(400, 100, 610, 520); // x, y, width, height
		setVisible(true);
		setResizable(false);

		/*
		 * for (int i = 0; i < horses.length; i++) { hts[i] = new HorseThread(horses[i],
		 * "stop_horse" + (i + 1), i); hts[i].start(); }
		 */

	}

	public static void main(String[] args) {
		new RaceHorseFrame();

	}

	ActionListener btnL = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "게임배팅": // 게임베팅을 클릭했을 시
				betingIndex = combo.getSelectedIndex();
				break;
			case "게임시작": // 게임시작을 클릭했을 시
				for (int i = 0; i < horses.length; i++) {
					HorseThread t = new HorseThread(horses[i], "stop_horse" + (i + 1), i);
					t.start();
				}
				break;
			}

		}
	};

	public class HorseThread extends Thread {
		JLabel lblHorse;
		String stopImageName;
		int randomValue;
		int horseIndex;

		public HorseThread(JLabel lblHorse, String stopImageName, int horseIndex) {
			this.lblHorse = lblHorse;
			this.stopImageName = stopImageName;
			this.horseIndex = horseIndex;
		}

		@Override
		public void run() {
			while (true) {
				lblHorse.setLocation(lblHorse.getX() + 5, lblHorse.getY());
				if (lblHorse.getX() == 540) {
					lblHorse.setIcon(new ImageIcon("imgs/" + stopImageName + ".png"));
					winnerIndex[index++] = horseIndex; //제일 먼저 도착한 말이 index[0]에 들어감 -> 우승한 말의 값은 index[0]에 들어가 있음
					if (index == horses.length - 1) { //말 5마리 -> 0 1 2 3 4 
						JOptionPane.showMessageDialog(RaceHorseFrame.this, (winnerIndex[0] + 1) + "번째 말이 우승!!!");
						if (winnerIndex[0] == betingIndex) // 이긴말과 내가 고른 말이 번호가 같다면 배팅 성공
							JOptionPane.showMessageDialog(RaceHorseFrame.this, "축하합니다. 배팅에 성공하였습니다.");
						else
							JOptionPane.showMessageDialog(RaceHorseFrame.this, "다음에 다시 배팅 부탁드려요~. 배팅에 실패하였습니다.");
						index = 0; //게임 초기화 시키는 부분
						for (int i = 0; i < horses.length; i++) {
							horses[i].setLocation(0, horses[i].getY());
							horses[i].setIcon(new ImageIcon("imgs/horse" + (i + 1) + ".gif"));
						}

					}
					break;
				}
				try {
					Random random = new Random();
					randomValue = random.nextInt(10); //0~9 사이의 값
					sleep(10 * randomValue);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}