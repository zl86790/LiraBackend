package name.lizhe.lira.module.watcher.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IssueWatcherBean {
	
	private int id;
	private int issue_id;
	private int user_id;
	private String name;
	
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

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUpdated_time() {
		return updated_time;
	}

	public void setUpdated_time(Date updated_time) {
		this.updated_time = updated_time;
	}

	public String getUpdated_time_formatted() {
		return updated_time_formatted;
	}

	public void setUpdated_time_formatted(String updated_time_formatted) {
		this.updated_time_formatted = updated_time_formatted;
	}

	public static SimpleDateFormat getSimpleDateFormat() {
		return simpleDateFormat;
	}

	public static void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
		IssueWatcherBean.simpleDateFormat = simpleDateFormat;
	} 
	
	
}
