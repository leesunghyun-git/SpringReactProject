package com.sist.web.service;

import java.util.List;


import com.sist.web.entity.Emp;
import com.sist.web.vo.EmpDeptVO;

public interface EmpService {
	List<Emp> findByDeptDeptno();
	List<EmpDeptVO> findEmpDeptVO();
}
