package com.juaracoding.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.bdd.driver.DriverSingleton;

public class MethodPages {
	
	private WebDriver driver;
	LoginPage login = new LoginPage();
	TransactionPage transaction = new TransactionPage();
	
	public MethodPages() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void loginForm(String email, String password) {
		login.getBtn_sign_in().click();
		login.getInput_email_login().sendKeys(email);
		login.getInput_password_login().sendKeys(password);
		login.getBtn_submit_login().click();
	}
	
	public String getTxtWelcome() {
		return login.getTextLogin().getText();
	}
	
	public void orderItemWomen() {
		transaction.getClick_menu_women().click();
		scroll(driver,"900");
		transaction.getClick_item_women().click();

		driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));
		addItem(transaction.getBtn_adding_qty(), 3);
		select(transaction.getBtn_choose_size()).selectByValue("2");
		transaction.getBtn_pick_color().click();
		transaction.getBtn_add_to_cart().click();
		driver.switchTo().defaultContent();
		
		transaction.getBtn_proccess_check_out().click();
	}
	
	public void orderItemDresses() {
		transaction.getClick_menu_dresses().click();
		scroll(driver,"900");
		transaction.getClick_item_dresses().click();

		driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));
		addItem(transaction.getBtn_adding_qty(), 4);
		select(transaction.getBtn_choose_size()).selectByValue("1");
		transaction.getBtn_add_to_cart().click();
		driver.switchTo().defaultContent();
		
		transaction.getBtn_proccess_check_out().click();
	}
	
	public void orderItemTshirts() {
		transaction.getClick_menu_tshirts().click();
		scroll(driver,"600");
		transaction.getClick_item_tshirts().click();;

		driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));
		addItem(transaction.getBtn_adding_qty(), 5);
		select(transaction.getBtn_choose_size()).selectByValue("3");
		transaction.getBtn_add_to_cart().click();
		driver.switchTo().defaultContent();
		
		transaction.getBtn_proccess_check_out().click();
	}
	
	public void proccessTransactionItem() {
		scroll(driver,"900");
		transaction.getBtn_process_to_check_out().click();
		scroll(driver,"700");
		transaction.getMessage().sendKeys("Jl Anta Branta No 22");
		transaction.getBtn_process_to_check_out_address().click();
		scroll(driver,"500");
		transaction.getRadio_terms_accepted().click();
		transaction.getBtn_process_to_check_out_shipping().click();
		scroll(driver,"300");
		transaction.getClick_pay_by_check().click();
		scroll(driver,"400");
		transaction.getBtn_confirm_order().click();
		scroll(driver,"300");
	}
	
	//Added Method
	public static void scroll(WebDriver driver,String num) {
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0,"+num+")");
	}
	
	public static Select select(WebElement param) {
		Select var = new Select(param);
		return var;
	}
	
	public static void addItem(WebElement param,int qty) {
		for(int i=1;i<=qty;i++) {
			param.click();
		}
	}
	

}
