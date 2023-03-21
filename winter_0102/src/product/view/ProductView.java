package product.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;

import product.controller.ProductController;
import product.vo.ProductVO;

public class ProductView {
	ArrayList<ProductVO> proList; // proList ArrayList선언
	ArrayList<JLabel> lblList = new ArrayList<JLabel>();
	JTextField insertTf = new JTextField(10);
	JLabel lblResult = new JLabel("");
	JFrame frame;
	ProductVO vo;
	JLabel eLbl;

	// 제품을 보여주는 화면
	public JPanel Output(JFrame frame) { // displayProducts
		this.frame = frame;
		JPanel panC = new JPanel(new GridLayout(3, 3));
		JPanel pan =  null;
		JLabel lblPrice = null;
		for (ProductVO vo : proList) {
			ImageIcon icon = new ImageIcon("imgs/" + vo.getImageName() + ".png");
			JLabel lbl = new JLabel(icon);
			lbl.setOpaque(true); // 배경 투명한 색
			lbl.setBackground(Color.WHITE); // 배경 흰색으로 만들기
			lbl.addMouseListener(lblL);
			lblList.add(lbl);
			lblPrice = new JLabel(vo.getPrice() + "원", JLabel.CENTER);
			lblPrice.setFont(new Font("중고딕", Font.BOLD, 15));
			lblPrice.setOpaque(true);
			lblPrice.setBackground(new Color(232,217,255));
			pan = new JPanel(new BorderLayout());
			pan.add(lbl, "Center");
			pan.add(lblPrice, "South");
			panC.add(pan);
		}
		return panC;
	}

	// 제품을 입력(구매)하는 화면
	public JPanel Input() { // inputPurchase
		JPanel panS = new JPanel();
		JLabel lblMoney = new JLabel("금액");
		JButton btnInsert = new JButton("투입");
		btnInsert.addActionListener(btnL);
		// 차례대로 넣는 거
		panS.add(lblMoney);
		panS.add(insertTf);
		panS.add(btnInsert);
		panS.add(lblResult);
		return panS;
	}

	public void setProductList(ArrayList<ProductVO> proList) {
		this.proList = proList;
	}

	MouseAdapter lblL = new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			eLbl = (JLabel) e.getSource();
			for (int i = 0; i < lblList.size(); i++) {
				if (eLbl == lblList.get(i)) {
					lblList.get(i).setBackground(Color.DARK_GRAY);
					vo = proList.get(i);
				}
			}
			//JOptionPane.showMessageDialog(frame, "제품명 : " + vo.getProName() + "제품 가격 : " + vo.getPrice() + "원");
		}
	};

	ActionListener btnL = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 투입된 버튼이 클릭되었을때
			// JTextField에 입력된 금액과 현재 금액을 비교하여 양수이상이면 제품과 거스름돈이 나오게
			// 금액이 부족하면 부족하다고 출력되게
			int money = Integer.parseInt(insertTf.getText());
			if (money >= vo.getPrice()) {
				ImageIcon icon = new ImageIcon("imgs/" + vo.getImageName() + ".png");
				lblResult.setIcon(icon);
				JOptionPane.showMessageDialog(frame, vo.getProName() + " 제품 나옴, 거스름돈 : " + (money - vo.getPrice()) + "원");
				insertTf.setText("");
			} else {
				JOptionPane.showMessageDialog(frame, "금액이 부족합니다");
			}
			insertTf.setText("");
			eLbl.setBackground(Color.white);
		}
	};
}
