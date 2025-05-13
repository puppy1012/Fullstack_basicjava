package HardExam.Factory;

public class TVFactory extends Factory implements IWorkingTogether{

	public TVFactory(String name, int openHour, int closeHour) {
		// TODO Auto-generated constructor stub
		super(name,openHour,closeHour);
	}

	@Override
	public int makeProducts(char skill) {
		// TODO Auto-generated method stub
		int num;
		if(skill=='A') {
			num=8;
		}else if(skill=='B') {
			num=5;
		}else if(skill=='C') {
			num=3;
		}else {
			num=1;
		}
		return num*getWorkingTime();
	}

	@Override
	public int workTogether(IWorkingTogether partner) {
		if (partner instanceof TVFactory) {
			TVFactory carPartner = (TVFactory) partner;
	        return carPartner.makeProducts('C'); 
		}
		return 0;
	}
}