package Switch;

public class MyMethodDemo {
	public static void printGuGu(int num) {
		for(int i=1;i<10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
	public static void MultiForGuGu() {
		for(int dan=2;dan<=9;dan++) {
			for(int i=1;i<=9;i++) {
				System.out.print(dan +" * "+i+" = "+(dan*i)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------");
		for(int i=1;i<=9;i++) {
			for(int dan=2;dan<=9;dan++) {
				System.out.print(dan +" * "+i+" = "+(dan*i)+"\t");
			}
			System.out.println();
		}
	}
	public static int Calc(int opr,int num1,int num2) {
		int result=0;
		if(opr==1) {
		    result = num1+num2;
		}else if(opr==2) {
		    result = num1*num2;
		}else if(opr==3) {
		    result = num1-num2;
		}else {
		    result = num1/num2;
		}
		return result;
	}
}
