package com.du.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/forme")  
public class usertest {
		
	@RequestMapping("/dod")
	@ResponseBody
	public String dod() {
		System.out.println("这是我的到的第一个结果");
		return "hellolllll";
		
		
	}
}
