package score.view;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import score.vo.StudentScoreVO;

public class StudentScoreView extends JPanel {
	// 5,4
	JTable table;
	DefaultTableModel model;
	ArrayList<StudentScoreVO> scoreVOList;
	String header[] = { "학번", "이름", "학년", "반", "국어", "영어", "수학", "과학", "총점", "평균" };
	// 패널 선언
	JPanel panS;
	JLabel lbls[] = new JLabel[header.length - 2];
	JTextField tf[] = new JTextField[header.length - 2];
	// 버튼 추가
	JButton btnAdd = new JButton("성적 추가");

	// 생성자
	public StudentScoreView() {
		setLayout(new BorderLayout());
		panS = new JPanel();
		panS.setLayout(new GridLayout(5, 4)); // 행 열

		for (int i = 0; i < lbls.length; i++) {
			lbls[i] = new JLabel(header[i]);
			panS.add(lbls[i]);
			tf[i] = new JTextField();
			panS.add(tf[i]);
		}

		// 빈칸추가
		for (int i = 0; i < 3; i++) {
			panS.add(new JLabel(" "));
		}
		panS.add(btnAdd);
	}

	// initView : JLable
	public void initView() {
		model = new DefaultTableModel(header, scoreVOList.size()) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false; // 편집 안되게
			}
		};
		// 컬럼들의 너비 설정
		table = new JTable(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(50);
		table.getColumnModel().getColumn(2).setPreferredWidth(50);
		table.getColumnModel().getColumn(3).setPreferredWidth(50);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(50);
		table.getColumnModel().getColumn(6).setPreferredWidth(50);
		table.getColumnModel().getColumn(7).setPreferredWidth(50);
		table.getColumnModel().getColumn(8).setPreferredWidth(50);
		table.getColumnModel().getColumn(9).setPreferredWidth(50);
		// 스크롤바 만들기
		JScrollPane scroll = new JScrollPane(table);

		putResult();

		add("Center", scroll);
		add("South", panS);
	}

	public void putResult() {
		// modelml 행 개수 설정
		model.setRowCount(scoreVOList.size());
		StudentScoreVO vo = null;
		for (int i = 0; i < scoreVOList.size(); i++) {
			vo = scoreVOList.get(i);
			model.setValueAt(vo.getStuId(), i, 0);
			model.setValueAt(vo.getName(), i, 1);
			model.setValueAt(vo.getGrade(), i, 2);
			model.setValueAt(vo.getBan(), i, 3);
			model.setValueAt(vo.getKor(), i, 4);
			model.setValueAt(vo.getEng(), i, 5);
			model.setValueAt(vo.getMath(), i, 6);
			model.setValueAt(vo.getSci(), i, 7);
			model.setValueAt(vo.getTotal(), i, 8);
			model.setValueAt(vo.getAvg(), i, 9);
		}
	}

	public void setscoreVOList(ArrayList<StudentScoreVO> scoreVOList) {
		this.scoreVOList = scoreVOList;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public StudentScoreVO neededInsertData() {
		StudentScoreVO vo = new StudentScoreVO();
		vo.setStuId(Integer.parseInt(tf[0].getText()));
		vo.setName((tf[1].getText()));
		vo.setGrade(Integer.parseInt(tf[2].getText()));
		vo.setBan(Integer.parseInt(tf[3].getText()));
		vo.setKor(Integer.parseInt(tf[4].getText()));
		vo.setEng(Integer.parseInt(tf[5].getText()));
		vo.setMath(Integer.parseInt(tf[6].getText()));
		vo.setSci(Integer.parseInt(tf[7].getText()));
		vo.setTotal();
		vo.setAvg();
		return vo;

	}

	public void initInsertData() {
		for (int i = 0; i < tf.length; i++) {
			tf[i].setText("");
		}
	}
	public JTable getTable() {
		return table;
	}
}
