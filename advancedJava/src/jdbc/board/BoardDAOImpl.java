package jdbc.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.customer.DBUtil;

//Customer테이블을 액세스하는 모든 기능을 구현
public class BoardDAOImpl {
	//회원등록
	public int insert(BoardDTO board) {
		String sql = "insert into board values(?,?,?,?,?,sysdate())";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, board.getId());
			ptmt.setInt(2, 0);
			ptmt.setString(3, board.getTitle());
			ptmt.setString(4, board.getWriter());
			ptmt.setString(5, board.getContent());
			result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삽입성공");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
}

