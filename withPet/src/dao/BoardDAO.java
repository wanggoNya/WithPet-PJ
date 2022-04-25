package dao;
import java.sql.*;
import java.util.ArrayList;

import javax.naming.NamingException;

import dao.*;
import dto.BoardDTO;
import util.ConnectionPool;

public class BoardDAO {
   public ArrayList<BoardDTO> GuardianEncyclopediaGetList() 
         throws NamingException, SQLException{
      Connection conn=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      try {
         String sql="SELECT * FROM GuardianEncyclopedia where status=1 ";
         
         conn=ConnectionPool.get();
         pstmt=conn.prepareStatement(sql);
         rs=pstmt.executeQuery();
         
         ArrayList<BoardDTO> boards=new ArrayList<BoardDTO>();
         
            while(rs.next()) {
               boards.add(new BoardDTO(rs.getString("id"),
                                  rs.getString("title"),
                                     rs.getString("content"),
                                     rs.getString("adminId"),
                                     rs.getString("creatAt"),
                                     rs.getString("status")
                      ));
             }

         return boards;
      }finally {
         if(rs !=null) rs.close();
         if(pstmt !=null) pstmt.close();
         if(conn !=null) conn.close();
      }
   }
   public BoardDTO GuardianEncyclopediaGetDetail(String title) throws NamingException, SQLException {
      Connection conn=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      
      try {
         String sql="SELECT * FROM GuardianEncyclopedia WHERE title = ? AND status=1";
         
         conn=ConnectionPool.get();
         pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, title);
         rs=pstmt.executeQuery();
         
         rs.next();
         
         BoardDTO board= new BoardDTO(
               rs.getString("id"),
               rs.getString("title"),
               rs.getString("content"),
               rs.getString("adminId"),
               rs.getString("creatAt"),
               rs.getString("status"));
               

         return board;
            
   }finally {
      if(rs !=null) rs.close();
      if(pstmt !=null) pstmt.close();
      if(conn !=null) conn.close();
      }
   
   }
   
   public int insertGuardianEncyclopedia(String title, String content, String Id
         ) throws NamingException, SQLException {

      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      int id = 0;
      try {
         String sql = "INSERT INTO GuardianEncyclopedia (title, content, adminId) " + 
               "VALUES (?,?,?)";
         conn = ConnectionPool.get();
         pstmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
         pstmt.setString(1, title);
         pstmt.setString(2, content);
         pstmt.setString(3, Id);
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
      
      public int updateGuardianEncyclopedia(String id, String title, String content
            ) throws NamingException, SQLException {
         Connection conn = null;
         PreparedStatement pstmt = null;
         try {
            String sql = "UPDATE GuardianEncyclopedia SET " 
                  + "title=?, content=? "
                  + "WHERE id=? AND status=1 ";
            conn = ConnectionPool.get();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setString(3, id);
            
            int result = pstmt.executeUpdate();
            return result;

         } finally {
            if (pstmt != null)
               pstmt.close();
            if (conn != null)
               conn.close();
         }
      }
      public int deleteGuardianEncyclopedia(String id) throws NamingException, SQLException {
         Connection conn = null;
         PreparedStatement pstmt = null;
         try {
            String sql = "UPDATE GuardianEncyclopedia SET status=0 " 
                     + "WHERE id=? AND status=1 ";
            conn = ConnectionPool.get();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);

            int result = pstmt.executeUpdate();
            return result;

         } finally {
            if (pstmt != null)
               pstmt.close();
            if (conn != null)
               conn.close();
         }
      }
//*********************************************************


}