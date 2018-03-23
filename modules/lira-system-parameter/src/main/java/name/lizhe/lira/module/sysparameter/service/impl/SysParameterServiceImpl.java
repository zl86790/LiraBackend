package name.lizhe.lira.module.sysparameter.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import name.lizhe.lira.module.sysparameter.bean.SysParameterBean;
import name.lizhe.lira.module.sysparameter.dao.mapper.SysParameterMapper;
import name.lizhe.lira.module.sysparameter.service.SysParameterService;

@Service
public class SysParameterServiceImpl implements SysParameterService {

	@Autowired
	SysParameterMapper sysParameterMapper;
	
	@Override
	public List<SysParameterBean> getValues(String module_key,String value_key) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("module_key", module_key);
		map.put("value_key", value_key);
		return sysParameterMapper.getValues(map);
	}

}
