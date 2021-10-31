package com.codingdojo.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.models.Gold;


@Controller
public class GoldController {

	Gold gold1 = new Gold();
	
	
	
	
	


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
	
		
		model.addAttribute("gold", gold1.getGold());
		model.addAttribute("log", gold1.getLog());

		return "gold.jsp";
	}

	@RequestMapping(value = "/farm", method = RequestMethod.POST)
	public String farm(Model model) {
		
		gold1.AddGold(10,20);
		Date date = new Date();
		int random = gold1.getRandom();
		SimpleDateFormat dateformat = new SimpleDateFormat("EEEE,'the' dd 'of' MMMM,YYYY, hh:mm");
		String messageToLog = "You entered a farm and earned " + random + "." + dateformat.format(date);
		gold1.setLog(messageToLog);
		model.addAttribute("gold", gold1.getGold());
		model.addAttribute("log", gold1.getLog());
	
		return "redirect:/";
	}
	
	
	@RequestMapping(value = "/cave", method = RequestMethod.POST)
	public String cave(Model model) {
		
		gold1.AddGold(5,10);
		Date date = new Date();
		int random = gold1.getRandom();
		SimpleDateFormat dateformat = new SimpleDateFormat("EEEE,'the' dd 'of' MMMM,YYYY, hh:mm");
		String messageToLog = "You entered a Cave and earned " + random + "." + dateformat.format(date);
		gold1.setLog(messageToLog);
		model.addAttribute("gold", gold1.getGold());
		model.addAttribute("log", gold1.getLog());
	
		return "redirect:/";
	}
	
	@RequestMapping(value = "/house", method = RequestMethod.POST)
	public String house(Model model) {
		
		gold1.AddGold(2,5);
		Date date = new Date();
		int random = gold1.getRandom();
		SimpleDateFormat dateformat = new SimpleDateFormat("EEEE,'the' dd 'of' MMMM,YYYY, hh:mm");
		String messageToLog = "You entered a House and earned " + random + "." + dateformat.format(date);
		gold1.setLog(messageToLog);
		model.addAttribute("gold", gold1.getGold());
		model.addAttribute("log",gold1.getLog());
	
		return "redirect:/";
	}
	
	@RequestMapping(value = "/casino", method = RequestMethod.POST)
	public String Casino(Model model) {
		
		gold1.casinoGold(0,50);
		Date date = new Date();
		int random = gold1.getRandom();
		if (random >0) {
		SimpleDateFormat dateformat = new SimpleDateFormat("EEEE,'the' dd 'of' MMMM,YYYY, hh:mm");
		String messageToLog = "You entered a Casino and earned " + random + "." + dateformat.format(date);
		gold1.setLog(messageToLog);
		model.addAttribute("gold", gold1.getGold());
		model.addAttribute("log",gold1.getLog());
		}else {
			SimpleDateFormat dateformat = new SimpleDateFormat("EEEE,'the' dd 'of' MMMM,YYYY, hh:mm");
			String messageToLog = "You entered a Casino and lose " + random + "." + dateformat.format(date)+"Ouch!";
			gold1.setLog(messageToLog);
			model.addAttribute("gold", gold1.getGold());
			model.addAttribute("log",gold1.getLog());
			
		}
	
		return "redirect:/";
	}


}
