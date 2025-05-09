package oop.basic.chap05.constructor;

public class Constructor {
    private String name;
    private String id;
    private String pass;
    private String addr;
    private String telNum;
    private String ssn;
    private String nickName;
    private int point;
    public Constructor() {
    	System.out.println("�⺻������");
    }
    public Constructor(String name, String id, String pass) {
    	this.name=name;
    	this.id=id;
    	this.pass=pass;
    	System.out.println("�Ű�����3�� ������");
    }
    
	public Constructor(String name, String id, String pass, String addr, String telNum, String ssn) {
		
		this(name,id,pass);
		this.addr = addr;
		this.telNum = telNum;
		this.ssn = ssn;
		System.out.println("�Ű�����6�� ������");
	}
	public Constructor(String name, String id, String pass, String addr, String telNum, String ssn, String nickName,
			int point) {
		this(name,id,pass,addr,telNum,ssn);
		this.nickName = nickName;
		this.point = point;
		System.out.println("�Ű�����8�� ������");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
