package info.vo;

public class BookVO {
	private int isbn;        //도서번호
	private String bookName; //책이름
	private String author;   //저자명
	private String publish;  //출판사
	private double price;    //가격
	private String category; //카테로기
	
	//생성자 : 필드값 초기화
	public BookVO() {
		
	}
	public BookVO(int isbn, String bookName, String author, String publish, double price, String category) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
		this.publish = publish;
		this.price = price;
		this.category = category;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getbookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "BookVO [isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + ", publish=" + publish
				+ ", price=" + price + ", category=" + category + "]";
	}
	
	
}
