package product.vo;

public class ProductVO {
	
	private String proName;   //제품명
	private int price;        //가격
	private int productNum;   //제품번호
	private int amount;       //재고량 stockNum
	private String imageName;
	
	public ProductVO(String proName, int price, int productNum, int amount) {
		super();
		this.proName = proName;
		this.price = price;
		this.productNum = productNum;
		this.amount = amount;
	}
	
	public ProductVO() {
		
	}

	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	
	@Override
	public String toString() {
		return "ProductVO [proName=" + proName + ", price=" + price + ", productNum=" + productNum + ", amount="
				+ amount + "]";
	}
	
	
	
}
