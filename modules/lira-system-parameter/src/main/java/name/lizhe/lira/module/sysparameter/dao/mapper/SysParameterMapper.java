package name.lizhe.lira.module.sysparameter.dao.mapper;

import java.util.List;
import java.util.Map;

import name.lizhe.lira.module.sysparameter.bean.SysParameterBean;

public interface SysParameterMapper {
	public List<SysParameterBean> getValues(Map<String,String> map);
}
