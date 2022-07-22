package boardex;

public class ArticleManager {
	
	private int MAX_ARTICLE_SIZE = 1000;
	private Article[] articles = new Article[this.MAX_ARTICLE_SIZE];
	private int articleSize = 0;
	
	public int getArticleSize() {
		return articleSize;
	}

	public Article[] getArticleList() {
		Article[] result = new Article[this.articleSize];
		for(int i=0; i<this.articleSize; i++) {
			result[i] = articles[i];
		}
		return result;
	}
	
	public Article getArticle(int articleId) {
		Article result = null;
		for(int i=0; i<this.articleSize; i++) {
			if(articles[i].getArticleId()==articleId) {
				result = articles[i];
			}
		}
		return result;		
	}
	
	public void addArticle(Article article) {
		if(this.articleSize<1000) {
			articles[this.articleSize++] = article;
		}
	}
	
	public void removeArticle(int articleId) {
		for(int i=0; i<this.articleSize; i++) {
			if(articles[i].getArticleId()==articleId) {
				for(int j=0; j<this.articleSize; j++) {
					articles[i+j] = articles[i+j+1];
				}
				this.articleSize--;
			}
		}
	}


}
