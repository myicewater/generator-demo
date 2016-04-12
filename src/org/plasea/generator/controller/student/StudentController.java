package org.plasea.generator.controller.student;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.plasea.generator.model.student.Student;
import org.plasea.generator.service.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *  控制层
 * @author 朱素海
 *
 */
@Controller
public class StudentController {

	/**
	 * 日志打印
	 */
	private static final Logger logger = Logger.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentServiceImp;
	
	@RequestMapping("/student/urlDemo.htm")
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
	
	
	@RequestMapping("/student/ajaxDemo.htm")
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
