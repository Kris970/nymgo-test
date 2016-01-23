package com.globallogic.open.nymgo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class PageDriverTest {
	@Test
	public void pageOpen() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://secure.nymgo.com/");
		// WebElement btnSignIn =
		// driver.findElement(By.xpath("html/body/header/div/div/div[3]/ul/li[2]/a"));
		// btnSignIn.click();
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='username-el']")));
		// WebElement username =
		// driver.findElement(By.xpath(".//*[@id='username-el']"));
		// username.sendKeys("live.promo1");
		// WebElement password =
		// driver.findElement(By.xpath(".//*[@id='Password-el']"));
		// password.sendKeys("1234567");
		//
		// WebElement makeSignIn =
		// driver.findElement(By.xpath(".//*[@id='user-login-el']"));
		// makeSignIn.click();
		WebElement btnJoinNow = driver.findElement(By.xpath("html/body/section[1]/div/div/div/a"));
		btnJoinNow.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='full_name-el']")));
		WebElement fullName = driver.findElement(By.xpath(".//*[@id='full_name-el']"));
		fullName.sendKeys("qatest");
		WebElement username = driver.findElement(By.xpath(".//*[@id='Username-Email-el']"));
		username.sendKeys("qatest.auto1");
		WebElement password = driver.findElement(By.xpath(".//*[@id='Password-el' and @name='password']"));
		password.sendKeys("123456");
		WebElement confirmPassword = driver.findElement(By.xpath(".//*[@id='Password-el' and @name='confirm_password']"));
		confirmPassword.sendKeys("123456");
		WebElement email = driver.findElement(By.xpath(".//*[@id='Email-el']"));
		email.sendKeys("s.upernatural1501@gmail.com");
		WebElement mobile = driver.findElement(By.xpath(".//*[@id='mobile-el']"));
		mobile.sendKeys("+380323232");
		WebElement btnJoin = driver.findElement(By.xpath(".//*[@id='send-btn-el']"));
		btnJoin.click();
		
	//driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		
		
 
		// driver.close();

	}
}
