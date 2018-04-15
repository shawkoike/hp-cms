package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.LiveEntity;
import com.example.demo.service.LiveService;

@Controller
public class ScheduleController {
	
	@Autowired
	private LiveService liveService;
	
	@RequestMapping(value="/schedule")
	public String schedule(Model model) {
		// 全件取得
		ArrayList<LiveEntity> entity = liveService.getEvents();
		model.addAttribute("entity", entity);
		return "schedule";
	}

}
