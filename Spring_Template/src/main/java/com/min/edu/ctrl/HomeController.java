package com.min.edu.ctrl;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {

	@GetMapping(value = "/home.do")
	public String home() {
		log.info("HomeController home.do");
//		return "/WEB-INF/views/home.jsp";
		return "home";
	}
	
	@PostMapping(value = "/home.do")
	public String home(String param, Model model, HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		String param1 = request.getParameter("param");
		log.info("HomeController home.do 전달받은값: {}{}", param, param1);
		return "home";
	}
}
