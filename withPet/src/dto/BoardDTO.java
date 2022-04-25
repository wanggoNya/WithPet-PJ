package dto;

public class BoardDTO {
   private String id;
   private String title;
   private String content;
   private String adminId;
   private String creatAt;
   private String status;
   
   //********************************* getter
   public String getId() {
      return id;
   }
   public String getTitle() {
      return title;
   }
   public String getContent() {
      return content;
   }
   public String getAdminId() {
      return adminId;
   }
   public String getCreatAt() {
      return creatAt;
   }
   public String getStatus() {
      return status;
   }
   
   //********************************* setter
   public void setId(String id) {
      this.id = id;
   }
   public void setTitle(String title) {
      this.title = title;
   }
   public void setContent(String content) {
      this.content = content;
   }
   public void setAdminId(String adminId) {
      this.adminId = adminId;
   }
   public void setCreatAt(String creatAt) {
      this.creatAt = creatAt;
   }
   public void setStatus(String status) {
      this.status = status;
   }
   
   //********************************* Constructor
   public BoardDTO(String id, String title, String content, String adminId, String creatAt, String status) {
      super();
      this.id = id;
      this.title = title;
      this.content = content;
      this.adminId = adminId;
      this.creatAt = creatAt;
      this.status = status;
   }
   
   //********************************* toString
   @Override
   public String toString() {
      return "BoardDTO [id=" + id + ", title=" + title + ", content=" + content + ", adminId=" + adminId + ", creatAt=" + creatAt + ", status=" + status + "]";
   }
}