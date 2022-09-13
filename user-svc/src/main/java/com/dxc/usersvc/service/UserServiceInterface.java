package com.dxc.usersvc.service;

import com.dxc.usersvc.entity.User;
import com.dxc.usersvc.VO.ResponseTemplateVO;

public interface UserServiceInterface {
	public User saveUser(User user);
	public ResponseTemplateVO getUserWithDepartment(Long userId);
}
