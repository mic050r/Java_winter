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
		ProductView view = new ProductView();
		fullProduct(); //자판기 채우는걸 호출
		view.setProductList(proList);
		JPanel PanC = view.Output();
		add(PanC, "Center");
		setTitle("음료 자판기");
		// 기본이 영어로 default 닫기 close 연산 operation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// setLocation(100, 50);
		// setSize(600, 600);
		setBounds(100, 50, 600, 600);
		setVisible(true); //맨마지막에 있기
	}
	public void fullProduct() {
		// 자판기에 제품 채우기
				ProductDAO dao = new ProductDAO();
				String names[] = { "coca", "cocopap", "grape", "masil", "milkis", "powerade",  "orange juice", "sichec", "sida"};
				int[] prices = { 800, 900, 1100, 1100, 1500, 1600, 2000, 1000, 700 };
				ProductVO vo = null;
				proList = dao.select();
				for (int i = 0; i < names.length; i++) {
					vo = new ProductVO();
					vo.setProName(names[i]);
					//vo.setPrice(prices[i]);
					//vo.setProductNum(i);
					vo.setAmount(10);
					vo.setImageName(names[i]);
					proList.add(vo);
				}
	}
	public static void main(String[] args) {
		new ProductController();
	}
}
