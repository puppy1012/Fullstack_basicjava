package oop.basic.chap05.prob;

class Score{
	private String name;
	private int korean;
	private int english;
	private int math;
	private int total;
	private double avg;
	
	public int getKorean() {
		return korean;
	}
	public int getEnglish() {
		return english;
	}
	public int getMath() {
		return math;
	}
	public int getTotal() {
		return total;
	}
	public double getAvg() {
		return avg;
	}
	public Score(String name, int korean, int english, int math) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.korean=korean;
		this.english=english;
		this.math=math;
		total=korean+english+math;
		avg=(double)total/3;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",name,korean,english,math,total,avg);
	}

}

public class ScoreTest{
   public static void main(String []args){
      int totalScore = 0;
      Score s1 = new Score("ȫ�浿", 10, 20, 30);
      Score s2 = new Score("���ڹ�", 50, 40, 60);
      Score s3 = new Score("�̵��", 70, 100, 50);
      
      System.out.println("�̸�\t����\t����\t����\t����\t���");
    //�Ѱ�� ����, ����, ����, ����, ��հ��� ����Ͽ� ��µǵ���
    //�̰��� �ϼ��Ͻÿ�.
      s1.print();
      s2.print();
      s3.print();
      
      System.out.printf("��  ��\t%d\t%d\t%d\t%d\t%f",
    		  (s1.getKorean()	+s2.getKorean()	+s3.getKorean()),
    		  (s1.getEnglish()	+s2.getEnglish()+s3.getEnglish()),
    		  (s1.getMath()		+s2.getMath()	+s3.getMath()),
    		  (s1.getTotal()	+s2.getTotal()	+s3.getTotal()),
    		  (s1.getAvg()		+s2.getAvg()	+s3.getAvg())
    		  );
      
//�Ѱ�� ����, ����, ����, ����, ��հ��� ����Ͽ� ��µǵ���
//�̰��� �ϼ��Ͻÿ�.
      
   }
}