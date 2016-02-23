package com.frank.dao;

import com.frank.entity.Blogger;


public interface BloggerDao {


	public Blogger find();
	

	public Blogger getByUserName(String userName);
	

	public Integer update(Blogger blogger);
}
