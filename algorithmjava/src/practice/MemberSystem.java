package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberSystem {
	static MemberMgr mgr ;
	public static void main(String[] args) {

		init();
		while(true) {
			Scanner key = new Scanner(System.in);
			System.out.println("*********�λ�����ý���********");
			System.out.println("1. �α���");
			System.out.println("2. ȸ�����");
			System.out.println("3. ȸ����ȸ");
			System.out.println("4. ȸ����������");
			System.out.print("���ϴ� �۾��� �����Ͻʽÿ�");
			int job= key.nextInt();
			if (job==2) {
				System.out.println("ȸ�����̵�:");
				String id=key.next();
				System.out.println("ȸ���̸�:");
				String name=key.next();
				System.out.println("����:");
				int age= key.nextInt();
				mgr.addMember(new Member(id,name,age));
			}else if(job==3) {
	        	//BookMgr�� print�޼ҵ带 ȣ���ؼ� ��ȸ
	        	mgr.print();
	        }else if(job==5) {
	        	System.exit(0);
	        }
		}
		
	
	}
	public static void init() {
		//MemberŬ������ ���Ƿ� 5�� ����� �� �ֵ��� �����ϼ���
		ArrayList<Member>memberlist=new ArrayList<Member>();
		memberlist.add(new Member("ȸ������","ȯ��",7942));
		//mgr = new MemberMgr(�迭);
		mgr=new MemberMgr(memberlist);
	}
}

