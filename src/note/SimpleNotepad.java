package note;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class SimpleNotepad extends JFrame implements ActionListener {
	JMenuItem itemNew, itemOpen, itemSave, itemExit, itemFont, item10, item15, item20, itemFont1, itemFont2, itemFont3,
			itemFontRed, itemFontBlue, itemFontBlack;
	JTextArea area = new JTextArea(); // 여러줄 입력 가능
	JButton btnNew, btnOpen, btnSave;

	public SimpleNotepad() {
		super("Simple Notepad");
		makeMenu();
		makeToolbar();
		add(area);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 200, 800, 600);
		setVisible(true);
	}

	public void makeToolbar() {
		JToolBar toolBar = new JToolBar();
		btnNew = new JButton(new ImageIcon("imgs/creat.png"));
		btnOpen = new JButton(new ImageIcon("imgs/open.png"));
		btnSave = new JButton(new ImageIcon("imgs/save.png"));
		btnNew.addActionListener(btnL);
		btnOpen.addActionListener(btnL);
		btnSave.addActionListener(btnL);
		toolBar.add(btnNew);
		toolBar.add(btnOpen);
		toolBar.add(btnSave);
		add(toolBar, "North");
	}

	ActionListener btnL = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object eBtn = e.getSource();
			if (eBtn == btnNew) {
				area.setText("");
			} else if (eBtn == btnOpen) {
				readFile();
			} else if (eBtn == btnSave) {
				writeFile();
			}
		}
	};

	public void makeMenu() {
		JMenuBar menuBar = new JMenuBar(); // 메뉴 표시줄
		JMenu menuFile = new JMenu("File"); // 상위메뉴
		JMenu menuFormat = new JMenu("Format"); //
		JMenu menuFontColor = new JMenu("FontColor"); //
		JMenu menuFontsize = new JMenu("FontSize"); //
		JMenu menuFont = new JMenu("Font"); //
		// JMenuItem : 상위메뉴 또는 하위메뉴를 클릭했을 때 선택할 수 있는 항목
		itemNew = new JMenuItem("New");
		itemOpen = new JMenuItem("Open");
		itemSave = new JMenuItem("Save");
		itemExit = new JMenuItem("Exit");
		itemFont1 = new JMenuItem("궁세체");
		itemFont2 = new JMenuItem("맑은고딕");
		itemFont3 = new JMenuItem("HY엽서M");
		item10 = new JMenuItem("10px");
		item15 = new JMenuItem("15px");
		item20 = new JMenuItem("20px");
		itemFontRed = new JMenuItem("Red");
		itemFontBlue = new JMenuItem("Blue");
		itemFontBlack = new JMenuItem("Black");

		itemNew.addActionListener(this);
		itemOpen.addActionListener(this);
		itemSave.addActionListener(this);
		itemExit.addActionListener(this);
		itemFont1.addActionListener(this);
		itemFont2.addActionListener(this);
		itemFont3.addActionListener(this);
		item10.addActionListener(this);
		item15.addActionListener(this);
		item20.addActionListener(this);
		itemFontRed.addActionListener(this);
		itemFontBlue.addActionListener(this);
		itemFontBlack.addActionListener(this);

		// File 상위메뉴에 메뉴항목들 추가
		menuFile.add(itemNew);
		menuFile.add(itemOpen);
		menuFile.add(itemSave);
		menuFile.add(itemExit);

		// Format 상위메뉴에 하위메뉴 추가
		menuFormat.add(menuFont);
		menuFormat.add(menuFontsize);
		menuFormat.add(menuFontColor);

		// 하위메뉴에 메뉴 항목 추가
		menuFont.add(itemFont1);
		menuFont.add(itemFont2);
		menuFont.add(itemFont3);
		menuFontsize.add(item10);
		menuFontsize.add(item15);
		menuFontsize.add(item20);
		menuFontColor.add(itemFontRed);
		menuFontColor.add(itemFontBlue);
		menuFontColor.add(itemFontBlack);
		// 메뉴바에 File 상위메뉴 추가
		menuBar.add(menuFile);
		menuBar.add(menuFormat);
		// 프레임에 메뉴바 설정 *꼭 필요*
		setJMenuBar(menuBar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem eItem = (JMenuItem) e.getSource();
		if (eItem == itemNew) {
			area.setText("");
		} else if (eItem == itemOpen) {
			readFile();
		} else if (eItem == itemSave) {
			writeFile();
		} else if (eItem == itemExit) {
			System.exit(0); // 프로그램이 종료되는 문장 dispose도 가능
		} else if (eItem == itemFont1) {
			area.setFont(new Font("궁서체", Font.PLAIN, area.getFont().getSize()));
		} else if (eItem == itemFont2) {
			area.setFont(new Font("맑은 고딕", Font.PLAIN, area.getFont().getSize()));
		} else if (eItem == itemFont3) {
			area.setFont(new Font("엽서M", Font.PLAIN, area.getFont().getSize()));
		} else if (eItem == item10) {
			area.setFont(new Font(area.getFont().getFamily(), Font.PLAIN, 10)); // 폰트객체 반환해줌. 글꼴 다르면 안되니깐
		} else if (eItem == item15) {
			area.setFont(new Font(area.getFont().getFamily(), Font.PLAIN, 15));
		} else if (eItem == item20) {
			area.setFont(new Font(area.getFont().getFamily(), Font.PLAIN, 20));
		} else if (eItem == itemFontRed) {
			area.setForeground(Color.red);
		} else if (eItem == itemFontBlue) {
			area.setForeground(Color.blue);
		} else if (eItem == itemFontBlack) {
			area.setForeground(Color.black);
		}
	}

	private void readFile() {
		area.setText("");
		FileDialog fileDlg = null;
		fileDlg = new FileDialog(this, "File Open", FileDialog.LOAD);
		fileDlg.setVisible(true);
		System.out.println(fileDlg.getDirectory());
		System.out.println(fileDlg.getFile());
		FileReader fReader = null;
		BufferedReader bufReader = null;
		try {
			fReader = new FileReader(new File(fileDlg.getDirectory() + "/" + fileDlg.getFile()));
			bufReader = new BufferedReader(fReader);
			String line = " ";
			while ((line = bufReader.readLine()) != null) {
				area.append(line + "\n");
			}
			bufReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void writeFile() {
		FileDialog fileDlg = null;
		fileDlg = new FileDialog(this, "File Save", FileDialog.SAVE);
		fileDlg.setVisible(true);
		System.out.println(fileDlg.getDirectory());
		System.out.println(fileDlg.getFile());
		FileReader fWriter = null;
		BufferedWriter bufWriter = null;
		try {
			fWriter = new FileReader(new File(fileDlg.getDirectory() + "/" + fileDlg.getFile()));
			bufWriter = new BufferedWriter(bufWriter);
			bufWriter.write(area.getText());
			bufWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		new SimpleNotepad();
	}
}
