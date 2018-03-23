package name.lizhe.lira.module.history.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IssueHistoryBean {
	
	private int id;
	private int issue_id;
	private String operator;
	private String action;
	private Date updated_time;
	private String updated_time_formatted;
	
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIssue_id() {
		return issue_id;
	}
	public void setIssue_id(int issue_id) {
		this.issue_id = issue_id;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Date getUpdated_time() {
		return updated_time;
	}
	public void setUpdated_time(Date updated_time) {
		this.updated_time = updated_time;
	}
	public String getUpdated_time_formatted() {
		return simpleDateFormat.format(updated_time);
	}
	public void setUpdated_time_formatted(String updated_time_formatted) {
		this.updated_time_formatted = updated_time_formatted;
	}
	
	
}
