package api.lang;

public class Owner {
	private String name;
	private String cellPhone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public Owner() {
	}

	public Owner(String name, String cellPhone) {
		super();
		this.name = name;
		this.cellPhone = cellPhone;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null | this.getClass() != obj.getClass())
			return false;
		Owner owner = (Owner) obj;
		return name.equals(owner.name);
	}

	@Override
	public String toString() {
		return "이름은 " + name + "이고, 핸드폰 번호는 " + cellPhone + "입니다";
	}
}
