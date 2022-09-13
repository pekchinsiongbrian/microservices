package com.dxc.usersvc.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	public Long departmentId;
	public String departmentName;
	public String departmentAddr;
	public String departmentCode;
}
