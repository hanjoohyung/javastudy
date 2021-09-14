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
		this.stateCode = 1; // bookNo, title, author과 같은 생성자가 호출되면 stateCode를 1로 설정한다.
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
	public void rent() { // 입력한 num과 bookNo가 같으면 책을 대여했다고 하고 stateCode를 0으로 변환
		stateCode = 0;
		System.out.println(title + "이(가) 대출 됐습니다.");
	}
	public void check() {
		if(stateCode == 0 ) { // 책 정보를 출력 할 때 각 책의 stateCode정보를 보고 0이면 대여중 1이면 재고있음으로 출력해준다
			check = "대여중";
		}
		else {
			check = "재고있음";
		}
	}
	public void print() {
		check();  // check라는 함수를 만들었으니까 꼭 호출해줘야지 정상적으로 컴파일된다.
		System.out.println("책 제목 : " + title + ", 작가 : " + author + ", 대여 유무 : " + check);
	}
}

