package com.bjpowernode.contorollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jump")
public class JumController {
	
	//处理器方法
	
	@RequestMapping("tojsp.do")
	public String toJsp(String target){
		//视图的逻辑名称
		return target;
	}
	
	

}
