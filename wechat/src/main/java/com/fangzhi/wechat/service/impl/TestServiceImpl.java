package com.fangzhi.wechat.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fangzhi.Message;
import com.fangzhi.web.util.JSONSerializer;
import com.fangzhi.wechat.dao.WarningDao;
import com.fangzhi.wechat.service.TestService;
@Service( "testService" )
public class TestServiceImpl implements TestService {
	private static final Log	logger	= LogFactory.getLog( TestServiceImpl.class );
	@Autowired
	private WarningDao			warningDao;
	public List<Message> test() {
		List<Message> list =warningDao.getCreateSmsOldList();
		logger.debug( JSONSerializer.serialize( "TestServiceImpl==:"+list ) );
		return list;
	}

}
