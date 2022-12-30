package info.controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import info.view.BookView2;
import info.vo.BookDAO;
import info.vo.BookVO;

public class BookController2 extends JFrame {
	
	BookDAO dao;
	ArrayList<BookVO> bookVOLIst;
	BookView2 view2;

	public BookController2() {
		dao = new BookDAO();
		view2 = new BookView2();
		bookVOLIst = dao.select();
		view2.setBookVOList(bookVOLIst);
		view2.initView(); //initView호출
		JButton btnAdd = view2.getBtnAdd(); //view만들어져 있는 버튼 반환해서 사용하기
		btnAdd.addActionListener(btnAddL); //버튼을 클릭했을때
		add(view2, "Center"); //view2의 가운데에 추가
		setTitle("도서 관리 시스템");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200, 100);
		setSize(600, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BookController2();
	}

	ActionListener btnAddL = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			//neededInsertData() : panS에 있는 JTextField에 입력된 값들과 JCombobox의 값
			//BookVO에 필드값들을 초기화하여 BookVO 객체에 참조값을 변환하는 메소드
			BookVO vo = view2.neededInsertData();
			dao.insert(vo);
			bookVOLIst = dao.select();
			view2.setBookVOList(bookVOLIst);//bookVOLIst를 다시 view에 넣어주기
			view2.putResult();
			view2.initInsertData(); //(사용자의 편리를 위한것) 기존의 입력됐던 값들을 처음으로 초기화시켜줌
		}
	};
}
