package product.view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

import product.vo.ProductVO;

public class ProductView {
	ArrayList<ProductVO> proList; // proList ArrayList선언 
	ArrayList<JLabel> lblList = new ArrayList<JLabel>();
	
	
	// 제품을 보여주는 화면
	public JPanel Output() { //displayProducts
		JPanel panC = new JPanel(new GridLayout(3,3));
		for (ProductVO vo : proList) {
			ImageIcon icon = new ImageIcon("imgs/" + vo.getImageName() + ".png");
			JLabel lbl = new JLabel(icon);
			lblList.add(lbl);
			panC.add(lbl);
		}
		return panC;
	}

	// 제품을 입력(구매)하는 화면
	public void Input() { //inputPurchase 

	}


	public void setProductList(ArrayList<ProductVO> proList) {
		this.proList = proList;
	}
}
