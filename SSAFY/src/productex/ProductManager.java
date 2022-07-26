package productex;

public class ProductManager {
	
	private int MAX_PRODUCT_SIZE = 100;
	private int MAX_REVIEW_SIZE = 1000;
	private Product[] products = new Product[MAX_PRODUCT_SIZE];
	private Review[] reviews = new Review[MAX_REVIEW_SIZE];
	private int pCount = 0;
	private int rCount = 0;
	
	public boolean addProduct(Product product) {
		boolean result = false;
		if(pCount<100) {
			products[pCount++] = product;
			result = true;
		}
		return result;
	}
	
	public boolean updateProduct(Product product) {
		boolean result = false;
		for(int i=0; i<pCount; i++) {
			if(products[i].getpCode().equals(product.getpCode())) {
				products[i] = product;
				result = true;
			}
		}
		return result;
	}
	
	public boolean removeProduct(String pCode) {
		boolean result = false;
		for(int i=0; i<pCount; i++) {
			if(products[i].getpCode().equals(pCode)) {
				for(int j=0; j<pCount-i; j++) {
					products[i+j] = products[i+j+1];					
				}
				result = true;
				pCount--;
			}
		}
		return result;
	}
	
	public int sell(String pCode, int cnt) {
		int result = 0;
		for(int i=0; i<pCount; i++) {
			if(products[i].getpCode().equals(pCode)) {
				products[i].setQuantity(products[i].getQuantity()-cnt);
				result = products[i].getQuantity();
			}
		}
		return result;
	}
	
	public Product[] getProductList() {
		Product[] result = new Product[pCount];
		for(int i=0; i<pCount; i++) {
			result[i] = products[i];
		}
		return result;
	}
	
	public Product searchByCode(String pCode) {
		Product result = null;
		for(int i=0; i<pCount; i++) {
			if(products[i].getpCode().equals(pCode)) {
				result = products[i];
			}
		}
		return result;
	}
	
	public boolean addReview(Review review) {
		boolean result = false;
		if(rCount<100) {
			reviews[rCount++] = review;
			result = true;
		}
		return result;
	}
	
	public boolean removeReview(int reviewId) {
		boolean result = false;
		for(int i=0; i<rCount; i++) {
			if(reviews[i].getReviewId()==reviewId) {
				for(int j=0; j<rCount-i; j++) {
					reviews[i+j] = reviews[i+j+1];					
				}
				result = true;
				rCount--;
			}
		}
		return result;
	}
	
	public Review[] getProductReview(String pCode) {		
		int cnt = 0;
		for(int i=0; i<rCount; i++) {
			if(reviews[i].getpCode().equals(pCode)) {
				cnt++;
			}			
		}		
		Review[] result = new Review[cnt];
		int idx = 0;
		for(int i=0; i<rCount; i++) {
			if(reviews[i].getpCode().equals(pCode)) {
				result[idx++] = reviews[i];
			}			
		}		
		return result;
	}

}
