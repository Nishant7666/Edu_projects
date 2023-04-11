package com.hbm.Model;

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.hbm.DataTransferObjects.StudentInfo;

@org.springframework.stereotype.Repository
public class Repository
{
	@Autowired
	HibernateTemplate temp;
	
		@Transactional(readOnly = false)
		public void save(StudentInfo info)
		{
			temp.save(info);
		}

		@Transactional(readOnly = false)
		public void update(StudentInfo info)
		{
			temp.update(info);
		}
	
		@Transactional(readOnly = false)
		public void delete(StudentInfo info)
		{
			temp.delete(info);
		}
	
	public List<StudentInfo> getAll()
	{
		return temp.loadAll(StudentInfo.class);
	}
}
