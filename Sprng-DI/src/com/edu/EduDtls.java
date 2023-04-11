package com.edu;

import org.springframework.stereotype.Component;

@Component
public class EduDtls
{
	private String ttl;

	public String getTtl() {
		return ttl;
	}

	public void setTtl(String ttl) {
		this.ttl = ttl;
	}
}
