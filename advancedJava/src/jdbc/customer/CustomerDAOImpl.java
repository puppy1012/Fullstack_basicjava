package jdbc.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

//Customer���̺��� �������ϴ� ��� ����� ����
public class CustomerDAOImpl {
	// ȸ�����
	public int insert(CustomerDTO customer) {
		String sql = "insert into customer values(?,?,?,?,sysdate())";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnection();
			System.out.println("���Ἲ��" + con);
			ptmt = con.prepareStatement(sql);
			System.out.println("Statement��ü����=>" + ptmt);
			ptmt.setString(1, customer.getId());
			ptmt.setString(2, customer.getPass());
			ptmt.setString(3, customer.getName());
			ptmt.setString(4, customer.getAddr());
			result = ptmt.executeUpdate();
			System.out.println(result + "�� �� ���Լ���");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}

	// �α��θ޼ҵ�
	//pk�� ���� ��쿡�� ������ ��ȸ�� ���ڵ�� 1�� - ���ڵ� 1���� ���ϵǹǷ� DTO�� ��ȯ�ؼ� �����ϴ°��� �Ϲ���
	public CustomerDTO Login(String id, String pass) {
		String sql = "select * from customer where id=? and pass=?";
		CustomerDTO user =null;
		try (Connection con = DBUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			//pk�� �񱳽� ���ϰ��� ������ �Ѱ��ۿ� ���� ��� ifó��
			try (ResultSet rs = pstmt.executeQuery();) {
				if(rs.next()) {
					user= new CustomerDTO(rs.getString(1), rs.getString(2), rs.getString(3),
							rs.getString(4), rs.getDate(5));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return user;
		}

	}

	public String Update(String id, String addr) {
		String sql = "update customer set addr=? where id=?";
		String result = null;
		try (Connection con = DBUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, addr);
			pstmt.setString(2, id);
			int rs = pstmt.executeUpdate();
			// 5.������ ó��
			if (rs > 0) {
				result = rs + "�� update ����";
			} else {
				result = rs + "�� update ����";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return result;
		}
		// �ǹ������� �̸�Ŀ�ؼ��� �������� ��û�� ������ �ĳ�������
	}

	// ȸ��Ż��
	public int delete(String id) {
		String sql = "delete from customer where id=? ";
		int result = 0;
		try (// 2.DBMS�� ����
				Connection con = DBUtil.getConnection();
				// 3. SQL���� �����ϱ� ���� ��ü�� ����
				PreparedStatement ptmt = con.prepareStatement(sql);) {
			ptmt.setString(1, id);
			// 4. SQL�� ����
			int rs = ptmt.executeUpdate();
			// 5.������ ó��
			result = rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return result;
		}
	}

	// ȸ�� ��ü��� ��ȸ
	public ArrayList<CustomerDTO> findByArr(String addr) {
		String sql = "select * from customer where addr=?";
		// ��ȸ�� Customer ���̺��� ��� �����͸� ��Ƽ� ������ �ڷᱸ��
		ArrayList<CustomerDTO> customerlist = new ArrayList<CustomerDTO>();
		try (Connection con = DBUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, addr);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			while (rs.next()) {
				CustomerDTO customer = new CustomerDTO(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getDate(5));
				customerlist.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return customerlist;
		}
	}

	// ȸ�� ��ü��� ��ȸ
	// ���ڵ带 DTO�� ��ȯ�ؼ� ArrayList�� ��Ƽ� ����
	public ArrayList<CustomerDTO> Select() {
		String sql = "select * from customer";
		// ��ȸ�� Customer ���̺��� ��� �����͸� ��Ƽ� ������ �ڷᱸ��
		ArrayList<CustomerDTO> customerlist = new ArrayList<CustomerDTO>();
		try (// 2.DBMS�� ����
				Connection con = DBUtil.getConnection();
				// 3. SQL���� �����ϱ� ���� ��ü�� ����
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			// 4. SQL�� ����
			ResultSet rs = pstmt.executeQuery();
			// ��� �����Ϳ� ������ �ϴ°� �ƴ϶� sql���������� ������ �ɾ��
			while (rs.next()) {
				CustomerDTO customer = new CustomerDTO(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getDate(5));
				customerlist.add(customer);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return customerlist;
		}

	}

}
