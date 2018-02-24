package name.lizhe.lira.module.issue.bean;

import java.util.Date;

public class IssueBean {
	
	private int id;
	private String name;
	private String summary;
	private String type;
	private String priority;
	private String labels;
	private String status;
	private String description;
	private int assignee;
	private int reporter;
	private Date created_time;
	private Date updated_time;
	private Date resolved_time;
	private int estimated;
	private int remaining;
	private int logged;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getReporter() {
		return reporter;
	}
	public void setReporter(int reporter) {
		this.reporter = reporter;
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
	
	
	
}
