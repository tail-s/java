package boardex;

public class UserManager {
	
	private int MAX_USER_SIZE = 100;
	private User loginUser = null;
	private User[] users = new User[MAX_USER_SIZE];
	private int userSize = 0;
	
	public int getUserSize() {
		return userSize;
	}

	public User getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(User loginUser) {
		this.loginUser = loginUser;
	}

	public void signup(User user) {
		for(int i=0; i<this.userSize; i++) {
			if(users[i].getUserId()==user.getUserId()) {
				System.out.println("�̹� �����ϴ� ���̵��Դϴ�.");
				break;
			}
		}
		users[this.userSize++] = user;
	}
	
	public User login(String id, String password) {
		for(int i=0; i<this.userSize; i++) {
			if(users[i].getUserId().equals(id)) {
				if(users[i].getPassword().equals(password)) {
					return users[i];
				}
				else {
					System.out.println("��й�ȣ�� �ٽ� Ȯ���ϼ���.");
				}
			}
		}
		System.out.println("��ϵ��� ���� ������Դϴ�.");
		return null;
	}
	
	public void logout() {
		setLoginUser(null);
	}
	
	public User getUser(int userSeq) {
		for(int i=0; i<this.userSize; i++) {
			if(users[i].getUserSeq()==userSeq) {
				return users[i];
			}
		}
		System.out.println("�������� �ʴ� ������Դϴ�.");
		return null;
	}

}
