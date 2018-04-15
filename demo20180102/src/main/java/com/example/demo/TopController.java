package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.TopInfo;
import com.example.demo.service.TopInfoService;

@Controller
public class TopController {
	
	@Autowired
	private TopInfoService topInfoService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		// 新着情報全件取得
		ArrayList<TopInfo> topInfos = topInfoService.getTopInfos();
		model.addAttribute("topInfos", topInfos);
		return "top";
	}
}

