package AgreementEsign;

import java.util.List;

public class ResponseUrl {
	
	private List<RequestUrl> requests;
	private String group_id;
	private String task_id;
	private boolean success;
	private String webhook_security_key;
	private String request_timestamp;
	private String expires_at;
	public List<RequestUrl> getRequests() {
		return requests;
	}
	public void setRequests(List<RequestUrl> requests) {
		this.requests = requests;
	}
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getWebhook_security_key() {
		return webhook_security_key;
	}
	public void setWebhook_security_key(String webhook_security_key) {
		this.webhook_security_key = webhook_security_key;
	}
	public String getRequest_timestamp() {
		return request_timestamp;
	}
	public void setRequest_timestamp(String request_timestamp) {
		this.request_timestamp = request_timestamp;
	}
	public String getExpires_at() {
		return expires_at;
	}
	public void setExpires_at(String expires_at) {
		this.expires_at = expires_at;
	}
		
}
