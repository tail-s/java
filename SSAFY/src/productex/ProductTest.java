package productex;

public class ProductTest {

	public static void main(String[] args) {
		
		ProductManager pm = new ProductManager();
		
		Product p1 = new Product("code1", "p1", 15000, 50, "brand1", "TestP1");
		Product p2 = new Product("code2", "p2", 20000, 100, "brand2", "TestP2");
		Product p3 = new Product("code3", "p3", 25000, 150, "brand3", "TestP3");
		
		Review r1 = new Review(0, "code1", "writer1", "좋아요.");
		Review r2 = new Review(1, "code1", "writer2", "싫어요.");
		Review r3 = new Review(2, "code3", "writer3", "모르겠어요.");
		
		pm.addProduct(p1);
		pm.addProduct(p2);
		pm.addProduct(p3);
		
		pm.addReview(r1);
		pm.addReview(r2);
		pm.addReview(r3);
		
		for(Product p : pm.getProductList()) {
			System.out.println(p);
		}
		
		p2.setPrice(21000);
		pm.updateProduct(p2);
		pm.sell("code1", 11);
		pm.removeProduct("code3");
		
		System.out.println();
		
		for(Product p : pm.getProductList()) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println(pm.searchByCode("code2"));		
		System.out.println();
		
		for(Review r : pm.getProductReview("code1")) {
			System.out.println(r);
		}
		
		pm.removeReview(1);
		System.out.println();
		
		for(Review r : pm.getProductReview("code1")) {
			System.out.println(r);
		}		

	}

}
