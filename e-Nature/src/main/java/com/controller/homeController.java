package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daoImpl.UserDaoImpl;
import com.model.User;

@Controller
public class homeController 
{
	@Autowired
	UserDaoImpl userDaoImpl;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	@RequestMapping("/index")
	public String home()
	{
		return "index";
	}
	/*@RequestMapping("/register")
	public String register()
	{
		return "register";
	}*/
	/*@RequestMapping("/login")
	public String login()
	{
		return "login";
	}*/
	
	@RequestMapping("/goToLogin")
	public ModelAndView goToLogin()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
	//============================Mapping of registration form===================================================
	@RequestMapping(value= "/register",method= RequestMethod.GET)
	public ModelAndView showRegister()
	{
		System.out.println("this is registration form.....");
		ModelAndView mav=new ModelAndView();
		mav.addObject("user", new User());
		mav.setViewName("register");
		return mav;
	}
	//=================for saving registration........(Inserting data into database)==============================================
	@RequestMapping(value= "/saveregister",method= RequestMethod.POST)
	public ModelAndView saveRegister(@ModelAttribute("user") User user,BindingResult result)
	{
		ModelAndView mav=new ModelAndView();
		System.out.println("saving registration form");
		if(result.hasErrors())
		{
			
			mav.setViewName("register");
			return mav;
		}
		else
		{
			user.setRole("ROLE_USER");
			userDaoImpl.insertUser(user);
			mav.setViewName("redirect:/goToLogin");
			return mav;
		}
		
	}
	@RequestMapping("/contactus")
	public String contactus()
	{
		return "contactus";
	}
}