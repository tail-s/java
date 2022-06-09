package example06;

public class CompactDisc extends Product {
	

	private String albumTitle;
	private String artist;
	
		
	public CompactDisc(int productID, String description, String maker, int price, String albumTitle, String artist) {
		super(productID, description, maker, price);
		this.albumTitle = albumTitle;
		this.artist = artist;
	}



	public String getAlbumTitle() {
		return albumTitle;
	}

	public String getArtist() {
		return artist;
	}





	@Override
	public void showInfo() {
		super.showInfo();	//조상클래스의 메서드를 명시적 호출	
		System.out.println("앨범제목 >> " + this.getAlbumTitle());
		System.out.println("가수 >> " + this.getArtist());
	}
	

}
