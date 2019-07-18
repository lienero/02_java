package book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 * 일련번호	 : sequence  : int
//		 * ISBN  	 : isbn		 : String
//		 * 제목      : title 	 : String
//		 * 저자   	 : author 	 : String
//		 * 출판사	 : company   : String
//		 * 페이지 수 : totalPage : int
//		 * 가격      : price 	 : int
////	* 재고수량  : quantity  : int
		Book myBook;
		myBook = new Book(1000, "가", "책", "누군가", "문고", 300, 5000, 10);
		
		myBook.print();
		
		myBook.buy(1);
		
		myBook.sell(9);
		
		myBook.print();

	}

}
