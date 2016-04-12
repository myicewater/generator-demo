package org.plasea.generator.controller.newstable;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.plasea.generator.model.newstable.NewsTable;
import org.plasea.generator.service.service.newstable.NewsTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 新闻表 控制层
 * @author 朱素海
 *
 */
@Controller
public class NewsTableController {

	/**
	 * 日志打印
	 */
	private static final Logger logger = Logger.getLogger(NewsTableController.class);
	
	@Autowired
	private NewsTableService newsTableServiceImp;
	
	@RequestMapping("/newstable/urlDemo.htm")
	public String urlDemo(HttpServletRequest request,Model model){
		String param = request.getParameter("param");
		
		String session = (String)request.getSession().getAttribute("session");
		
		Map paramMap= new HashMap();
		
		logger.info("Hello world");
		
		request.setAttribute("sign", "testSign");
		request.setAttribute("date", new Date());
		model.addAttribute("testAttr","testValue");
		
		
		
		return "/demo.html";
	}
	
	
	@RequestMapping("/newstable/ajaxDemo.htm")
	@ResponseBody
	public Map ajaxDemo(HttpServletRequest request){
		String param = request.getParameter("param");
		
		String session = (String)request.getSession().getAttribute("session");
		
		Map paramMap= new HashMap();
		
		
		Map resultMap = new HashMap();
		resultMap.put("world","Have a nice day!");
		
		return resultMap;
	}
	
}
