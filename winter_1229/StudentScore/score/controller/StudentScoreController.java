package score.controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import score.vo.StudentScoreVO;
import score.view.StudentScoreView;
import score.vo.StudentScoreDAO;
import score.vo.StudentScoreVO;

public class StudentScoreController extends JFrame {

	StudentScoreDAO dao;
	ArrayList<StudentScoreVO> scoreVOLIst;
	StudentScoreView view;
	JTable table;
	
	public StudentScoreController() {
		dao = new StudentScoreDAO();
		view = new StudentScoreView();
		scoreVOLIst = dao.select();
		view.setscoreVOList(scoreVOLIst);
		view.initView();
		JButton btnAdd = view.getBtnAdd();
		btnAdd.addActionListener(btnAddL);
		// table 만들기
		table = view.getTable();
		table.addMouseListener(tableL);
		
		add(view, "Center");
		setTitle("성적 관리 시스템");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200, 100);
		setSize(600, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new StudentScoreController();
	}

	ActionListener btnAddL = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// neededInsertData() : panS에 있는 JTextField에 입력된 값들과 JCombobox의 값
			// BookVO에 필드값들을 초기화하여 BookVO 객체에 참조값을 변환하는 메소드
			StudentScoreVO vo = view.neededInsertData();
			dao.insert(vo);
			scoreVOLIst = dao.select();
			view.setscoreVOList(scoreVOLIst);// bookVOLIst를 다시 view에 넣어주기
			view.putResult();
			view.initInsertData(); // (사용자의 편리를 위한것) 기존의 입력됐던 값들을 처음으로 초기화시켜줌
		}
	};

	// 마우스로 더블 클릭했을 때
	MouseAdapter tableL = new MouseAdapter() { //필요한 메소드만 오버라이딩해서 사용할 수 있음
		public void mouseClicked(MouseEvent e) {
			int state = 1;
			// 클릭된 횟수
			if (e.getClickCount() == 2) { // 더블클릭
				state = JOptionPane.showConfirmDialog(StudentScoreController.this, "정말 삭제하시겠습니까?", "삭제여부",
						JOptionPane.YES_NO_OPTION); // 그냥 this 쓰면 리스너 참조값이 되어버림 JFrame의 상속을 받은 StudentScoreController를 tkdyd
				if (state == JOptionPane.YES_OPTION) {
					dao.delete(table.getSelectedRow());
					scoreVOLIst = dao.select();
					view.setscoreVOList(scoreVOLIst);
					view.putResult();
					//view.initInsertData();
				}
			}
		}
	};
}
