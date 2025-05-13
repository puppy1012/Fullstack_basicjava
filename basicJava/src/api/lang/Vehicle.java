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
		if (this == obj)
			return true;
		if (obj == null | this.getClass() != obj.getClass())
			return false;
		Vehicle vehicle = (Vehicle) obj;
		return owner.equals(vehicle.owner);
	}
	@Override
	public String toString() {
		return "���������� : " + owner + "\n" + " �������� : ������ " + price + " �Դϴ�.";
	}

}
