package dto;

public class BasketDTO {
   
   private String id;
   private String userid;
   private String productid;
   private String staus;
   
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getUserid() {
      return userid;
   }
   public void setUserid(String userid) {
      this.userid = userid;
   }
   public String getProductid() {
      return productid;
   }
   public void setProductid(String productid) {
      this.productid = productid;
   }
   public String getStaus() {
      return staus;
   }
   public void setStaus(String staus) {
      this.staus = staus;
   }
   
   public BasketDTO(String id, String userid, String productid, String staus) {
      super();
      this.id = id;
      this.userid = userid;
      this.productid = productid;
      this.staus = staus;
   }
   
   @Override
   public String toString() {
      return "BasketDTO [id=" + id + ", userid=" + userid + ", productid=" + productid + ", staus=" + staus +"]";
   }

}