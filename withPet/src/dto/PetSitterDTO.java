package dto;

public class PetSitterDTO {
   private String id;
   private String image;
   private String content;
   private String certificated; //사진 웹으로 올리는 경로 dao 메소드 구현
   private String address;
   private String dog;
   private String cat;
   private String bird;
   private String etc;
   private String phoneNumber;
   private String userId;
   private String status;
   
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getCertificated() {
	return certificated;
}
public void setCertificated(String certificated) {
	this.certificated = certificated;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
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
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public PetSitterDTO(String id, String image, String content, String certificated, String address, String dog,
		String cat, String bird, String etc, String phoneNumber, String userId, String status) {
	super();
	this.id = id;
	this.image = image;
	this.content = content;
	this.certificated = certificated;
	this.address = address;
	this.dog = dog;
	this.cat = cat;
	this.bird = bird;
	this.etc = etc;
	this.phoneNumber = phoneNumber;
	this.userId = userId;
	this.status = status;
}
@Override
public String toString() {
	return "PetSitterDTO [id=" + id + ", image=" + image + ", content=" + content + ", certificated=" + certificated
			+ ", address=" + address + ", dog=" + dog + ", cat=" + cat + ", bird=" + bird + ", etc=" + etc
			+ ", phoneNumber=" + phoneNumber + ", userId=" + userId + ", status=" + status + "]";
}
   
   
}