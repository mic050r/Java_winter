package info.controller;

import java.util.ArrayList;
import java.util.Scanner;

import info.view.BookView;
import info.vo.BookDAO;
import info.vo.BookVO;

public class BookController {
	public static final int CONTINUE = 1;
	public static final int BREAK = 0;

	// ArrayList 에 추가하기
	ArrayList<Integer> isbns = new ArrayList<Integer>();
	ArrayList<String> bookNames = new ArrayList<String>();
	ArrayList<String> authors = new ArrayList<String>();
	ArrayList<String> publishes = new ArrayList<String>();
	ArrayList<Double> prices = new ArrayList<Double>();
	ArrayList<String> categories = new ArrayList<String>();

	public void consoleToList() {
		Scanner s1 = new Scanner(System.in); // 문자용 입력
		Scanner s2 = new Scanner(System.in); // 숫자용 입력

		int flag = CONTINUE;
		System.out.println("********** 도서 정보 입력 **********");
		while (true) {
			if (flag == CONTINUE) {
				System.out.print("==도서 번호 입력 : ");
				isbns.add(s2.nextInt());
				System.out.print("==책 이름 입력 : ");
				bookNames.add(s1.nextLine());
				System.out.print("==저자 입력 : ");
				authors.add(s1.nextLine());
				System.out.print("==출판사 입력 : ");
				publishes.add(s1.nextLine());
				System.out.print("==가격 입력 : ");
				prices.add(s2.nextDouble());
				System.out.print("==카테고리 입력 : ");
				categories.add(s1.nextLine());
				System.out.println(" ");
			} else if (flag == BREAK) {
				break;
			} else {
				System.out.println("다시 입력해주세요 : ");
				flag = s2.nextInt();
			}
			System.out.println("도서 정보를 더 입력하실건가요? (계속 : 1, 중지 : 0) : ");
			flag = s2.nextInt();
		}
		s1.close();
		s2.close();
	}

	public void voToDAO(BookDAO dao) {
		for (int i = 0; i < isbns.size(); i++) {
			BookVO book = new BookVO(isbns.get(i), bookNames.get(i), authors.get(i), publishes.get(i), prices.get(i),
					categories.get(i));
			dao.insert(book);
		}
	}

	public static void main(String args[]) {
		BookController controller = new BookController();
		// controller에 consoleToList에 입력받은 값들을 넣기
		controller.consoleToList();
		BookDAO dao = new BookDAO();
		controller.voToDAO(dao);
		// 화면에 출력
		BookView bView = new BookView();
		bView.view(dao.select());
	}
}
