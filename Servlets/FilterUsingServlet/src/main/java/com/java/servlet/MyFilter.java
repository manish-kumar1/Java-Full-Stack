package com.java.servlet;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		
		System.out.println("Before filter..");
		//----
		//---
		
		System.out.println("Filter invoked....");
		//---
		//---
		
		System.out.println("After filter...");
		//-----
		//----
		
		
	}

}
