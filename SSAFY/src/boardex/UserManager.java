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
				System.out.println("이미 존재하는 아이디입니다.");
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
					System.out.println("비밀번호를 다시 확인하세요.");
				}
			}
		}
		System.out.println("등록되지 않은 사용자입니다.");
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
		System.out.println("존재하지 않는 사용자입니다.");
		return null;
	}

}
