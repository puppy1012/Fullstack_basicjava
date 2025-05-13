package HardExam.Factory;

public class CarFactory extends Factory implements IWorkingTogether{
	
	public CarFactory(String name, int openHour, int closeHour) {
		// TODO Auto-generated constructor stub
		super(name,openHour,closeHour);
	}

	@Override
	public int makeProducts(char skill) {
		// TODO Auto-generated method stub
		int num;
		if(skill=='A') {
			num=3;
		}else if(skill=='B') {
			num=2;
		}else if(skill=='C') {
			num=1;
		}else {
			num=0;
		}
		return num*getWorkingTime();
	}

	@Override
	public int workTogether(IWorkingTogether partner) {
		if (partner instanceof CarFactory) {
	        CarFactory carPartner = (CarFactory) partner;
	        return carPartner.makeProducts('B'); 
		}
		return 0;
	}
}


