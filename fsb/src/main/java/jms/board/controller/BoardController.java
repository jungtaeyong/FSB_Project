package jms.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.jms.web.HomeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import jms.board.domain.JobVO;


@Controller
@RequestMapping("/board/**")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String abc(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "test";
	}
	
	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public Map<String, Object> TESTPOST(@RequestBody Map<String, Object> res, HttpServletResponse response, Model model) {
		
		
	
		model.addAttribute("res", res );
		System.out.println(res);
		String str = res.toString();
		System.out.println("str");
		System.out.println(str);
//		logger.info("Welcome home! The client locale is {}.", locale);
		return res;
	}
	
}
