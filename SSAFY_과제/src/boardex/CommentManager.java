package boardex;

public class CommentManager {
	
	private int MAX_COMMENT_SIZE = 1000;
	private Comment[] comments = new Comment[this.MAX_COMMENT_SIZE];
	private int commentSize = 0;

	public int getCommentSize() {
		return commentSize;
	}
	
	public void addComment(Comment comment) {
		if(this.commentSize<1000) {
			comments[this.commentSize] = comment;
			this.commentSize++;
		}
	}
	
	public void removeComment(int commentId) {
		for(int i=0; i<this.commentSize; i++) {
			if(comments[i].getCommentId()==commentId) {
				for(int j=0; j<this.commentSize-i; j++) {
					comments[i+j] = comments[i+j+1];
				}
				this.commentSize--;
			}
		}
	}
	
	public void removeArticle(int articleId) {
		for(int i=0; i<this.commentSize; i++) {
			if(comments[i].getArticleId()==articleId) {
				for(int j=0; j<this.commentSize-i; j++) {
					comments[i+j] = comments[i+j+1];
				}
				this.commentSize--;
				i--;
			}
		}
		
	}
	
	public Comment[] getCommentList(int articleId) {
		int cnt = 0;
		for(int i=0; i<this.commentSize; i++) {
			if(comments[i].getArticleId()==articleId) {
				cnt++;
			}
		}
		
		int idx = 0;
		Comment[] result = new Comment[cnt];
		for(int i=0; i<this.commentSize; i++) {
			if(comments[i].getArticleId()==articleId) {
				result[idx++] = comments[i];
			}
		}
		
		return result;		
	}


}
