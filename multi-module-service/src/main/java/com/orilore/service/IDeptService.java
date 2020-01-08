package com.orilore.service;

import java.util.List;

import com.orilore.model.Dept;

public interface IDeptService {
	public List<Dept> findAll();
	public Dept get(int id);
	public void save(Dept dept);
	public void remove(int id);
}
