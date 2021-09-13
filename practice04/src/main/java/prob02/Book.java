package prob02;

public class Book extends BookShop{
	public int bookNo;
	public String title;
	public String author;
	public int stateCode;
	public String print;
	public String rent;
	
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	void stateCode() {
		this.stateCode = stateCode;
		stateCode = 1 ;
	}
	void rent() {
		stateCode = stateCode -1;
		if(stateCode == 0) {
			System.out.println(title +"이(가) 대여 됐습니다.");
		}
	}
	void print() {
		if(stateCode==0) {
			 System.out.print("재고없음");;
		}
		else if(stateCode==1){
			 System.out.print("재고있음");
		}
	}
}
