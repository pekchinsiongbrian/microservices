package com.dxc.usersvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dxc.usersvc.VO.Department;
import com.dxc.usersvc.VO.ResponseTemplateVO;
import com.dxc.usersvc.entity.User;
import com.dxc.usersvc.repository.UserRepository;
import com.dxc.usersvc.service.UserServiceInterface;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserServiceInterface {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
//		log.info("Inside saveUser of UserService");
		return userRepository.save(user);
	}
	
	public ResponseTemplateVO getUserWithDepartment(Long userId) {
//		log.info("Inside getUserWithDepartment of UserService");
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findById(userId).get();
		
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}
}
