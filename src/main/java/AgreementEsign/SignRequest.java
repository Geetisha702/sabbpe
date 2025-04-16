package AgreementEsign;

import java.util.List;

public class SignRequest {
    private Document document;
    private List<Signer> signers;
    private int txn_expiry_min;
    private String esign_type = "AADHAAR";
    private boolean send_invite = true;
    private String signing_type = "PARALLEL";
    private String response_url;
    private String redirect_url;
    private String task_id;
    private List<SignCoordinate> sign_coordinates;
	public List<SignCoordinate> getSign_coordinates() {
		return sign_coordinates;
	}
	public void setSign_coordinates(List<SignCoordinate> sign_coordinates) {
		this.sign_coordinates = sign_coordinates;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public List<Signer> getSigners() {
		return signers;
	}
	public void setSigners(List<Signer> signers) {
		this.signers = signers;
	}
	public int getTxn_expiry_min() {
		return txn_expiry_min;
	}
	public void setTxn_expiry_min(int txn_expiry_min) {
		this.txn_expiry_min = txn_expiry_min;
	}
	public String getEsign_type() {
		return esign_type;
	}
	public void setEsign_type(String esign_type) {
		this.esign_type = esign_type;
	}
	public boolean isSend_invite() {
		return send_invite;
	}
	public void setSend_invite(boolean send_invite) {
		this.send_invite = send_invite;
	}
	public String getSigning_type() {
		return signing_type;
	}
	public void setSigning_type(String signing_type) {
		this.signing_type = signing_type;
	}
	public String getResponse_url() {
		return response_url;
	}
	public void setResponse_url(String response_url) {
		this.response_url = response_url;
	}
	public String getRedirect_url() {
		return redirect_url;
	}
	public void setRedirect_url(String redirect_url) {
		this.redirect_url = redirect_url;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
  
 
}
