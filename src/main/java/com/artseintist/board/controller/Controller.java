package com.artseintist.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.artseintist.board.command.BWriteCommand;
import com.artseintist.board.util.Constant;
import com.artseintist.board.command.BComannd;
import com.artseintist.board.command.BListCommand;

@org.springframework.stereotype.Controller
public class Controller {
	BComannd command = null;

	private JdbcTemplate template;	
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	@RequestMapping(value ="/write")
	public String write() {
		return "write_form";
	}
	
	@RequestMapping(value ="/writeOk")
	public String writeOk(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new BWriteCommand();
		command.execute(model);
		return "redirect:list"; // 리스트 요청을 다시 하는 것임
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		command = new BListCommand();
		command.execute(model);
		return "list";
	}
}
