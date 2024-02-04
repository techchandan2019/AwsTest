package com.neosoft.model;

import org.hibernate.annotations.Comment;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;

import jakarta.annotation.Nonnull;

@Component
//@RequestScope
//@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
//@Scope(value =WebApplicationContext.SCOPE_REQUEST,proxyMode = ScopedProxyMode.TARGET_CLASS)
//@Scope("prototype")
public class PersonRequest {
	
	@Nonnull
	private String name;
	@Nonnull
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "PersonRequest [name=" + name + ", email=" + email + "]";
	}
	
	

}
