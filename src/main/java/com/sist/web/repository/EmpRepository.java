package com.sist.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sist.web.entity.Emp;
import com.sist.web.vo.EmpDeptVO;

import java.util.*;

/*
 * JAP / React / 일반 SQL => NodeJS
 * 1. JPA 메소드 규칙
 * 2. JPQL => SQL문장이 아닌 객체 처리
 * 3. JOIN
 * 4. SUBQUERY => 일부만 지원
 * 		inlineview는 지원하지 않는다
 */
@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer>{
	@Query("""
			SELECT e
			FROM Emp e
			JOIN e.dept d
			WHERE d.deptno = e.deptno
			""")
	List<Emp> findByDeptDeptno();
	
	@Query("""
			SELECT new com.sist.web.vo.EmpDeptVO(
				e.empno,
				e.sal,
				e.ename,
				e.job,
				d.dname,
				d.loc
			)
			FROM Emp e
			JOIN e.dept d
			WHERE d.deptno = e.deptno
			
			""")
	List<EmpDeptVO> findEmpDeptVO();
}
