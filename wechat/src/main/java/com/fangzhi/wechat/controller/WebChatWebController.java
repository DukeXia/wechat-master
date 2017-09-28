package com.fangzhi.wechat.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fangzhi.Message;
import com.fangzhi.web.util.JSONSerializer;
import com.fangzhi.wechat.service.TestService;
/**
 * ClassName: WeChatController
 * @Description: 前端用户微信配置获取
 * @author dapengniao
 * @date 2016年3月19日 下午5:57:36
 */
@Controller
@RequestMapping("/web")
public class WebChatWebController {
	private static Logger logger = Logger.getLogger(WeChatController.class);
	@Autowired
	private TestService  testService;
	
	@RequestMapping(value = "employList", method = RequestMethod.GET)
	@ResponseBody
	public String getEmployList(HttpServletRequest request,HttpServletResponse response)
	{
		response.setCharacterEncoding("utf-8");
		Map<String,String> map=new HashMap<String,String>();
		map.put( "resultCode", "0" );
		map.put( "resultMsg", "微信页面测试啊！" );
		List<Message> list =testService.test();
		map.put( "data", list.toString() );
		logger.info("list===========:"+ JSONSerializer.serialize(list) );
		return map.toString();
		
	}

}
