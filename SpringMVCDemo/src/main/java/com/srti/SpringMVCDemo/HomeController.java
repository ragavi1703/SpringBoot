//package com.web.springWeb1;
//
//import org.springframework.stereotype.Controller;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;
//
//@Controller
//public class HomeController {
//	
//	@RequestMapping("/")
//	public String home() {
//		System.out.println("Home method called");
//		return "index";
//	}
//	@RequestMapping("add")
//	public String add(HttpServletRequest req,HttpSession session) {
//		int num1 = Integer.parseInt(req.getParameter("num1"));
//		int num2 = Integer.parseInt(req.getParameter("num2"));
//		int result=num1+num2;
//		System.out.println(result);
//		session.setAttribute("result",result);
//		
//		return "result";
//	}
//
//}


package com.srti.SpringMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@ModelAttribute("course")
	public String coursename() {
		return "java";
		}

    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "index"; // Maps to index.html
    }

    @RequestMapping("/add")
    public String add(int num1,int num2, Model model) {
    
        int res = num1 + num2;

        System.out.println("Result: " + res);
        model.addAttribute("res", res); // Pass result to the view
        return "result"; // Maps to result.html
    }
    
    @RequestMapping("addAlien")
    public String addAlien(Alien alien) {
    	
    
//    	Alien alien=new Alien();
//    	alien.setAid(aid);
//    	alien.setAname(aname);
       

//        System.out.println(alien);
//        model.addAttribute("alien", alien); // Pass result to the view
        return "result"; // Maps to result.html
    }
}

