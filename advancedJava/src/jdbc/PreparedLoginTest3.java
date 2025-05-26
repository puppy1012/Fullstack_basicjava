package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedLoginTest3 {
	public static void main(String[] args) {
		PreparedLoginTest3 pt = new PreparedLoginTest3();
		Scanner sc = new Scanner(System.in);
		System.out.println("*****로그인*****");
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("패스워드 : ");
		String pass = sc.next();
		pt.Login(id, pass);
	}

	public void Login(String id, String pass) {
		String url = "jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=UTC";
		String user = "shop";
		String password = "shop";
//		String sql = "select * from customer where id='" + id + "' and pass='" + pass + "'";
		String sql = "select * from customer where id=? and pass=?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection(url, user, password);
		    pstmt = con.prepareStatement(sql);
		    pstmt.setString(1, id);
		    pstmt.setString(2, pass);
		    rs = pstmt.executeQuery();

		    if (rs.next()) {
		        System.out.println("로그인성공");
		    } else {
		        System.out.println("로그인실패");
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (rs != null) rs.close();
		        if (pstmt != null) pstmt.close();
		        if (con != null) con.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}

	}
}