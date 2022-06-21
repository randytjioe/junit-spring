package com.juaracoding.bdd;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.bdd.config.AutomationFrameworkConfig;
import com.juaracoding.bdd.driver.DriverSingleton;
import com.juaracoding.bdd.pages.MethodPages;
import com.juaracoding.bdd.utils.ConfigurationProperties;
import com.juaracoding.bdd.utils.Constants;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {

	private static WebDriver driver;
	MethodPages method;
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void setUp() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		method = new MethodPages();
	}
	
	@AfterAll
	public static void quitDriver() {
		tunggu(5);
		driver.quit();
	}
	
	@Given("Customer mengakses url")
	public void customer_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}
	
	@And("Customer login dengan username dan password")
	public void customer_login_dengan_username_password() {
		method.loginForm(configurationProperties.getEmail(), configurationProperties.getPassword());
	}

	@When("Customer berhasil login")
	public void customer_berhasil_login() {
		driver.navigate().refresh();
		tunggu(2);
		assertEquals(configurationProperties.getTxtWelcome(), method.getTxtWelcome());
	}
	
	@And("Customer Memilih Produk Pakaian Wanita")
	public void customer_memilih_produk_wanita() {
		method.orderItemWomen();
	}
	
	@And("Customer Memilih Produk Pakaian Gaun")
	public void customer_memilih_produk_gaun() {
		method.orderItemDresses();
	}
	
	@And("Customer Memilih Produk Pakaian Kaos")
	public void customer_memilih_produk_kaos() {
		method.orderItemTshirts();
	}
	
	@Then("Customer Berhasil Melakukan Transaksi Pembayaran")
	public void customer_memilih_kategori_pakaian() {
		method.proccessTransactionItem();
	}

	
	public static void tunggu(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
