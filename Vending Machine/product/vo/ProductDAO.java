package product.vo;

import java.util.ArrayList;

public class ProductDAO {
	//arraylist
	ArrayList<ProductVO> proList = new ArrayList();
	//insert
	public void insert(ProductVO pro) {
		proList.add(pro);
	}
	//select
	public ArrayList<ProductVO> select() {
		return proList;
	}
}
