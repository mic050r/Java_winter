package info.view;

import java.util.ArrayList;

import info.vo.BookVO;

public class BookView {

	public void view(ArrayList<BookVO> bookList) {
		for(BookVO book : bookList) {
			System.out.println("======================================================================================");
			System.out.print("도서 번호 : " + book.getIsbn() + "\t");
			System.out.print("책 이름 : " + book.getbookName() + "\t");
			System.out.print("저자명 : " + book.getAuthor() + "\t");
			System.out.print("출판사 : " + book.getPublish() + "\t");
			System.out.print("가격 : " + book.getPrice() +"원" + "\t");
			System.out.print("카테고리 : " + book.getCategory() + "\n");
			System.out.println("--------------------------------------------------------------------------------------");
		}
	}

}
