package name.lizhe.lira.module.sysparameter.bean;

public class SysParameterBean {
	
	private int id;
	private String module_key;
	private String value_key;
	private String value_content;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModule_key() {
		return module_key;
	}
	public void setModule_key(String module_key) {
		this.module_key = module_key;
	}
	public String getValue_key() {
		return value_key;
	}
	public void setValue_key(String value_key) {
		this.value_key = value_key;
	}
	public String getValue_content() {
		return value_content;
	}
	public void setValue_content(String value_content) {
		this.value_content = value_content;
	}
	
}
