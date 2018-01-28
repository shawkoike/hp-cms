package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.LiveEntity;
import com.example.demo.repository.LiveRepository;

@Controller
public class ScheduleController {
	
	@Autowired 
	LiveRepository repository;
	
	@RequestMapping(value="/schedule")
	public String schedule(Model model) {
		// 全件取得
		Iterable<LiveEntity> entity = repository.findAll();
		
		model.addAttribute("entity", entity);
			
		return "schedule";
	}

}
