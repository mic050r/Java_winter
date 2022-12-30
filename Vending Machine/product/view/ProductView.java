package product.view;

import java.util.ArrayList;
import java.util.Scanner;

import product.vo.ProductVO;

public class ProductView {

	ArrayList<ProductVO> proList; // proList ArrayList선언
	Scanner s1 = new Scanner(System.in); // 정수용 입력

	// 제품을 보여주는 화면
	public void Output() {
		int cnt = 0;
		System.out.println("====================================Drink Vending Machine================================");
		// for each문
		for (ProductVO vo : proList) {

				System.out.print((vo.getProductNum() + 1) + " : " + vo.getProName() + "[ price : " + vo.getPrice()
						+ ", amount : " + vo.getAmount() + "] \t");
				if (++cnt % 2 == 0) {
					System.out.println(" ");
					System.out.println(" ");
				}
				
			
		}
		System.out.println("\n=========================================================================================\n");
	}

	// 제품을 입력(구매)하는 화면
	public void Input() {
		System.out.println("*********************Purchase Drink*********************");
		System.out.print("구입 제품 번호를 입력하세요 : ");
		int productNum = s1.nextInt();
		ProductVO vo = proList.get(productNum - 1);

		// 제품량이 남아 있으면
		if (vo.getAmount() > 0) {
			System.out.print(vo.getProName() + " 제품의 가격은 " + vo.getPrice() + "원 돈을 투입 : ");
			int price = s1.nextInt();
			System.out.print(vo.getProName() + "제품이 나왔습니다.");
			// 원래 가격보다 입력받은 가격이 더 클 때 거스름돈이 나옴
			if (price > vo.getPrice()) {
				System.out.println("거스름돈 : " + (price - vo.getPrice() + "원")); // 입력받은 가격 - 원래 가격 = 거스름돈
				vo.setAmount(vo.getAmount() - 1); // 재고량에서 하나 빼기
			}
		} else { // (vo.getAmount() < 0)
			System.out.println("선택하신 제품은 재고가 없습니다.");
		}
		
	}
	//스캐너 리턴받기
	public Scanner getS1() {
		return s1;
	}

	public void setProductList(ArrayList<ProductVO> proList) {
		this.proList = proList;
	}

}
