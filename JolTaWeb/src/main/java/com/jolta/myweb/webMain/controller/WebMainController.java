package com.jolta.myweb.webMain.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jolta.myweb.webMain.service.WebMainService;

@Controller
public class WebMainController {
	
	private static final Logger logger = LoggerFactory.getLogger(WebMainController.class);
	
	@Resource(name="webMainService")
	private WebMainService webMainService;
	
	@RequestMapping(value="/webMain")
	public String webMainMenuList(Model model, HttpServletRequest req) {
		
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("1", "asdf");
		
		try {
		
			List<Map<String, Object>> list = webMainService.selectMenuInfo(params);
			
			for(int i=0; i<list.size(); i++) {
				System.out.println("===========================");
				System.out.println("===========================");
				System.out.println(list.get(i).get("MENU_SN"));
				System.out.println(list.get(i).get("MENU_GBN"));
				System.out.println("===========================");
				System.out.println("===========================");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return "home";
	}
	
}
