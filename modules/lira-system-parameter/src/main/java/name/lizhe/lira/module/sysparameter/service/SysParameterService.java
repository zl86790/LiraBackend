package name.lizhe.lira.module.sysparameter.service;

import java.util.List;
import java.util.Map;

import name.lizhe.lira.module.sysparameter.bean.SysParameterBean;

public interface SysParameterService {
	public List<SysParameterBean> getValues(String module_key,String value_key);
}
