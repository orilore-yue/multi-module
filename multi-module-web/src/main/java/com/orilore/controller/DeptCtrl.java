package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.model.Dept;
import com.orilore.service.IDeptService;

@RestController
@RequestMapping("/dept")
public class DeptCtrl {
	@Resource
	private IDeptService service;
	
	@RequestMapping("/query")
	public List<Dept> query(){
		return service.findAll();
	}
	
	@RequestMapping("/get/{id}")
	public Dept get(@PathVariable("id") int id){
		return service.get(id);
	}
}



