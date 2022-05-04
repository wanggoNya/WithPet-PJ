package dto;

public class UserDTO {
	private String id; 
	private String account; //계정 아이디
	private String password;	//계정비밀번호
	private String name; // 보호자이름
	private String email;	//이메일
	private String birthday;	//보호자 생년월일
	private String phoneNumber;	//보호자 핸드폰 번호
	private String	grade;	// 유저 종류 번호 (default = 1로 nomal유저)
	private String	status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public String getAccount() {
		return account;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getBirthday() {
		return birthday;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getGrade() {
		return grade;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public UserDTO(String id, String account, String password, String name, String email, String birthday,
			String phoneNumber, String grade, String status) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.name = name;
		this.email = email;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.grade = grade;
		this.status = status;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", account=" + account + ", password=" + password + ", name=" + name + ", email="
				+ email + ", birthday=" + birthday + ", phoneNumber=" + phoneNumber + ", grade=" + grade + ", status="
				+ status + "]";
	}
	


}