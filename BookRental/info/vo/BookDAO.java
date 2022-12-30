package info.vo;

import java.util.ArrayList;

public class BookDAO {
	//ArrayList 만들기
	ArrayList<BookVO> bookList = new ArrayList();
	
	//insert : ArrayList에 도서정보객체를 추가하는 메소드
	public void insert(BookVO book) {
		bookList.add(book);
	}
	
	//select : 전체 책 정보를 반환해주기
	public  ArrayList<BookVO> select() {
		return bookList;
		
	}
}
