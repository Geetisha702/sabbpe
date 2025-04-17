package AgreementEsign;

import java.util.List;

public class Signer {
    private String signer_name;
    private String signer_email;
    private String signer_phone_number;
    private boolean location_capture;
    private boolean photo_capture;
    private String signer_city;
    private String signer_purpose;
//    private List<SignCoordinate> sign_coordinates;
    public String getSigner_name() {
		return signer_name;
	}
	public void setSigner_name(String signer_name) {
		this.signer_name = signer_name;
	}
	public String getSigner_email() {
		return signer_email;
	}
	public void setSigner_email(String signer_email) {
		this.signer_email = signer_email;
	}
	public String getSigner_phone_number() {
		return signer_phone_number;
	}
	public void setSigner_phone_number(String signer_phone_number) {
		this.signer_phone_number = signer_phone_number;
	}
	public boolean isLocation_capture() {
		return location_capture;
	}
	public void setLocation_capture(boolean location_capture) {
		this.location_capture = location_capture;
	}
	public boolean isPhoto_capture() {
		return photo_capture;
	}
	public void setPhoto_capture(boolean photo_capture) {
		this.photo_capture = photo_capture;
	}
	public String getSigner_city() {
		return signer_city;
	}
	public void setSigner_city(String signer_city) {
		this.signer_city = signer_city;
	}
	public String getSigner_purpose() {
		return signer_purpose;
	}
	public void setSigner_purpose(String signer_purpose) {
		this.signer_purpose = signer_purpose;
	}
//	public List<SignCoordinate> getSign_coordinates() {
//		return sign_coordinates;
//	}
//	public void setSign_coordinates(List<SignCoordinate> sign_coordinates) {
//		this.sign_coordinates = sign_coordinates;
//	}
//	
    // Getters and Setters
}
