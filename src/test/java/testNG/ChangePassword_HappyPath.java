package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePassword_HappyPath {

	@Test(priority = 1, groups = "login")
	public void pre_condition1_CreatingAccount() {
		System.out.println("succesfully create an account");
	}

	@Test(priority = 2, groups = "login")
	public void pre_condition2_LogingIn() {
		System.out.println("succesfully login to the account");
	}

	@Test(priority = 3, groups = "login")
	public void condition_ChangingPassword() {
		System.out.println("succesfully change the password");
		System.out.println("Login again and verify the password is changed");
		Assert.assertTrue(false);
	}

}
