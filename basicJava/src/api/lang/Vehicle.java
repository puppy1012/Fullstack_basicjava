package api.lang;

public class Vehicle {
	private Owner owner;
	private int price;
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public Vehicle() {
	}
	public Vehicle(Owner owner) {
		super();
		this.owner = owner;
	}
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)return true;
		if (obj == null | this.getClass() != obj.getClass())return false;
		if(obj instanceof Vehicle) {
			Vehicle vehicle = (Vehicle) obj;
			if(this.owner.equals(vehicle.owner)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "소유주정보 : " + owner + "\n" + " 차량정보 : 가격은 " + price + " 입니다.";
	}

}
