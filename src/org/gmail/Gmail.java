package org.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Gmail\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail&hl=en&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("senthil");
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("kumaran");
		
		WebElement password = driver.findElement(By.name("Passwd"));
		password.sendKeys("password");
		
		WebElement confirm = driver.findElement(By.name("ConfirmPasswd"));
		confirm.sendKeys("password");
		
		
	}

}
