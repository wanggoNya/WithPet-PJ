package jdbc;

public class ProductDTO {
   private String id;        //상품아이디
   private String name;      //상품이름
   private String price;     //상품가격
   private String image;
public String getId() {
	return id;
}
public String getName() {
	return name;
}
public String getPrice() {
	return price;
}
public String getImage() {
	return image;
}
public ProductDTO(String id, String name, String price, String image) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.image = image;
} 
   


}