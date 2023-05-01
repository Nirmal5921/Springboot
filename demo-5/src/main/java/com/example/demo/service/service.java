package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojoclass.pojo;
import com.example.demo.repository.repo;

@Service

public class service {
	@Autowired
	public repo arepo;
	
	//posting info
	public pojo saveInfo(pojo b)
	{
		return arepo.save(b);
	}
	//getting info
	public List<pojo> getDet()
	{
		return arepo.findAll();
	}
	//updating info
	public pojo updateInfo(pojo c)
	{
		return arepo.saveAndFlush(c);
	}
	//deleting info
	public void deleteInfo(int donorid)
	{
		arepo.deleteById(donorid);
	}

}
