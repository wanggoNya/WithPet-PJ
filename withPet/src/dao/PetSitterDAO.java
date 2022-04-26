package dao;

import java.sql.*;

import java.util.ArrayList;

import javax.naming.NamingException;

import dto.PetSitterDTO;
import dto.ReviewDTO;
import util.ConnectionPool;

public class PetSitterDAO {
	public ArrayList<PetSitterDTO> getList() throws NamingException, SQLException {
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;

	      try {
	         String sql = "select id, image, content, certificated,"
	         		+ "address,dog, cat, bird, etc, phoneNumber, userId, status " 
	         		+ "from persitter";
	         conn = ConnectionPool.get();
	         pstmt = conn.prepareStatement(sql);
	         rs = pstmt.executeQuery();

	         ArrayList<PetSitterDTO> petsitters = new ArrayList<PetSitterDTO>();

	         while (rs.next()) {
	            petsitters.add(new PetSitterDTO(
	            		rs.getString("id"), 
	            		rs.getString("image"), 
	            		rs.getString("content"),
	                  rs.getString("certificated"), 
	                  rs.getString("address"), 
	                  rs.getString("dog"),
                      rs.getString("cat"),
                      rs.getString("bird"),
                      rs.getString("etc"),
	                  rs.getString("phoneNumber"), 
	                  rs.getString("userId"), 
	                  rs.getString("status")));
	         }
	         return petsitters;
	      } finally {
	         if (rs != null)
	            rs.close();
	         if (pstmt != null)
	            pstmt.close();
	         if (conn != null)
	            conn.close();
	      }
	   }
	
	 public PetSitterDTO getDetail(String id) throws NamingException, SQLException{
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      
	      try {
	         String sql = "select id, image, content, certificated,"
		         		+ "address, dog, cat, bird, etc, phoneNumber, userId, status " 
		         		+ "from persitter"
		         		+ "where id=? and status=1 ";
	         
	         conn = ConnectionPool.get();
	         pstmt = conn.prepareStatement(sql);
	         rs = pstmt.executeQuery();
	         rs.next();
	         PetSitterDTO petsitter = new PetSitterDTO( rs.getString("id"),
										        		 rs.getString("image"), 
									                     rs.getString("content"), 
									                     rs.getString("certificated"),
									                     rs.getString("address"),
									                     rs.getString("dog"),
						                                 rs.getString("cat"),
						                                 rs.getString("bird"),
						                                 rs.getString("etc"),
									                     rs.getString("phoneNumber"),
									                     rs.getString("userId"),
									                     rs.getString("status"));
	       
	         return petsitter;
	      } finally {
	         if(rs != null) rs.close();
	         if(pstmt != null) pstmt.close();
	         if(conn != null) conn.close();
	      }
	      
	   }
	
   public int insertPetsitter(String image, String content, String certificated, String address, 
		   String dog, String cat, String bird, String etc ,String phoneNumber, String userId, 
		   String status) throws NamingException, SQLException {
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      int id=0;
      try {
         String sql = "INSERT INTO petsitter (image, content, certificated, address, "
         		+ "dog, cat, bird, etc, phoneNumber, userId, status) "
               + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
         conn = ConnectionPool.get();
         pstmt = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
         pstmt.setString(1, image);
         pstmt.setString(2, content);
         pstmt.setString(3, certificated);
         pstmt.setString(4, address);
         pstmt.setInt(5, Integer.parseInt(dog));
         pstmt.setInt(6, Integer.parseInt(cat));
         pstmt.setInt(7, Integer.parseInt(bird));
         pstmt.setInt(8, Integer.parseInt(etc));
         pstmt.setString(9, phoneNumber);
         pstmt.setInt(10, Integer.parseInt(userId));
         pstmt.setString(11, status);

         pstmt.executeUpdate();
         rs = pstmt.getGeneratedKeys();

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

   
   public int deletePetsitter(String id) throws NamingException, SQLException {
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      try {
	         String sql = "UPDATE petsitter SET status=0 WHERE id=?";
	         conn = ConnectionPool.get();
	         pstmt = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
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
   
//   public ArrayList<ReviewDTO> getPetSitterReviewList(String userId) throws NamingException, SQLException {
//
//	      Connection conn = null;
//	      PreparedStatement pstmt = null;
//	      ResultSet rs = null;
//
//	      try {
//	         String sql = "select id, score,content, name, userId, hotelId, creatAt, countLike, commentId, comment, commentUserId, commentUserName  " + 
//	               "from " + 
//	               "   (select C.id id, score, content, name, userId, hotelId, creatAt, countLike " + 
//	               "   from  " + 
//	               "      (select A.id id, score, content, name, userId, hotelId, A.creatAt creatAt " + 
//	               "      from HotelReview A JOIN User B on A.userId=B.id " + 
//	               "      where A.status=1 and hotelId=?) C  " + 
//	               "   join  " + 
//	               "      (select reviewId, count(*) countLike " + 
//	               "      from HotelReviewLike " + 
//	               "        where status=1 " + 
//	               "      group by reviewId) D on C.id=D.reviewId) E  " + 
//	               "join " + 
//	               "   (select F.id commentId, F.comment comment, F.userId commentUserId,  G.name commentUserName, hotelReviewId, F.status status " + 
//	               "    from HotelReviewComment F join User G on F.userId=G.id  " + 
//	               "    where F.status=1) H on E.id=H.hotelReviewId";
//
//	         conn = ConnectionPool.get();
//	         pstmt = conn.prepareStatement(sql);
//	         pstmt.setString(1, hotelId);
//	         rs = pstmt.executeQuery();
//
//	         ArrayList<ReviewDTO> hotelReviews = new ArrayList<ReviewDTO>();
//
//	         while (rs.next()) {
//	            hotelReviews.add(new ReviewDTO(rs.getString("id"), 
//	                                 rs.getString("score"),
//	                                 rs.getString("content"),
//	                                 rs.getString("name"),
//	                                 rs.getString("userId"),
//	                                 rs.getString("hotelId"),
//	                                 rs.getString("creatAt"),
//	                                 rs.getString("countLike"),
//	                                 rs.getString("commentId"),
//	                                 rs.getString("comment"),
//	                                 rs.getString("commentUserId"),
//	                                 rs.getString("commentUserName")
//	                                 ));
//	         }
//	         return hotelReviews;
//
//	      } finally {
//	         if (rs != null)
//	            rs.close();
//	         if (pstmt != null)
//	            pstmt.close();
//	         if (conn != null)
//	            conn.close();
//	      }
//	   }
   
   
   
   
   
   
   
  
}