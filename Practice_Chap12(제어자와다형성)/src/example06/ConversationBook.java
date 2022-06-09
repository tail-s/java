package example06;

public class ConversationBook extends Book {
	

	private String language;	


	public ConversationBook(int productID, String description, String maker, int price, int iSBN, String title,
			String authoer, String language) {
		super(productID, description, maker, price, iSBN, title, authoer);
		this.language = language;
	}


	public String getLanguage() {
		return language;
	}

	@Override
	public void showInfo() {
		super.showInfo();	//조상클래스의 메서드를 명시적 호출	
		System.out.println("언어 >> " + this.getLanguage());
	}
	

}
