package boardex;

import java.util.Scanner;

public class BoardTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean is_On = true;
		
		UserManager um = new UserManager();
		ArticleManager am = new ArticleManager();
		CommentManager cm = new CommentManager();
		
		while(is_On) {
			System.out.println("--------------------------------------");
			System.out.println("�Խ��� ����");
			System.out.println("--------------------------------------");
			System.out.println("�۾��� �����ϼ���.");
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("0. ����");
			System.out.println("--------------------------------------");			
			int choice = sc.nextInt();
			
			if(choice==1) {
				System.out.print("ID �Է� : ");
				String id = sc.next();
				System.out.print("PASSWORD �Է� : ");
				String pw = sc.next();
				System.out.println("--------------------------------------");
				
				if(um.login(id, pw) == null) {
					continue;
				}
				um.setLoginUser(um.login(id, pw));				
				System.out.println("�α��� ����");
				
				while(um.getLoginUser()!=null) {
					
					System.out.printf("%s�� ȯ���մϴ�.\n", um.getLoginUser().getNickName());
					System.out.println("--------------------------------------");
					System.out.println("�Խñ� ���");
					
					Article[] list = am.getArticleList();
					for(Article article : list) {
						System.out.println(article.getArticleId() + " | ���� : " + article.getTitle());
					}
					
					System.out.println("--------------------------------------");
					System.out.println("1. �Խñ� �ۼ�");
					System.out.println("2. �Խñ� ����");
					System.out.println("3. �α׾ƿ�");
					System.out.println("0. ����");
					System.out.println("--------------------------------------");
					int subChoice = sc.nextInt();
					if(subChoice==1) {
						sc.nextLine();
						int articleId = am.getArticleSize();
						System.out.println("������ �Է��ϼ���.");
						String title = sc.nextLine();
						System.out.println("������ �Է��ϼ���.");
						String content = sc.nextLine();
						
						Article article = new Article(articleId, title, content, um.getLoginUser().getUserSeq(), 0);
						am.addArticle(article);						
					}
					else if(subChoice==2) {
						System.out.print("�Խñ� ���� : ");
						int arti_select = sc.nextInt();
						Article selected = am.getArticle(arti_select);
						selected.setViewCnt(selected.getViewCnt()+1);
						
						System.out.println("--------------------------------------");
						System.out.println("���� : " + selected.getTitle());
						System.out.println("�ۼ��� : " + um.getUser(selected.getUserSeq()).getNickName());
						System.out.println("��ȸ�� : " + selected.getViewCnt());
						System.out.println("�ۼ��� : " + selected.getRegDate());
						System.out.println("���� : " + selected.getContent());
						System.out.println("--------------------------------------");
						
						Comment[] this_Article = cm.getCommentList(selected.getArticleId());
						System.out.println("�� ����� �� : " + this_Article.length);
						
						for(Comment c : this_Article) {
							System.out.println(c.getCommentId() + " |  " + c.getContent() + " | �ۼ��� : " + um.getUser(c.getUserSeq()));
						}
						
						System.out.println("--------------------------------------");
						System.out.println("1. �Խñ� ����");
						System.out.println("2. ��� �ۼ�");
						System.out.println("3. ��� ����");
						System.out.println("0. ����");
						System.out.println("--------------------------------------");
						
						int arti_Choice = sc.nextInt();
						if(arti_Choice==1) {
							System.out.println("������ �Խñ� ��ȣ : ");
							int a_selected = sc.nextInt();
							am.removeArticle(a_selected);
							cm.removeArticle(a_selected);
						}
						else if(arti_Choice==2) {
							sc.nextLine();
							int commentId = cm.getCommentSize();
							int articleId = selected.getArticleId();
							int userSeq = um.getLoginUser().getUserSeq();
							System.out.print("��� ���� : ");
							String content = sc.nextLine();
							
							Comment c = new Comment(commentId, articleId, userSeq, content);
							cm.addComment(c);		
						}
						else if(arti_Choice==3) {
							System.out.println("������ ��� ��ȣ : ");
							int c_selected = sc.nextInt();
							cm.removeComment(c_selected);
							System.out.println("���� �Ϸ�");
							System.out.println("--------------------------------------");							
						}
						else if(arti_Choice==0) {
							continue;
						}
						else {
							System.out.println("�߸� �Է��ϼ̽��ϴ�.\n���� ȭ������ �ǵ��ư��ϴ�.");
							System.out.println("--------------------------------------");							
						}
					}
					else if(subChoice==3) {
						um.logout();
					}
					else if(subChoice==0) {
						System.out.println("���α׷��� �����մϴ�.");
						um.logout();
						is_On = false;
					}
					else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					}					
				}			
			}
			else if(choice==2) {	
				int userSeq = um.getUserSize();
				System.out.println("����Ͻ� ���̵� �Է��ϼ���.");
				String userId = sc.next();
				System.out.println("����Ͻ� ��й�ȣ�� �Է��ϼ���.");
				String password = sc.next();
				System.out.println("������� �̸��� �Է��ϼ���.");
				String userName = sc.next();
				System.out.println("����Ͻ� �г����� �Է��ϼ���.");
				String nickName = sc.next();
				System.out.println("�̸��� �ּҸ� �Է��ϼ���.");
				String email = sc.next();
				
				User user = new User(userSeq, userId, password, userName, nickName, email);
				um.signup(user);
				System.out.println("--------------------------------------");
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
			}
			else if(choice==0) {
				System.out.println("���α׷��� �����մϴ�.");
				is_On = false;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}		
		sc.close();

	}

}
