package boardex;

import java.util.Date;

public class Comment {
	
	private int commentId;
	private int articleId;
	private int userSeq;
	private String content;
	private Date regDate;
	
	public Comment() {
	}

	public Comment(int commentId, int articleId, int userSeq, String content) {
		this.commentId = commentId;
		this.articleId = articleId;
		this.userSeq = userSeq;
		this.content = content;
		this.regDate = new Date();
	}
		
	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Comment [commentId="+getCommentId()+", articleId="+getArticleId()+", userSeq="+getUserSeq()+", content="+getContent()+", regDate="+getRegDate()+"]";
	} 

}
