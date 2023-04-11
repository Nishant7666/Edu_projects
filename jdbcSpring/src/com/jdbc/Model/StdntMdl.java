package com.jdbc.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.jdbc.dto.Stdnts;

@Component
public class StdntMdl
{
	@Autowired
	JdbcTemplate tmplt;
	
	
	Stdnts st = new Stdnts();
	public void save(String name, String email, int string3)
	{
		String query = "insert into students values( ?,?,?)";
		Object [] data = {st.getName(),st.getEmail(),st.getContact()};
		
		int count = tmplt.update(query,data);
		System.out.println(count + ": rows inserted" );
		
	}
	
	public void getall()
	{
		System.out.println(tmplt.queryForList("select * from students"));
	}

}
