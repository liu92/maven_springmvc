package com.springmvc.controller;

import com.springmvc.common.LYCReponse;
import com.springmvc.po.UserInfo;
import com.springmvc.service.UserInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserInfoController {
	private static final Logger LOGGER = Logger
			.getLogger(UserInfoController.class);

	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable int userId) {
		LOGGER.info("用户id" + userId);
		UserInfo userInfo = userInfoService.getById(1);
		modelMap.addAttribute("userInfo", userInfo);
		return "showInfo";
	}

	@RequestMapping("/showInfos")
	public LYCReponse showUserInfos() {
		LOGGER.info("json");
		List<UserInfo> userInfos = userInfoService.findAll();
		return LYCReponse.addListResponse("查询成功", userInfos);
	}

	/**
	 * 首页处理方法
	 */
	@RequestMapping({ "home", "index" })
	public String shouHomePage(Map<String, String> model) {
		return "home";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request) {
		// 可以访问
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "这是你在Spring MVC 世界创建的 modelAndView 页面");
		modelAndView.addObject("str", request.getParameter("str"));
		modelAndView.setViewName("hello");
		return modelAndView;
	}

}
