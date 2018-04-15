package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.LiveEntity;
import com.example.demo.entity.TopInfo;
import com.example.demo.repository.LiveRepository;
import com.example.demo.repository.TopInfoRepository;
import com.example.demo.request.Content;
import com.example.demo.request.ContentEdit;
import com.example.demo.request.ContentNews;
import com.example.demo.request.Form;

@Controller
public class AdminController {
	
	@Autowired 
	LiveRepository repository;
	
	@Autowired
	TopInfoRepository topInfoRepository;
	
	@RequestMapping("/admin/cms/login")
	public String login(Model model) {
		model.addAttribute("indexForm", new Form());
		return "login";
	}
	
	@RequestMapping(value="/fromTab")
	public String fromTab(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("key", "kaAndamsiamni");
		return "redirect:/tabTop";
	}
	
	@RequestMapping(value="/tabTop", method = RequestMethod.GET)
	public String tabTop(Model model, @ModelAttribute("key") String key) {
		
		if (key == "kaAndamsiamni") {
			// 現在の表示
			Iterable<LiveEntity> entity = repository.findAll();
			model.addAttribute("entity", entity);
			return "admin";
		}

		return "loginError";
	}
	
	@RequestMapping(value="/admin", method = RequestMethod.POST)
	public String toTop(Model model, @ModelAttribute Form indexForm) {
		if (indexForm.getPassword().equals("kanasami") && indexForm.getUser().equals("admin")) {
			// 現在の表示
			Iterable<LiveEntity> entity = repository.findAll();
			model.addAttribute("entity", entity);
			// ログイン成功
			return "admin";
		} else {
			// ログイン失敗
			model.addAttribute("indexForm", new Form());
			return "loginError";
		}
	}
	
	@RequestMapping("/addContent")
	public String addContent(Model model) {
		model.addAttribute("form", new Content());
		return "addContent";
	}

	@RequestMapping(value="/addContentRequest", method=RequestMethod.POST)
	public String addContentRequest(Model model, @ModelAttribute Content request) {
		LiveEntity entity = new LiveEntity();
		entity.setTitle(request.getTitle());
		entity.setContent(request.getContent());
		entity.setOpen(request.getOpen());
		entity.setDate(request.getDate());
		entity.setPlace(request.getPlace());
		entity.setStart(request.getStart());
		entity.setOpen(" ");
		entity.setPrint(1);
		entity.setPriority(1);
		repository.saveAndFlush(entity);
		
		return "complete";
	}
	
	@RequestMapping("/addNews")
	public String addNews(Model model) {
		model.addAttribute("form", new ContentNews());
		return "addNews";
	}

	@RequestMapping(value="/addNewsRequest", method=RequestMethod.POST)
	public String addNewsRequest(Model model, @ModelAttribute ContentNews request) {
		TopInfo topInfo = new TopInfo();
		topInfo.setTitle(request.getTitle());
		topInfo.setUpdateDate(request.getUpdateDate());
		topInfo.setUrl(request.getUrl());
		topInfoRepository.saveAndFlush(topInfo);
		
		return "complete";
	}
	
	@RequestMapping(value="deleteContent")
	public String deleteContent(Model model) {
		Iterable<LiveEntity> entity = repository.findAll();
		model.addAttribute("entity", entity);
		return "deleteContent";
	}
	
	@RequestMapping(value="deleteContentRequest", method=RequestMethod.GET)
	public String deleteContentRequest(Model model, @RequestParam int num) {
		Iterable<LiveEntity> entity = repository.findAll();
		LiveEntity target = new LiveEntity();
		for (LiveEntity ent : entity) {
			if (ent.getSequence() == num) {
				target = ent;
			}
		}
		repository.delete(target);
		repository.flush();
		return "complete";
	}
	
	@RequestMapping(value="editContent")
	public String edit(Model model) {
		Iterable<LiveEntity> entity = repository.findAll();
		model.addAttribute("entity", entity);
		return "EditContent";
	}
	
	@RequestMapping(value="editContentRequestForm")
	public String editContentRequestForm(Model model, @RequestParam int num) {
		Iterable<LiveEntity> entity = repository.findAll();
		LiveEntity target = new LiveEntity();
		for (LiveEntity ent : entity) {
			if (ent.getSequence() == num) {
				target = ent;
			}
		}
		model.addAttribute("title", target.getTitle());
		model.addAttribute("content", target.getContent());
		model.addAttribute("place", target.getPlace());
		model.addAttribute("date", target.getDate());
		model.addAttribute("start", target.getStart());
		model.addAttribute("sequence", target.getSequence());
		return "editContentForm";
	}
	
	@RequestMapping(value="/editContentRequest", method=RequestMethod.POST)
	public String editContentRequest(Model model, @ModelAttribute ContentEdit request) {
		LiveEntity entity = new LiveEntity();
		entity.setSequence(Integer.valueOf(request.getSequence()));
		entity.setTitle(request.getTitle());
		entity.setContent(request.getContent());
		entity.setDate(request.getDate());
		entity.setPlace(request.getPlace());
		entity.setStart(request.getStart());
		entity.setOpen(" ");
		entity.setPrint(1);
		entity.setPriority(1);
		repository.saveAndFlush(entity);
		
		return "complete";
	}
}
