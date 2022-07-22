package boardex;

import java.util.Scanner;

public class BoardTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean is_On = true;
		int choice;
		
		UserManager um = new UserManager();
		ArticleManager am = new ArticleManager();
		CommentManager cm = new CommentManager();
		
		while(is_On) {
			System.out.println("--------------------------------------");
			System.out.println("게시판 접속");
			System.out.println("--------------------------------------");
			System.out.println("작업을 선택하세요.");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("0. 종료");
			System.out.println("--------------------------------------");			
			choice = sc.nextInt();
			
			if(choice==1) {
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PASSWORD 입력 : ");
				String pw = sc.next();
				System.out.println("--------------------------------------");
				
				if(um.login(id, pw) == null) {
					continue;
				}
				um.setLoginUser(um.login(id, pw));				
				System.out.println("로그인 성공");
				
				while(um.getLoginUser()!=null) {
					
					System.out.printf("%s님 환영합니다.\n", um.getLoginUser().getNickName());
					System.out.println("--------------------------------------");
					System.out.println("게시글 목록");
					
					Article[] list = am.getArticleList();
					for(Article article : list) {
						System.out.println(article.getArticleId() + " | 제목 : " + article.getTitle());
					}
					
					System.out.println("--------------------------------------");
					System.out.println("1. 게시글 작성");
					System.out.println("2. 게시글 선택");
					System.out.println("3. 로그아웃");
					System.out.println("0. 종료");
					System.out.println("--------------------------------------");
					int subChoice = sc.nextInt();
					if(subChoice==1) {
						sc.nextLine();
						int articleId = am.getArticleSize();
						System.out.println("제목을 입력하세요.");
						String title = sc.nextLine();
						System.out.println("내용을 입력하세요.");
						String content = sc.nextLine();
						
						Article article = new Article(articleId, title, content, um.getLoginUser().getUserSeq(), 0);
						am.addArticle(article);						
					}
					else if(subChoice==2) {
						System.out.print("게시글 선택 : ");
						int arti_select = sc.nextInt();
						Article selected = am.getArticle(arti_select);
						selected.setViewCnt(selected.getViewCnt()+1);
						
						System.out.println("--------------------------------------");
						System.out.println("제목 : " + selected.getTitle());
						System.out.println("작성자 : " + um.getUser(selected.getUserSeq()).getNickName());
						System.out.println("조회수 : " + selected.getViewCnt());
						System.out.println("작성일 : " + selected.getRegDate());
						System.out.println("내용 : " + selected.getContent());
						System.out.println("--------------------------------------");
						
						Comment[] this_Article = cm.getCommentList(selected.getArticleId());
						System.out.println("총 댓글의 수 : " + this_Article.length);
						
						for(Comment c : this_Article) {
							System.out.println(c.getCommentId() + " |  " + c.getContent() + " | 작성자 : " + um.getUser(c.getUserSeq()));
						}
						
						System.out.println("--------------------------------------");
						System.out.println("1. 게시글 삭제");
						System.out.println("2. 댓글 작성");
						System.out.println("3. 댓글 삭제");
						System.out.println("0. 종료");
						System.out.println("--------------------------------------");
						
						int arti_Choice = sc.nextInt();
						if(arti_Choice==1) {
							System.out.println("삭제할 게시글 번호 : ");
							int a_selected = sc.nextInt();
							am.removeArticle(a_selected);
							cm.removeArticle(a_selected);
						}
						else if(arti_Choice==2) {
							sc.nextLine();
							int commentId = cm.getCommentSize();
							int articleId = selected.getArticleId();
							int userSeq = um.getLoginUser().getUserSeq();
							System.out.print("댓글 내용 : ");
							String content = sc.nextLine();
							
							Comment c = new Comment(commentId, articleId, userSeq, content);
							cm.addComment(c);		
						}
						else if(arti_Choice==3) {
							System.out.println("삭제할 댓글 번호 : ");
							int c_selected = sc.nextInt();
							cm.removeComment(c_selected);
							System.out.println("삭제 완료");
							System.out.println("--------------------------------------");							
						}
						else if(arti_Choice==0) {
							continue;
						}
						else {
							System.out.println("잘못 입력하셨습니다.\n메인 화면으로 되돌아갑니다.");
							System.out.println("--------------------------------------");							
						}
					}
					else if(subChoice==3) {
						um.logout();
					}
					else if(subChoice==0) {
						System.out.println("프로그램을 종료합니다.");
						um.logout();
						is_On = false;
					}
					else {
						System.out.println("잘못 입력하셨습니다.");
					}					
				}			
			}
			else if(choice==2) {	
				int userSeq = um.getUserSize();
				System.out.println("사용하실 아이디를 입력하세요.");
				String userId = sc.next();
				System.out.println("사용하실 비밀번호를 입력하세요.");
				String password = sc.next();
				System.out.println("사용자의 이름을 입력하세요.");
				String userName = sc.next();
				System.out.println("사용하실 닉네임을 입력하세요.");
				String nickName = sc.next();
				System.out.println("이메일 주소를 입력하세요.");
				String email = sc.next();
				
				User user = new User(userSeq, userId, password, userName, nickName, email);
				um.signup(user);
				System.out.println("--------------------------------------");
				System.out.println("회원가입이 완료되었습니다.");
			}
			else if(choice==0) {
				System.out.println("프로그램을 종료합니다.");
				is_On = false;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}		
		sc.close();

	}

}
