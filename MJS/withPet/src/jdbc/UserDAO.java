package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.naming.NamingException;
import dto.UserDTO;
import util.ConnectionPool;

public class UserDAO {

	public ArrayList<UserDTO> getList() throws NamingException, SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM user where status=1";

			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			ArrayList<UserDTO> users = new ArrayList<UserDTO>();

			while (rs.next()) {
				users.add(new UserDTO(rs.getInt("id"), 
						rs.getString("account"), 
						rs.getString("password"),
						rs.getString("name"), 
						rs.getString("email"), 
						rs.getDate("birthday"),
						rs.getString("phoneNumber"), 
						rs.getString("grade")));
			}
			return users;

		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}

	public UserDTO getDetail(String id) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM user WHERE id = ? AND status=1 ";

			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			rs.next();

			UserDTO board = new UserDTO(rs.getInt("id"), 
					rs.getString("account"), 
					rs.getString("password"),
					rs.getString("name"), 
					rs.getString("email"), 
					rs.getDate("birthday"), 
					rs.getString("phoneNumber"),
					rs.getString("grade"));

			return board;

		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}

	}

	public int insertUser(String account, String password, String name, String email, Date birthday, String phoneNumber,
			String grade) throws NamingException, SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int id = 0;
		try {
			String sql = "INSERT INTO User (grade, birthday, email, name, phonenumber, account, password) "
					+ "VALUES (?,?,?,?,?,?,?,?) ";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, grade);
			pstmt.setDate(2, (java.sql.Date) birthday);
			pstmt.setString(3, email);
			pstmt.setString(4, name);
			pstmt.setString(5, phoneNumber);
			pstmt.setString(6, account);
			pstmt.setString(7, password);

			pstmt.executeUpdate();

			rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				id = rs.getInt(1);
			}

			return id;

		} finally {

			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}

	// 개인정보변경 메소드
	public int updateUser(String account, String password, String name, String email, Date birthday, String phoneNumber,
			String grade) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			String sql = "UPDATE User SET " + "grade=?, birthday=?, email=?, name=?, phonenumber=?, password=? "
					+ "WHERE account=?";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, grade);
			pstmt.setDate(2, (java.sql.Date) birthday);
			pstmt.setString(3, email);
			pstmt.setString(4, name);
			pstmt.setString(5, phoneNumber);
			pstmt.setString(6, password);
			pstmt.setString(7, account);

			int result = pstmt.executeUpdate();
			return result;

		} finally {

			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}

	// 비밀번호 변경 메소드
	public int pwUpdateUser(String account, String password) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			String sql = "UPDATE User SET password=? " + "WHERE account=?";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2, account);
			int result = pstmt.executeUpdate();
			return result;
		} finally {

			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}

	// 계정 삭제 메소드(실제로는 유저 휴먼 상태로 변경 후 검색상 탈퇴한 회원 입니다 표시)
	public int deleteUser(String account) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			String sql = "UPDATE User SET status=0 " + "WHERE account=?";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account);

			int result = pstmt.executeUpdate();
			return result;

		} finally {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}

	public int login(String account, String password) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT id, password FROM user WHERE account=? AND status=1";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account);
			rs = pstmt.executeQuery();

			if (!rs.next())
				return 1; // 회원이 아닌 경우
			if (!password.equals(rs.getString("password")))
				return 2; // 패스워트 틀린경우
			return rs.getInt("id");

		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}

	// 계정 인증 화면을 띄우기 위해 아이디, 이메일 , 생년월일이 동일한지 확인하는 sql 쿼리
	public int userCode(String account, String email, Date birthday) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT email, birthday FROM user WHERE account=? AND status=1";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account);
			rs = pstmt.executeQuery();

			if (!rs.next())
				return 1; // 회원이 아닌 경우 "회원이 아닙니다"
			if (!email.equals(rs.getString("email")))
				return 2; // 이메일이 틀린경우 "등록된 이메일 정보와 다릅니다"
			else if (!((java.sql.Date) birthday).equals(rs.getDate("birthday")))
				return 3; // 생일이 맞지 않은 경우 "등록된 생년월일과 다릅니다."
			return 0;

		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}
}
