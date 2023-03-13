package com.glearning.itapp.client;

import java.util.Scanner;

import com.glearning.itapp.model.Employee;
import com.glearning.itapp.service.CredentialServices;
import com.glearning.itapp.service.CredentialServicesImpl;

public class Client {

	public static void main(String[] args) {
		String firstName = "Sudha";
        String lastName = "Kumari";
	     Employee employee = new Employee(firstName,lastName);
         CredentialServices credentialService = new CredentialServicesImpl();
         System.out.println("Please enter the department from the following ");
         System.out.println("1. Technical");
         System.out.println("2. Admin");
         System.out.println("3. Human Resource");
         System.out.println("4. Legal");
         //Create the instance of scanner class
         Scanner sc = new Scanner(System.in);
         int option = sc.nextInt();
         
         switch (option) {
         case 1:{
        		String generatedEmail = credentialService.generateEmail(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(), "tech");
				String generatedPassword = credentialService.generateCredentials(12);
				employee.setEmail(generatedEmail);
				employee.setPassword(generatedPassword);
				credentialService.displayCredentials(employee);
				
            break;
        }
         case 2:{
        		String generatedEmail = credentialService.generateEmail(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(), "adm");
				String generatedPassword= credentialService.generateCredentials(12);
				employee.setEmail(generatedEmail);
				employee.setPassword(generatedPassword);
				credentialService.displayCredentials(employee);
				
            break;
        }
        case 3:{
            String generatedEmail = credentialService.generateEmail(employee.getFirstName().toLowerCase(),
            employee.getLastName().toLowerCase(), "hr");
            String generatedPassword = credentialService.generateCredentials(12);
            employee.setEmail(generatedEmail);
			employee.setPassword(generatedPassword);
			credentialService.displayCredentials(employee);
            break;
        }
        case 4:{
            String generatedEmail = credentialService.generateEmail(employee.getFirstName().toLowerCase(),
            employee.getLastName().toLowerCase(), "legal");
            String generatedPassword = credentialService.generateCredentials(12);
            employee.setEmail(generatedEmail);
			employee.setPassword(generatedPassword);
			credentialService.displayCredentials(employee);
            break;
        }
         default: {
					System.out.println("Enter a valid option");
					}       
         }

	}

}
