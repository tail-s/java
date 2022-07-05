package example09;

public class StorageEx {

	public static void main(String[] args) {
		
		Storable<String> storable = new Storage<>(5);
		
		for(int i=0; i<5; i++) {
			storable.add("My Car " + (i+1), i);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(storable.get(i));
		}
		
		
	}

}
