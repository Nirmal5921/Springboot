package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojoclass.pojo;
import com.example.demo.service.service;

@RestController
public class controller {
	@Autowired
	public service objser;
	
	@PostMapping("/saveDonor")
	
	public pojo addDetails(@RequestBody pojo d)
	{
		return objser.saveInfo(d);
	}
	
	@GetMapping("/getDonor")
	
	public List<pojo>getDetails()
	{
		return objser.getDet();
	}
	
	@PutMapping("/updateDonor")
		public pojo updateDetails(@RequestBody pojo donorid)
		{
			return objser.updateInfo(donorid);
		}
	@DeleteMapping("/deleteDonor/{donorid}")
		public String deleteDetails(@PathVariable("donorid")int did)
		{
		objser.deleteInfo(did);
		return "deleted succesfully";
		}
	

}
