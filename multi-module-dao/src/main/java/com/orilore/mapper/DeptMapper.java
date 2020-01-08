package com.orilore.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.orilore.model.Dept;

@Mapper
public interface DeptMapper {
	public List<Dept> select();
	public Dept selectOne(int id);
	public void insert(Dept dept);
	public void update(Dept dept);
	public void delete(int id);
}
