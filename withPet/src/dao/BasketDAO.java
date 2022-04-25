package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.NamingException;
import dto.BasketDTO;
import util.ConnectionPool;

public class BasketDAO {
		public ArrayList<BasketDTO> getProductList() 
				throws NamingException, SQLException {
	      
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      
	      try {
	    	  	String sql = "SELECT * FROM basket";
				 conn = ConnectionPool.get();
				 pstmt = conn.prepareStatement(sql);
				 rs = pstmt.executeQuery();
	
			 ArrayList<BasketDTO> baskets = new ArrayList<BasketDTO>();
			
			 while (rs.next()) {
				 baskets.add(new BasketDTO(rs.getString("id"), 
			                         rs.getString("userid"), 
			                         rs.getString("productid"), 
			                         rs.getString("staus")));
			                              
			         } return baskets;
			         
			   } finally {
			      if (rs != null)
			         rs.close();
			      if (pstmt != null)
			         pstmt.close();
			      if (conn != null)
			         conn.close();
			   }
      
      
}
	
	public int insertBasket(String userid, String productid
	         ) throws NamingException, SQLException {
	
			   Connection conn = null;
			   PreparedStatement pstmt = null;
			   ResultSet rs = null;
			   int id = 0;
			   try {
			      String sql = "INSERT INTO basket (userid, productid) "
			+ "VALUES (?,?) ";
			  conn = ConnectionPool.get();
			  pstmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			  
			  pstmt.setInt(1, Integer.parseInt(userid));
			  pstmt.setInt(2, Integer.parseInt(productid));
			
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
	
	public int deleteOneBasket(String userid, String productid
			) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			String sql = "UPDATE basket SET status=0 " 
					+ "WHERE productid=? AND status=1 ";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(productid));
			
			int result = pstmt.executeUpdate();
			return result;

		} finally {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}
	
	public int deleteBasket(String userid, String productid
			) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			String sql = "UPDATE basket SET status=0 " 
					+ "WHERE userid=? AND status=1 ";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(userid));
			
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
