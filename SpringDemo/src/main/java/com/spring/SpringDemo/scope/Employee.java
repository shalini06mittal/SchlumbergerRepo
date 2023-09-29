package com.spring.SpringDemo.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * ********************Scoping********************
Emp constructor
856055143
Employee [eid=1, ename=Shalini]
Manisha

Emp constructor
856055143
Employee [eid=1, ename=Shalini]
 *
 */
@Component
@Scope("prototype")
public class Employee {

	@Value("1")
	private int eid;
	@Value("Shalini")
	private String ename;
	//private Address address;
	
	public Employee() {
		System.out.println("Emp constructor");
	}
	
	
	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	
	
}
