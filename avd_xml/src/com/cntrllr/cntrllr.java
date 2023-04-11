package com.cntrllr;

public class cntrllr 
{
	private String url;
	private String pass;
	private String usrnm;
	public cntrllr(String url, String pass, String usrnm) 
	{
		this.url = url;
		this.pass = pass;
		this.usrnm = usrnm;
	
		System.out.print("im in controller");
	}
}
