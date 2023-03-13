package com.glearning.itapp.service;

import java.util.Random;

import com.glearning.itapp.model.Employee;

public class CredentialServicesImpl implements CredentialServices{
	 private static final String CHAR_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     private static final String CHAR_LOWER  = "abcdefghijklmnopqrstuvwxyz";
     private static final String NUMBER = "0123456789";
     private static final String SPECIAL_CHARS = "!@#$%^&*()_";
     private static final String PASSWORD_ALLOW_BASE = CHAR_LOWER + CHAR_UPPER + NUMBER + SPECIAL_CHARS;
     private static final Random random = new Random();

	@Override
	public String generateEmail(String firstName, String lastName, String departmentName) {
		String generateEmail = firstName+lastName+"@"+departmentName+".com";
		return generateEmail;
	}

	@Override
	public String generateCredentials(int maxlength) {
		
		StringBuilder passwordBuilder = new StringBuilder(maxlength);
		passwordBuilder.append(CHAR_LOWER.charAt(random.nextInt(CHAR_LOWER.length())));
		passwordBuilder.append(CHAR_UPPER.charAt(random.nextInt(CHAR_UPPER.length())));
		passwordBuilder.append(NUMBER.charAt(random.nextInt(NUMBER.length())));
		passwordBuilder.append(SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length())));
		
		 for(int i = 4; i < maxlength; i++ ){
          	passwordBuilder.append(PASSWORD_ALLOW_BASE.charAt(random.nextInt(PASSWORD_ALLOW_BASE.length())));
          }
          
          //shuffle the characters in the password
          char[] passwordChars = passwordBuilder.toString().toCharArray();
          for (int i = 0; i < passwordChars.length; i++) {
            
		       int j = random.nextInt(passwordChars.length);
		       char temp = passwordChars[j];
		       passwordChars[i] = passwordChars[j];
		       passwordChars[j] = temp;
            
          }
		return new String(passwordChars);
	}

	@Override
	public void displayCredentials(Employee employee) {
		
		System.out.println("Dear "+employee.getFirstName()+ " your generated credentials are as follows ");
		System.out.println("Email\t\t"+ employee.getEmail());
		System.out.println("Password\t"+employee.getPassword());
		
		
	}

	

	

}
