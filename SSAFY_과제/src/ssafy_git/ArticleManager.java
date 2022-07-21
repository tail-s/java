package ssafy_git;

public class ArticleManager {
	
	private int MAX_ARTICLE_SIZE = 1000;
	private Article[] articles = new Article[this.MAX_ARTICLE_SIZE];
	private int articleSize = 0;
	
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
	
	public void addArticle(Article article) {	//로그인 시만 가능
		if(this.articleSize<1000) {
			articles[this.articleSize] = article;
		}
	}
	
	public void removeArticle(int articleId) {	//게시글이 삭제되면 해당 게시글의 댓글 또한 전부 삭제
		for(int i=0; i<this.articleSize; i++) {
			if(articles[i].getArticleId()==articleId) {
				for(int j=0; j<this.articleSize-i; j++) {
					articles[i+j] = articles[i+j+1];
				}
				this.articleSize--;
			}
		}
	}

}
