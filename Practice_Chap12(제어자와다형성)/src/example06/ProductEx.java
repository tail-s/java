package example06;

import java.util.Scanner;

public class ProductEx {
	
	//클래스 영역
	static int productID = 0;
	static int numberOfProduct = 0;
	static Product[] p = new Product[10];
	static Scanner sin = new Scanner(System.in);

	public static void main(String[] args) {		
		
		
		int choice = 0;
		
		while(choice != 3) {
			int type = 0;
			System.out.println("상품조회 프로그램 입니다.");
			System.out.print("상품추가(1), 상품조회(2), 끝내기(3) >> ");
			choice = sin.nextInt();
			
			switch(choice) {
			case 1 : 
				if(numberOfProduct >= p.length) {
					System.out.println("더 이상 상품 추가 불가");
					break;
				}
				
				System.out.print("책(1), 음악CD(2), 회화책(3) >> ");
				type = sin.nextInt();
				
				if(type < 1 || type > 3) {
					System.out.println("잘못 입력함.");
					break;
				}
				addProduct(type);
				break;
			case 2 :
				for(int i=0; i<numberOfProduct; i++) {
					p[i].showInfo();
				}
				break;
			case 3 :
				System.out.println("프로그램 종료");
				break;				
			}					
		}					
	}
	
	public static void addProduct(int type) {
		sin.nextLine(); //버퍼 비우기(엔터키)
		System.out.print("상품설명 >> ");
		String desc = sin.nextLine();
		System.out.print("생산자 >> ");
		String maker = sin.nextLine();
		System.out.print("가격 >> ");
		int price = sin.nextInt();
		sin.nextLine();	//버퍼 비우기(엔터키)
		
		switch(type) {
		case 1 :
			System.out.print("일반책 제목 >> ");
			String title = sin.nextLine();
			System.out.print("저자 >> ");
			String author = sin.nextLine();
			System.out.print("국제표준도서번호 >> ");
			int ISBN = sin.nextInt();
			//필드의 다형성(조상객체배열에 자손의 인스턴스를 붙이고 있다.)
			p[numberOfProduct] = new Book(productID++, desc, maker, price, ISBN, title, author);
			break;
		case 2 :
			System.out.print("앨범제목 >> ");
			String albumTitle = sin.nextLine();
			System.out.print("가수 >> ");
			String artist = sin.nextLine();
			//필드의 다형성(조상객체배열에 자손의 인스턴스를 붙이고 있다.)
			p[numberOfProduct] = new CompactDisc(productID++, desc, maker, price, albumTitle, artist);
			break;
		case 3 :
			System.out.print("회화책 제목 >> ");
			String title2 = sin.nextLine();
			System.out.print("저자 >> ");
			String author2 = sin.nextLine();
			System.out.print("언어 >> ");
			String language = sin.nextLine();
			System.out.print("국제표준도서번호(ex.0001) >> ");
			int ISBN2 = sin.nextInt();
			//필드의 다형성(조상객체배열에 자손의 인스턴스를 붙이고 있다.)
			p[numberOfProduct] = new ConversationBook
					(productID++, desc, maker, price, ISBN2, title2, author2, language);
			break;
		}
		numberOfProduct++;
		
	}

}
