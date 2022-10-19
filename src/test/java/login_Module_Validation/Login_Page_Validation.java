package login_Module_Validation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base_Utility.Base_Class;

public class Login_Page_Validation extends Base_Class{
	 @BeforeClass
	 public void Before_Class_Activity() throws InterruptedException {
		 Browser_Launching("Chrome");
		 Initialize();
		 Static_Wait(2); 
	 }
	 @Test
	 public void Login_Test() {
		 fb_login.Enter_EmailID("gjjjh");
		 fb_login.Enter_Password("mnkjb");
		 fb_login.Click_Login();
		 
	 }
	 @AfterClass
	 public void After_Class_Activity() {
		 Quit_Browser();
	 }
}
