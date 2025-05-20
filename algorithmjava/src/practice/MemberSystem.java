package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberSystem {
	static MemberMgr mgr ;
	public static void main(String[] args) {

		init();
		while(true) {
			Scanner key = new Scanner(System.in);
			System.out.println("*********인사관리시스템********");
			System.out.println("1. 로그인");
			System.out.println("2. 회원등록");
			System.out.println("3. 회원조회");
			System.out.println("4. 회원정보수정");
			System.out.print("원하는 작업을 선택하십시오");
			int job= key.nextInt();
			if (job==2) {
				System.out.println("회원아이디:");
				String id=key.next();
				System.out.println("회원이름:");
				String name=key.next();
				System.out.println("나이:");
				int age= key.nextInt();
				mgr.addMember(new Member(id,name,age));
			}else if(job==3) {
	        	//BookMgr의 print메소드를 호출해서 조회
	        	mgr.print();
	        }else if(job==5) {
	        	System.exit(0);
	        }
		}
		
	
	}
	public static void init() {
		//Member클래스를 임의로 5개 저장될 수 있도록 구현하세요
		ArrayList<Member>memberlist=new ArrayList<Member>();
		memberlist.add(new Member("회복포션","환자",7942));
		//mgr = new MemberMgr(배열);
		mgr=new MemberMgr(memberlist);
	}
}

