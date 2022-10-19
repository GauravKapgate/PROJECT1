package base_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import login_Module.FB_Login_Page;

public class Base_Class {
  public static WebDriver driver;
  public static Utility_Class ul;
  public static FB_Login_Page fb_login;
	
	
	public static void Initialize() {
		fb_login= new FB_Login_Page(driver);
		ul= new Utility_Class(driver);
	}
	public static void Browser_Launching(String Browser_Name ) {
		
		if (Browser_Name.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\Automation\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}else
			System.out.println("No such Driver Found");
			driver.manage().window().maximize();
	}
		
	public static void Quit_Browser() {
		driver.quit();
	}
	public static void Static_Wait(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}
	public static String Get_Property(String key) throws IOException {
		Properties PR=new Properties();
		FileInputStream FIS= new FileInputStream(System.getProperty("user.dir")+"FB_Data_File.properties");
		PR.load(FIS);
		return PR.getProperty(key);
		
		
	}
	
}
