package prob02;

public class Book {
	public int stateCode;
	public int bookNo;
	public String title;
	public String author;
	public String check;
		
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
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
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	public void rent() {
		stateCode = 0;
		System.out.println(title + "이(가) 대출 됐습니다.");
	}
	public void check() {
		if(stateCode == 0 ) {
			check = "대여중";
		}
		else {
			check = "재고있음";
		}
	}
	public void print() {
		check();
		System.out.println("책 제목 : " + title + ", 작가 : " + author + ", 대여 유무 : " + check);
	}
}

