package dto;

public class HotelDTO {
	private String id;
	private String name;
	private String content;
	private String address;	
	private String zipcode; 
	private String cover;	
	private String price;	
	private String discountPrice;	
	//animalType을 string으로 4자리 받아 토크닝 후 db에 저장
	private String phoneNumber;
	private String state;
	private String userId;
	private String dog;
	private String cat;
	private String bird;
	private String etc;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDog() {
		return dog;
	}
	public void setDog(String dog) {
		this.dog = dog;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getBird() {
		return bird;
	}
	public void setBird(String bird) {
		this.bird = bird;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public HotelDTO(String id, String name, String content, String address, String zipcode, String cover, String price,
			String discountPrice, String phoneNumber, String state, String userId, String dog,
			String cat, String bird, String etc, String status) {
		this.id = id;
		this.name = name;
		this.content = content;
		this.address = address;
		this.zipcode = zipcode;
		this.cover = cover;
		this.price = price;
		this.discountPrice = discountPrice;
		this.phoneNumber = phoneNumber;
		this.state = state;
		this.userId = userId;
		this.dog = dog;
		this.cat = cat;
		this.bird = bird;
		this.etc = etc;
		this.status = status;
	}
	

	@Override
	public String toString() {
		return "HotelDTO [id=" + id + ", name=" + name + ", content=" + content + ", address=" + address + ", zipcode="
				+ zipcode + ", cover=" + cover + ", price=" + price + ", discountPrice=" + discountPrice
				+ ", animalType=" + ", phoneNumber=" + phoneNumber + ", state=" + state + ", userId="
				+ userId + ", dog=" + dog + ", cat=" + cat + ", bird=" + bird + ", etc=" + etc + ", status=" + status
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getContent()=" + getContent()
				+ ", getAddress()=" + getAddress() + ", getZipcode()=" + getZipcode() + ", getCover()=" + getCover()
				+ ", getPrice()=" + getPrice() + ", getDiscountPrice()=" + getDiscountPrice() + ", getAnimalType()="
				+  ", getPhoneNumber()=" + getPhoneNumber() + ", getState()=" + getState()
				+ ", getUserId()=" + getUserId() + ", getDog()=" + getDog() + ", getCat()=" + getCat() + ", getBird()="
				+ getBird() + ", getEtc()=" + getEtc() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
