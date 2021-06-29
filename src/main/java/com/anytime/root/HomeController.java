package com.anytime.root;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		InetAddress in =null;
		
		try {
			in = InetAddress.getLocalHost();
			System.out.println(in.getLocalHost());
			System.out.println(in.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping(value = "index")
	public String home() {
		return "redirect:/";
	}
	
	
	
}
