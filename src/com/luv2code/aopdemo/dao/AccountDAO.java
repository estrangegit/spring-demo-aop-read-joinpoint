package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	public void addAccount() {		
		System.out.println(getClass() + " addAccount()");		
	}
	
	public void addAccount(Account theAccount) {		
		System.out.println(getClass() + " addAccount(Account theAccount)");		
	}
	
	public void addAccount(Account theAccount, boolean vipFlag) {		
		System.out.println(getClass() + " addAccount(Account theAccount, boolean vipFlag)");		
	}
	
	public boolean doWork() {
		System.out.println(getClass() + " doWork()");
		return true;
	}

	public String getName() {
		System.out.println(getClass() + " getName()");		
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + " setName(String name)");		
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + " getServiceCode()");		
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + " setServiceCode(String serviceCode)");		
		this.serviceCode = serviceCode;
	}		
}
