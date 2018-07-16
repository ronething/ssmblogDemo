package blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/blog")
public class BloggerController {
	
	@ResponseBody  //返回json数据
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
}
