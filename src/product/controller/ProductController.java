package product.controller;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import product.view.ProductView;
import product.vo.ProductDAO;
import product.vo.ProductVO;

public class ProductController extends JFrame {
	ArrayList<ProductVO> proList; //필드로 선언해주기
	public static final int STOP = 0;

	public ProductController() {
		//JFrame 배경색 변경
		ProductView view = new ProductView();
		fullProduct(); //자판기 채우는걸 호출
		view.setProductList(proList);
		JPanel PanC = view.Output(this);
		JPanel panS= view.Input();
		add(PanC, "Center"); //자판기 모양 가운데 에 넣기
		add(panS, "South"); //금액 투입부분 south에 넣기
		
		setTitle("음료 자판기");
		// 기본이 영어로 default 닫기 close 연산 operation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// setLocation(100, 50);
		// setSize(600, 600);
		setBounds(100, 0, 500, 750);
		setVisible(true); //맨마지막에 있기
		setResizable(false); //고정되지 않게 만들어줌
	}
	public void fullProduct() {
		// 자판기에 제품 채우기
				ProductDAO dao = new ProductDAO();
				String names2[] = { "콜라", "코코팜", "포도 웰치스", "초록매실", "밀키스", "파워에이드", "오렌지 쥬스", "비락식혜",
				"사이다" };
				String names[] = { "coca", "cocopap", "grape", "masil", "milkis", "powerade",  "orange juice", "sichec", "sida"};
				int[] prices = { 800, 900, 1100, 1100, 1500, 1600, 2000, 1000, 700 };
				ProductVO vo = null;
				proList = dao.select();
				for (int i = 0; i < names.length; i++) {
					vo = new ProductVO();
					vo.setProName(names2[i]);
					vo.setPrice(prices[i]);
					vo.setProductNum(i);
					vo.setAmount(10);
					vo.setImageName(names[i]);
					proList.add(vo);
				}
	}
	public static void main(String[] args) {
		new ProductController();
	}
}
