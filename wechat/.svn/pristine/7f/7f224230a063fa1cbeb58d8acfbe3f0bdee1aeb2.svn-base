 package com.fangzhi.wechat.dao.impl;


 import java.util.List;

 import org.springframework.stereotype.Repository;

import com.fangzhi.Message;
import com.fangzhi.wechat.dao.WarningDao;


 @Repository( "warningDao" )
 public class WarningDaoImpl extends BaseDaoImpl<Message> implements WarningDao {

	public List<Message> getCreateSmsOldList() {
		return super.getSessionTemplate().selectList( getStatement("getCreateSmsOldList" ) );
		
	}

	

 }
