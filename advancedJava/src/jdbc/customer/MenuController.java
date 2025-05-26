package jdbc.customer;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuController {
	Scanner key = new Scanner(System.in);
	CustomerDAOImpl dao = new CustomerDAOImpl();
	public void insertMenu(){//회원등록
		System.out.println("*******고객등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("성명:");
		String name = key.next();
		System.out.print("주소:");
		String addr = key.next();
		CustomerDTO cdto= new CustomerDTO(id,pass,name,addr);
		int result=dao.insert(cdto);
		if(result>=1) {
			System.out.println("=========================");
			System.out.println("로그인해서 메인페이지 이동");
			System.out.println("=========================");
		}else {
			System.out.println("--------------------------");
			System.out.println("실패를 알려 줄 수 있는 alert실행");
			System.out.println("다시 회원가입할 수 있는 페이지로 이동");
			System.out.println("--------------------------");
		}
		
	}
	public void updateMenu(){//회원정보수정
		System.out.println("*******고객정보수정********");
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("아이디:");
		String id = key.next();
		//1~2개정도는 그냥 바로 입력해도 괜찮다.
		String result=dao.Update(id, addr);
		if(result!=null) {
			System.out.println(result);
		}else {
			System.out.println("실패");
		}
	}
	public void deleteMenu(){//회원탈퇴
		System.out.println("*******고객탈퇴********");
		System.out.print("삭제할id:");
		String id = key.next();
		int result=dao.delete(id);
		if(result>0) {
			System.out.println("================");
			System.out.println(result+"개 삭제 성공");
			System.out.println("================");
		}else {
			System.out.println("================");
			System.out.println(result+"개 삭제 실패");
			System.out.println("================");
		}
	}
	public void findByAddrMenu(){
		System.out.println("*******고객검색********");
		System.out.print("주소:");
		String addr = key.next();
		ArrayList<CustomerDTO> list=dao.findByArr(addr);
		for(CustomerDTO customer:list) {
			System.out.println("아이디 : "+customer.getId());
			System.out.println("패스워드 : "+customer.getPass());
			System.out.println("성명 : "+customer.getName());
			System.out.println("주소 : "+customer.getAddr());
			System.out.println("가입날짜 : "+customer.getRegDate());
			System.out.println("============================");
		}
		
	}
	public void loginMenu() {
		System.out.println("*******로그인********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
//		String loginUser=dao.Login(id, pass);
//		//로그인 성공하면 로그인성공!!메시지와 로그인한 사용자의 모든 정보를 출력(print호출)
//		if(loginUser!=null) {
//			System.out.println("로그인성공");
//			print(loginUser);
//		}else {
//			System.out.println("로그인실패");
//		}
		//로그인 실패하면 로그인실패!!메시지를 출력
	}
	public void selectMenu(){
		System.out.println("*******사원조회********");
		//여기에서MemberDAO의 메소드를 호출하세요 - 전체사원조회
		ArrayList<CustomerDTO> list=dao.Select();
		for(CustomerDTO customer: list) {
			System.out.println("아이디 : "+customer.getId());
			System.out.println("패스워드 : "+customer.getPass());
			System.out.println("성명 : "+customer.getName());
			System.out.println("주소 : "+customer.getAddr());
			System.out.println("가입날짜 : "+customer.getRegDate());
			System.out.println("============================");
		}
	}
	public void myPageMenu() {
		System.out.println("*******마이페이지********");
		System.out.print("아이디:");
		String id = key.next();
		
//		if(user==null) {
//			System.out.println("일치하는 사용자가 없습니다.");
//		}else {
//			print(user);
//		}
	}
//	public void print(MemberDTO user) {
//		System.out.print(user.getId()+"\t");
//		System.out.print(user.getPass()+"\t");
//		System.out.print(user.getName()+"\t");
//		System.out.print(user.getAddr()+"\t");
//		System.out.print(user.getRegDate()+"\t");
//	
//	}
	
	
}













