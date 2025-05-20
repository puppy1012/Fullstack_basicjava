package practice;

import java.util.ArrayList;
import java.util.List;

public class MemberMgr {
	private List<Member> memberlist;
	public MemberMgr() {
		memberlist=new ArrayList<Member>();
	}
	public MemberMgr(List<Member> memberlist) {
		super();
		this.memberlist=memberlist;
	}

	public List<Member> getMemberlist() {
		return memberlist;
	}

	public void setMemberlist(List<Member> memberlist) {
		this.memberlist = memberlist;
	}
	public void addMember(Member member) {
		memberlist.add(member);
	}
	public void print() {
		// TODO Auto-generated method stub
		for(Member i : memberlist) {
			System.out.println("ȸ�����̵�:"+i.getId()+",ȸ���̸�:"+i.getName()+",ȸ������:"+i.getAge());
			
		}
	}
	
}

