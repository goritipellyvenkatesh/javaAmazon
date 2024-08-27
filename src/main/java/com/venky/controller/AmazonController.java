package com.venky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.venky.model.Amazon;
import com.venky.service.AmazonService;


@Controller
public class AmazonController {
	@Autowired
	private AmazonService service;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/addNew")
	public String amazonForm()
	{
		return "addProduct";
	}
	@RequestMapping("/register")
	public String amazonForm(Amazon amazon)
	{
		Amazon a=service.saveAmazon(amazon);
		return "success";
	}
	@RequestMapping("/viewProduct")
	public String viewDetails(ModelMap model)
	{
		model.put("products", service.getAllAmazon());
		return "view";
	}
	@RequestMapping("/delete/{cid}")
	public String deleteRecord(@PathVariable int cid)
	{
		service.deleteAmazon(cid);
		return "redirect:/viewProduct";
	}
	@RequestMapping("/update/{cid}")
	public String updateRecord(ModelMap model,@PathVariable int cid)
	{
		model.put("command", service.getAmazon(cid));
		return "editProduct";
	}
	@RequestMapping(path = "/editp",method = RequestMethod.GET)
	public String updateAndSave(Amazon amazon,int cid)
	{
		service.updateAmazon(amazon, cid);
		return "redirect:/viewProduct";
	}

}
