package com.lyn.dao;

import org.apache.ibatis.annotations.Select;

public interface DataDao {
	@Select("select * from data;")
	public void query(String str);
}
