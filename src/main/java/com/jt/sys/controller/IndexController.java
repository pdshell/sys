package com.jt.sys.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jt.sys.pojo.SysUser;
//http://localhost:8080/CGB-JT-SYS-V1.01/indexUI.do
@RequestMapping("/")
@Controller
public class IndexController {
	@RequestMapping("indexUI")
	public String indexUI(){
		return "starter";
	}
	@RequestMapping("pageUI")
	public String pageUI(){
		return "common/page";
	}
}

//Filter-->Servlet(DispatcherServlet)--->Interceptors->Controller





