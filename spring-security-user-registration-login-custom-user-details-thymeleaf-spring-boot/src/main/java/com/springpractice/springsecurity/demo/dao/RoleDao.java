package com.springpractice.springsecurity.demo.dao;

import com.springpractice.springsecurity.demo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
