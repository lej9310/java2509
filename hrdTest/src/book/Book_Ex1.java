package book;

public class Book_Ex1 {
	public static void main(String[] args) {

		// 테이블 생성(Book, Member, Rental)
//		TableCreator.createTable("Book");
//		TableCreator.createTable("Member");
//		TableCreator.createTable("Rental");

		// EX 1. 2020년 이후 츨판된 도서 검색 ==========
		Selector.select("*", "book");
		Selector.select("*", "book", "PubYear >= 2020");
		// SelectTbl.selectTbl("Book");
	}

}
