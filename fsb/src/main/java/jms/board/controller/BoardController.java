package jms.board.controller;

import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;
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

import jms.board.domain.JobHisVO;
import jms.board.domain.JobVO;
import jms.board.service.JobService;


@Controller
@RequestMapping("/board/**")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject JobService service;
	
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
	
	@ResponseBody
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public int write(@RequestBody JobVO jvo,HttpServletResponse response, Model model)throws Exception {

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		DateFormat dateFormatHis = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String dateToStr = dateFormat.format(date);
		String dateToStrHis = dateFormatHis.format(date);
		jvo.setBzwrDstc(dateToStr);
		jvo.setJobCd(dateToStr);
		jvo.setSqno(dateToStr);
		System.out.println(jvo);
		
		JobHisVO jhvo = new JobHisVO();
		jhvo.setFrstRegDt(dateToStrHis);
		jhvo.setBzwrDstc(dateToStr);
		jhvo.setJobCd(dateToStr);
		jhvo.setSqno(dateToStr);
	
		jhvo.setDtlSqno("1");
		jhvo.setBzwrExcSts("30"); // 상태 : 정상
		jhvo.setBzwrTrtmInfo("1"); // 처리정보 : 지시
		jhvo.setLastChngUsrno(jvo.getLastChngUsrno());

		
		
		int ret = service.writeJob(jvo, jhvo);
		
		
		return ret;
	}
	
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public List<JobVO> jvoList(Map<String, Object> req, Model model) throws Exception {
		
		logger.info("get list!");
		System.out.println("get list!!");
//		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		System.out.println(req);
		System.out.println(req.toString());
		
		List<JobVO> jvoList = service.listAll(req);
		
		for(int i = 0; i<jvoList.size();i++) {
			System.out.println(jvoList.get(i).toString());
		}
		
		
		
		return jvoList;
	}
//	
//	@ResponseBody
//	@RequestMapping(value = "/readJob", method = RequestMethod.GET)
//	public List<JobVO> jvoList(@RequestBody Map<String, Object> req, Model model) throws Exception {
//		
//		logger.info("get list!");
//		System.out.println("get list!!");
////		Map<String, Object> paramMap = new HashMap<String, Object>();
//		
//		List<JobVO> jvoList = service.listAll(req);
//		
//		return jvoList;
//	}
	
//	@ResponseBody
//	@RequestMapping(value = "/searchUser", method = RequestMethod.GET)
//	public int write(@RequestBody Map<String, Object> req,HttpServletResponse response, Model model)throws Exception {
//
//		req.get("usrId");
//		
//		System.out.println(jvo);
//		
//		int ret = service.searchUser(jvo);
//		
//		return ret;
//	}
	
//	@ResponseBody
//	@RequestMapping(value = "/list", method = RequestMethod.POST)
//	public JobVO TESTPOST(@RequestBody Map<String, Object> req, HttpServletResponse response, Model model) {
//
//		model.addAttribute("res", res );
//		System.out.println(res);
//		String str = res.toString();
//		System.out.println("str");
//		System.out.println(str);
////		logger.info("Welcome home! The client locale is {}.", locale);
//		return res;
//	}
	
	
}
