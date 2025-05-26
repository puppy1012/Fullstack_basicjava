package jdbc.customer;
//Table�� ���ڵ带 �����ϴ� �÷��� ����ʵ�� �����Ѵ�.
//View������ -> ���̺��� ���ڵ�
//���̺��� ���ڵ� -> View�� ����

import java.util.Date;

public class CustomerDTO {
	private String id;
	private String pass;
	private String name;
	private String addr;
	private Date regDate;
	public CustomerDTO() {}
	
	//insert��
	public CustomerDTO(String id, String pass, String name, String addr) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
	}

	//select��
	public CustomerDTO(String id, String pass, String name, String addr, Date regDate) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.regDate = regDate;
	}


	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", pass=" + pass + ", name=" + name + ", addr=" + addr + ", regDate=" + regDate
				+ "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	
	
}
