package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.NamingException;
import dto.AnimalDTO;
import util.ConnectionPool;

public class AnimalDAO {
	public ArrayList<AnimalDTO> animalGetList() throws NamingException, SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM fosteranimal where status=1";

			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			ArrayList<AnimalDTO> animals = new ArrayList<AnimalDTO>();

			while (rs.next()) {
				animals.add(new AnimalDTO(rs.getString("id"), 
						rs.getString("name"), 
						rs.getString("type"),
						rs.getString("birthday"), 
						rs.getString("sex"),
						rs.getString("userId"), 
						rs.getString("status")
						
						));
			}
			return animals;

		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
		
	}
		
		public AnimalDTO getAnimalDetail(String id) throws NamingException, SQLException {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			try {
				String sql = "SELECT * FROM fosteranimal WHERE id = ? AND status=1 ";

				conn = ConnectionPool.get();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				rs.next();

				AnimalDTO animals = new AnimalDTO(rs.getString("id"), 
													rs.getString("name"), 
													rs.getString("type"), 
													rs.getString("birthday"),
													rs.getString("sex"),
													rs.getString("userId"),
													rs.getString("status")
													);

				return animals;

			} finally {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			}
		}

		
		
		public int insertAnimal(String name, String type, String birthday, String sex, String userId
				) throws NamingException, SQLException {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			int id = 0;
			try {
				String sql = "INSERT INTO fosteranimal (name,type, birthday, sex,userId) "
						+ "VALUES (?,?,?,?,?) ";
				conn = ConnectionPool.get();
				pstmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, name);
				pstmt.setString(2, type);
				pstmt.setString(3, birthday);
				pstmt.setString(4, sex);
				pstmt.setInt(5, Integer.parseInt(userId));

				pstmt.executeUpdate(); // db에 insert하기

				rs = pstmt.getGeneratedKeys(); // insert를 하고 나서 밖에서는 db 기본키 값 auto increasement로 뭐가 들어갔는지 안보여서 함수로 확인
				if (rs.next()) {
					id = rs.getInt(1); // id 기본키 값을 반환
				}
				return id;

			} finally {

				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			}
		}
		
		public int updateAnimal(String name,String type, String birthday, String sex, String userId, String id
				) throws NamingException, SQLException {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				String sql = "UPDATE fosteranimal SET " 
						+ "name=?, type=?, birthday=?, sex=? "
						+ "WHERE id=? AND userId=? AND status=1 ";
				conn = ConnectionPool.get();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, type);
				pstmt.setString(3, birthday);
				pstmt.setString(4, sex);
				pstmt.setInt(5,Integer.parseInt(id));
				pstmt.setInt(6,Integer.parseInt(userId));
				
				int result = pstmt.executeUpdate();
				return result;

			} finally {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			}
		}
		
		public int deleteAnimal(String id) throws NamingException, SQLException {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				String sql = "UPDATE fosteranimal SET status=0 " + "WHERE id=? AND status=1";
				conn = ConnectionPool.get();
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(id));

				int result = pstmt.executeUpdate();
				return result;

			} finally {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			}
		}
		
		
}
