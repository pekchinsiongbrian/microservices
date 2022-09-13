package com.dxc.department.service;

import com.dxc.department.entity.Department;

public interface DepartmentServiceInterface {
	public Department saveDepartment(Department department);
	public Department findDepartmentById(Long departmentId);
}
