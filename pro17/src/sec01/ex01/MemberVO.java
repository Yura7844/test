package sec01.ex01;

public class MemberVO {

	
	
	
	
	
	
	
	
	
	
	
	
	
	public MemberVO(String id, String pwd, String name, String email) {
		super();
		this.id= id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}
	
	
	
	public MemberVO(String id, String pwd, String name, String email, Date joinDate) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.joinDate = joinDate;
	}
}
