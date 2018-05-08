package name.lizhe.lira.module.issue.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IssueBean {
	
	private int id;
	private int project_id;
	private String issue_key;
	private String issue_name;
	private String summary;
	private String type;
	private String priority;
	private String labels;
	private String status;
	private String description;
	private int assignee;
	private String assignee_name;
	private int reporter;
	private String reporter_name;
	private Date created_time;
	private Date updated_time;
	private Date resolved_time;
	private int estimated;
	private int remaining;
	private int logged;
	private String project_name;
	
	private String created_time_formatted;
	private String updated_time_formatted;
	private String resolved_time_formatted;
	
	private String updated_time_input_str;
	private String created_time_input_str;
	private String resolved_time_input_str;
	
	public final static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getIssue_key() {
		return issue_key;
	}
	public void setIssue_key(String issue_key) {
		this.issue_key = issue_key;
	}
	public String getIssue_name() {
		return issue_name;
	}
	public void setIssue_name(String issue_name) {
		this.issue_name = issue_name;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getLabels() {
		return labels;
	}
	public void setLabels(String labels) {
		this.labels = labels;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAssignee() {
		return assignee;
	}
	public void setAssignee(int assignee) {
		this.assignee = assignee;
	}
	public String getAssignee_name() {
		return assignee_name;
	}
	public void setAssignee_name(String assignee_name) {
		this.assignee_name = assignee_name;
	}
	public int getReporter() {
		return reporter;
	}
	public void setReporter(int reporter) {
		this.reporter = reporter;
	}
	public String getReporter_name() {
		return reporter_name;
	}
	public void setReporter_name(String reporter_name) {
		this.reporter_name = reporter_name;
	}
	public Date getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	public Date getUpdated_time() {
		return updated_time;
	}
	public void setUpdated_time(Date updated_time) {
		this.updated_time = updated_time;
	}
	public Date getResolved_time() {
		return resolved_time;
	}
	public void setResolved_time(Date resolved_time) {
		this.resolved_time = resolved_time;
	}
	public int getEstimated() {
		return estimated;
	}
	public void setEstimated(int estimated) {
		this.estimated = estimated;
	}
	public int getRemaining() {
		return remaining;
	}
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	public int getLogged() {
		return logged;
	}
	public void setLogged(int logged) {
		this.logged = logged;
	}
	public String getCreated_time_formatted() {
		if(created_time==null){
			return "";
		}
		return simpleDateFormat.format(created_time);
	}
	public void setCreated_time_formatted(String created_time_formatted) {
		this.created_time_formatted = created_time_formatted;
	}
	public String getUpdated_time_formatted() {
		if(updated_time==null){
			return "";
		}
		return simpleDateFormat.format(updated_time);
	}
	public void setUpdated_time_formatted(String updated_time_formatted) {
		this.updated_time_formatted = updated_time_formatted;
	}
	public String getResolved_time_formatted() {
		if(resolved_time==null){
			return "";
		}
		return simpleDateFormat.format(resolved_time);
	}
	public void setResolved_time_formatted(String resolved_time_formatted) {
		this.resolved_time_formatted = resolved_time_formatted;
	}
	public String getUpdated_time_input_str() {
		return updated_time_input_str;
	}
	public void setUpdated_time_input_str(String updated_time_input_str) {
		this.updated_time_input_str = updated_time_input_str;
	}
	public String getCreated_time_input_str() {
		return created_time_input_str;
	}
	public void setCreated_time_input_str(String created_time_input_str) {
		this.created_time_input_str = created_time_input_str;
	}
	public String getResolved_time_input_str() {
		return resolved_time_input_str;
	}
	public void setResolved_time_input_str(String resolved_time_input_str) {
		this.resolved_time_input_str = resolved_time_input_str;
	}
	
	
}
