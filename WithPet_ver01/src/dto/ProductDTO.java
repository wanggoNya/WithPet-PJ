package dto;

public class ProductDTO {
	private String id;
	private String name; // 츄르
	private String content;
	private String price;
	private String image; //
	
	//********************************* getter
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getPrice() {
		return price;
	}
	public String getImage() {
		return image;
	}
	
	//********************************* setter
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	//********************************* Constructor
	public ProductDTO(String id, String name, String price, String image) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
	}
	
	public ProductDTO() {
		super();
	}
	//********************************* toString
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + "]";
	}
}