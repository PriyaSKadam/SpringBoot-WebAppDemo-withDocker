package in.priya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	
	@GetMapping("/demo1")
	@ResponseBody
	public String getMsg1()
	{
		
		return "Hello, Friends..";
	}
	
	@GetMapping("/demo2")
	
	public String getMsg2(Model model)
	{
		model.addAttribute("msg","Welcome to Navi Mumbai");
		
		return "index";
	}

	@GetMapping("/demo3")
	public String getMsg3(@RequestParam("name") String name,Model model)
	{
		String msgtxt="Welcome "+name;
		 model.addAttribute("msg",msgtxt);
		return "index";
	}
	
	@GetMapping("{name}/demo4")
	public String getMsg4(@PathVariable("name") String name ,Model model)
	{
		String msgtxt="Welcome "+name;
		
		model.addAttribute("msg",msgtxt);
		return "index";
	}
}
