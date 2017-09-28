package com.fangzhi.wechat.dao;

import java.util.List;

import com.fangzhi.Message;

/**
 * 
 * @描述: 预警基础类
 * @作者: xiadk
 * @创建时间: 2016年8月9日
 * @版本号: V1.0
 *
 */
public interface WarningDao extends BaseDao<Message> {

	/**
	 * 
	 * @标题: getCreateSmsOldList
	 * @author: xiadengkuan
	 * @date 2016年10月9日 上午10:03:20
	 * @描述: TODO
	 * @return List<WarningCreate>
	 * @throws:
	 */

	public List<Message> getCreateSmsOldList();

}
