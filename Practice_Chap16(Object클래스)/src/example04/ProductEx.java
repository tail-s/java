package example04;

public class ProductEx {

	public static void main(String[] args) {
		
		Product original = new Product("1225", "TV", 300, new int[] {10, 20}, new Apple(500));
		
		Product cloned = original.getProduct();	//얕은 복제를 한 객체를 리턴
		
		int[] arr1 = cloned.getArr();
		Apple apple = cloned.getApple();
		
//		int[] arr2 = original.getArr();
//		System.out.println("배열 주소(복제객체) : " + arr1);
//		System.out.println("배열 주소(원본객체) : " + arr2);
		
		arr1[0] = 777;
		apple.price = 1000;
		
		System.out.println(original);
		System.out.println();
		System.out.println(cloned);
		
		

	}

}
