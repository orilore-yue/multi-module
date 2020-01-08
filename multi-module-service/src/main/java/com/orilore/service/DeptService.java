package com.orilore.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.orilore.model.Dept;
import com.orilore.mapper.DeptMapper;
@Service
public class DeptService implements IDeptService {
	@Resource
	private SqlSession session = null;
	@Override
	public List<Dept> findAll() {
		DeptMapper mapper = session.getMapper(DeptMapper.class);
		return mapper.select();
	}

	@Override
	public Dept get(int id) {
		DeptMapper mapper = session.getMapper(DeptMapper.class);
		return mapper.selectOne(id);
	}
	
	
	

	@Override
	public void save(Dept dept) {
		DeptMapper mapper = session.getMapper(DeptMapper.class);
		if(dept.getId()>0) {
			mapper.update(dept);
		}else {
			mapper.insert(dept);
		}
	}

	@Override
	public void remove(int id) {
		DeptMapper mapper = session.getMapper(DeptMapper.class);
		mapper.delete(id);
	}

}
