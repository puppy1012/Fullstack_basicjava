package oop.inheritance.chap07;

//�Ϲ�ȭ��Ų��
public class ����after{
	public static void main(String[] args) {
		��after ���� = new ��after();
		����.�̸�="����";
		����.�̵����="��";
		����.set������(5);
		����.�̵��ϴ�();

		������after �̱�������=new ������after();
		�̱�������.�̸�="��������";
		�̱�������.�̵����="������";
		�̱�������.�̵��ϴ�();
  }
 
}
//��� Ŭ������ �ߺ��Ǵ� ������ �����ؼ� Ŭ������ �ϳ� ���� - �Ϲ�ȭ ��Ų��.

class ����{
	String �̸�;
	String �̵����;
	public void �̵��ϴ�(){
		System.out.println(�̵����+"���� �̵���");
	}
}
class ��after extends ����{
	int ������;
	public void set������(int ������){
    	this.������ = ������;
	}
}
class ������after extends ����{
    int ��������;
    public void set��������(int ��������){
    	this.�������� = ��������;
	}
}
class �ڳ���after extends ����{
	int ��ũ��;
	public void set��ũ��(int ��ũ��){
		this.��ũ�� = ��ũ��;
	}
}
class ��after extends ����{
	int �������̱���;
	public void set�������̱���(int �������̱���){
		this.�������̱��� = �������̱���;
	}
}