package product.controller;

import java.util.ArrayList;
import java.util.Scanner;

import product.view.ProductView;
import product.vo.ProductDAO;
import product.vo.ProductVO;

public class ProductController {
	public static final int STOP = 0;

	public static void main(String[] args) {
		// 자판기에 제품 채우기
		ProductDAO dao = new ProductDAO();
		String names[] = { "사  이  다", "콜      라", "오렌지웰치스", "포도 웰치스", "제로  콜라", "초록  매실", "오렌지  쥬스", "비 락 식 혜",
				"비타  500" };
		int[] prices = { 800, 900, 1100, 1100, 1500, 1600, 2000, 1000, 700 };
		ProductVO vo = null;
		ArrayList<ProductVO> proList = dao.select();
		for (int i = 0; i < names.length; i++) {
			vo = new ProductVO();
			vo.setProName(names[i]);
			vo.setPrice(prices[i]);
			vo.setProductNum(i);
			vo.setAmount(10);
			proList.add(vo);
		}
		// 자판기 화면 출력
		ProductView view = new ProductView();
		view.setProductList(proList);
		view.Output();
		// 자판기 제품 구매 화면
		Scanner s1 = view.getS1();
		while (true) {
			view.Input();
			System.out.print("!!제품을 계속 구매하시겠습니까?(Continue :1, Stop : 0) : ");
			int state = s1.nextInt();
			if (state == STOP) {
				break;
			}
			view.Output();
		}
		s1.close();
	}
}
