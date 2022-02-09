package tests;

import model.User;

public class UserTests {
	public static void main(String[] args) {
//		User testUser = new User("mike", "my_passwd", "Mike", "Smith", "07771234567");
//		
//		System.out.println(testUser);
//		
		
//		Automated Testing
		String testUsername = "mike";
		String testPassword = "my_password";
		String testFirstName = "Mike";
		String testLastName = "Smith";
		String testMobileNumber = "07771234567";
		
		User testUser = new User(
			testUsername, testPassword, testFirstName,
			testLastName, testMobileNumber
		);
		
		Boolean passed = true;
		
		if (testUser.getUsername() != testUsername) {
			System.out.println("TC1 failed: username did not match");
			passed = false;
		}
		
		if (testUser.getPassword() != testPassword) {
			System.out.println("TC2 failed: password did not match");
			passed = false;
		}
		
		if (testUser.getFirstName() != testFirstName) {
			System.out.println("TC3 failed: first name did not match");
			passed = false;
		}
		
		if (testUser.getLastName() != testLastName) {
			System.out.println("TC4 failed: last name did not match");
			passed = false;
		}
		
		if (testUser.getMobileNumber() != testMobileNumber) {
			System.out.println("TC5 failed: mobile number did not match");
			passed = false;
		}
		
		//using assert's
		
		assert testUser.getUsername() == testUsername;
		//assert 1==2
		assert testUser.getPassword() == testPassword;
		
		assert testUser.getFirstName() == testFirstName;
		
		assert testUser.getLastName() == testLastName;
		
		assert testUser.getMobileNumber() == testMobileNumber;
		
		System.out.println("All java assertions in the test suite passed (none failed).");
		
		if (passed)
			System.out.println("All TCs passed.");
	}

}
