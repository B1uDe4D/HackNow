package com.in28minutes.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String showHomePage() {
		return "homepage";
	}
	
	@RequestMapping(value="/home", method = RequestMethod.POST) 
	public String handleStoreSearch(@RequestParam String storeName, ModelMap model){
		model.put("storeName", storeName);
		return "searchresultspage";
	}
	
}
