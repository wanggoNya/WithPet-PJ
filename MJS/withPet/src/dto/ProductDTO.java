package dto;

public class ProductDTO {
	private int id;
	private String name; 
	private int price;
	private String image;
	
	//********************************* getter
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getImage() {
		return image;
	}
	
	//********************************* setter
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	//********************************* Constructor
	public ProductDTO(int id, String name, int price, String image) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
	}
	
	//********************************* toString
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + "]";
	}
}
