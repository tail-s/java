package example02;

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		//¹Ú½Ì(Boxing)ÄÚµå --> °´Ã¼È­ ½ÃÅ´
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf(100);
		//ÄÄÆÄÀÏ ½Ã new Integer(100)·Î ¹Ù²ï´Ù.
		Integer obj4 = 100;
		
		System.out.println("¹Ú½Ì ÈÄ");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		//¾ð¹Ú½Ì(UnBoxing)ÄÚµå --> ±âº»°ªÀ¸·Î ¹Ù²Û´Ù.
		int value1 = obj1.intValue();
		int value2 = obj2;
		int value3 = obj3;
		int value4 = obj4.intValue();
		
		System.out.println("¾ð¹Ú½Ì ÈÄ");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		

	}

}
