package com.glearning.itapp.service;

import com.glearning.itapp.model.Employee;

public interface CredentialServices{
		String generateEmail(String firstName, String lastName, String departmentName);
		String generateCredentials(int maxlength);
		void displayCredentials(Employee employee);
		
	}
