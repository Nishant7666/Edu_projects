package com.Studnt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.addrss.AddrssDtls;
import com.edu.EduDtls;

@Component
public class Studnt 
{
	 @Autowired
	private AddrssDtls add;
	
	 @Autowired
	private EduDtls edu;
	
	public AddrssDtls getAdd() {
		return add;
	}
	public void setAdd(AddrssDtls add) {
		this.add = add;
	}
	public EduDtls getEdu() {
		return edu;
	}
	public void setEdu(EduDtls edu) {
		this.edu = edu;
	}
}
