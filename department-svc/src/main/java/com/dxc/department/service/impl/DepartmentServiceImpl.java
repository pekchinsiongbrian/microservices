package com.dxc.department.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.dxc.department.entity.Department;
import com.dxc.department.repository.DepartmentRepository;
import com.dxc.department.service.DepartmentServiceInterface;
import com.dxc.exception.ResourceNotFoundException;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentServiceInterface {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
//		log.info("Inside saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}
	
	public Department findDepartmentById(Long departmentId) {
//		log.info("Inside findDepartmentById method of DepartmentService");
		Optional<Department> dept = departmentRepository.findById(departmentId);
		return dept.isPresent() ? dept.get() : null;
	}
}
