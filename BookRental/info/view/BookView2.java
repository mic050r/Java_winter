package info.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import info.vo.BookVO;

public class BookView2 extends JPanel {
	JTable table;
	DefaultTableModel model; // DfaultTableModel이 같이 필요함
	ArrayList<BookVO> bookVOList;
	String header[] = { "도서 번호", "도서명", "출판사", "저자명", "도서가격", "카테고리" };
	String categoryNames[] = { "IT도서", "소설", "비도서", "경제", "사회" };
	// 패널 선언
	JPanel panS;
	JComboBox<String> categoryCombo;
	JLabel lbls[] = new JLabel[header.length]; // 참조형 변수 선언
	JTextField tf[] = new JTextField[header.length - 1]; // JTextfield 5개 필요 카테고리 하나 빼서
	// 버튼 추가
	JButton btnAdd = new JButton("도서추가");

	// 생성자
	public BookView2() {
		setLayout(new BorderLayout()); // JPanel의 기본적인 대치관리자는 FlowLayout인데 BorderLayout을 사용하기 위해 바꿈

		categoryCombo = new JComboBox<String>(categoryNames); //

		panS = new JPanel();
		panS.setLayout(new GridLayout(4, 4)); // 행, 열

		for (int i = 0; i < header.length; i++) {
			lbls[i] = new JLabel(header[i]);
			panS.add(lbls[i]); // 구역이 나눠진 panS에 라벨 넣기
			if (i < header.length - 1) { // i가 4일때까지 0 1 2 3 4
				tf[i] = new JTextField();
				panS.add(tf[i]);
			} else {// i가 5가 됐을때 카테고리 콤보 넣어주기
				panS.add(categoryCombo);
			}
		}
		// 도서추가 앞에 빈칸 3개 추가
		for (int i = 0; i < 3; i++) {
			panS.add(new JLabel(" "));
		}
		// 버튼 추가
		panS.add(btnAdd);
	}

	// initView(): JTable 관련 메소드
	public void initView() {
		model = new DefaultTableModel(header, bookVOList.size()) { // 편집이 됨
			// isCell 단축키
			@Override
			public boolean isCellEditable(int row, int column) { // 패널에 저장되어 있는
				return false; // 편집안됨
			}
		};
		// 컬럼들의 너비 설정
		table = new JTable(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(50);

		// 스크로바 만들기
		JScrollPane scroll = new JScrollPane(table);

		putResult();

		add("Center", scroll); // 위치 순서 상관없음
		add("South", panS);

	}

	// DefaultTableModel에 도서 정보들을 설정한다.
	public void putResult() { //결과의 값들 잘 설정되도록
		// ** modelml 행 개수 설정
		model.setRowCount(bookVOList.size()); // 화면에 나오게 하는것 중요
		// 지역변수 선언
		BookVO vo = null;
		for (int i = 0; i < bookVOList.size(); i++) {
			vo = bookVOList.get(i);
			// i : 행 번호 0 : 열번호
			// 값을 설정한다 sell값을 설정하는 메소드
			model.setValueAt(vo.getIsbn(), i, 0);
			model.setValueAt(vo.getbookName(), i, 1);
			model.setValueAt(vo.getPublish(), i, 2);
			model.setValueAt(vo.getAuthor(), i, 3);
			model.setValueAt(vo.getPrice(), i, 4);
			model.setValueAt(vo.getCategory(), i, 5);
		}
	}

	public void setBookVOList(ArrayList<BookVO> bookVOList) { // 단축키 사용가능
		this.bookVOList = bookVOList;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public BookVO neededInsertData() {
		BookVO vo = new BookVO();
		vo.setIsbn(Integer.parseInt(tf[0].getText()));
		vo.setBookName(tf[1].getText());
		vo.setPublish(tf[2].getText());
		vo.setAuthor(tf[3].getText());
		vo.setPrice(Integer.parseInt(tf[4].getText()));
		vo.setCategory((String) categoryCombo.getSelectedItem());
		return vo; //vo를 return
	}

	public void initInsertData() {
		for (int i = 0; i < tf.length; i++) {
			tf[i].setText("");
		}
		categoryCombo.setSelectedIndex(0);
	}
}
