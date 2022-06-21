package com.juaracoding.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.bdd.driver.DriverSingleton;

public class TransactionPage {

	private WebDriver driver;
	
	public TransactionPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#block_top_menu > ul > li:nth-child(1)")
	private WebElement click_menu_women;
	
	@FindBy(css="#block_top_menu > ul > li:nth-child(2)")
	private WebElement click_menu_dresses;

	@FindBy(css="#block_top_menu > ul > li:nth-child(3)")
	private WebElement click_menu_tshirts;
	
	@FindBy(css="#center_column > ul > li:nth-child(2) > div > div.left-block > div > a.product_img_link")
	private WebElement click_item_women;
	
	@FindBy(css="#center_column > ul > li:nth-child(2) > div > div.left-block > div > a.product_img_link")
	private WebElement click_item_dresses;
	
	@FindBy(css="#center_column > ul > li > div > div.left-block > div > a.product_img_link")
	private WebElement click_item_tshirts;
	
	@FindBy(css="#quantity_wanted_p > a.btn.btn-default.button-plus.product_quantity_up > span > i")
	private WebElement btn_adding_qty;
	
	@FindBy(id="group_1")
	private WebElement btn_choose_size;
	
	@FindBy(id="color_8")
	private WebElement btn_pick_color;
	
	@FindBy(id="add_to_cart")
	private WebElement btn_add_to_cart;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	private WebElement btn_proccess_check_out;
			
	@FindBy(css="#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
	private WebElement btn_process_to_check_out;
	
	@FindBy(name="message")
	private WebElement message;
	
	@FindBy(css="#center_column > form > p > button")
	private WebElement btn_process_to_check_out_address;
	
	@FindBy(id="cgv")
	private WebElement radio_terms_accepted;
	
	@FindBy(css="#form > p > button")
	private WebElement btn_process_to_check_out_shipping;
	
	@FindBy(css="#HOOK_PAYMENT > div:nth-child(2) > div > p > a")
	private WebElement click_pay_by_check;
	
	@FindBy(css="#cart_navigation > button")
	private WebElement btn_confirm_order;
	
	@FindBy(css="#center_column > p.alert.alert-success")
	private WebElement text_order_completed;
//	Your order on My Store is complete.
	
	public WebElement getBtn_process_to_check_out() {
		return btn_process_to_check_out;
	}

	public void setBtn_process_to_check_out(WebElement btn_process_to_check_out) {
		this.btn_process_to_check_out = btn_process_to_check_out;
	}

	public WebElement getMessage() {
		return message;
	}

	public void setMessage(WebElement message) {
		this.message = message;
	}

	public WebElement getBtn_process_to_check_out_address() {
		return btn_process_to_check_out_address;
	}

	public void setBtn_process_to_check_out_address(WebElement btn_process_to_check_out_address) {
		this.btn_process_to_check_out_address = btn_process_to_check_out_address;
	}

	
	public WebElement getClick_menu_women() {
		return click_menu_women;
	}

	public void setClick_menu_women(WebElement click_menu_women) {
		this.click_menu_women = click_menu_women;
	}

	public WebElement getClick_menu_dresses() {
		return click_menu_dresses;
	}

	public void setClick_menu_dresses(WebElement click_menu_dresses) {
		this.click_menu_dresses = click_menu_dresses;
	}

	public WebElement getClick_menu_tshirts() {
		return click_menu_tshirts;
	}

	public void setClick_menu_tshirts(WebElement click_menu_tshirts) {
		this.click_menu_tshirts = click_menu_tshirts;
	}

	public WebElement getClick_item_women() {
		return click_item_women;
	}

	public void setClick_item_women(WebElement click_item_women) {
		this.click_item_women = click_item_women;
	}

	public WebElement getClick_item_dresses() {
		return click_item_dresses;
	}

	public void setClick_item_dresses(WebElement click_item_dresses) {
		this.click_item_dresses = click_item_dresses;
	}

	public WebElement getClick_item_tshirts() {
		return click_item_tshirts;
	}

	public void setClick_item_tshirts(WebElement click_item_tshirts) {
		this.click_item_tshirts = click_item_tshirts;
	}

	public WebElement getBtn_adding_qty() {
		return btn_adding_qty;
	}

	public void setBtn_adding_qty(WebElement btn_adding_qty) {
		this.btn_adding_qty = btn_adding_qty;
	}

	public WebElement getBtn_choose_size() {
		return btn_choose_size;
	}

	public void setBtn_choose_size(WebElement btn_choose_size) {
		this.btn_choose_size = btn_choose_size;
	}

	public WebElement getBtn_pick_color() {
		return btn_pick_color;
	}

	public void setBtn_pick_color(WebElement btn_pick_color) {
		this.btn_pick_color = btn_pick_color;
	}

	public WebElement getBtn_add_to_cart() {
		return btn_add_to_cart;
	}

	public void setBtn_add_to_cart(WebElement btn_add_to_cart) {
		this.btn_add_to_cart = btn_add_to_cart;
	}

	public WebElement getBtn_proccess_check_out() {
		return btn_proccess_check_out;
	}

	public void setBtn_proccess_check_out(WebElement btn_proccess_check_out) {
		this.btn_proccess_check_out = btn_proccess_check_out;
	}

	public WebElement getRadio_terms_accepted() {
		return radio_terms_accepted;
	}

	public void setRadio_terms_accepted(WebElement radio_terms_accepted) {
		this.radio_terms_accepted = radio_terms_accepted;
	}

	public WebElement getBtn_process_to_check_out_shipping() {
		return btn_process_to_check_out_shipping;
	}

	public void setBtn_process_to_check_out_shipping(WebElement btn_process_to_check_out_shipping) {
		this.btn_process_to_check_out_shipping = btn_process_to_check_out_shipping;
	}

	public WebElement getClick_pay_by_check() {
		return click_pay_by_check;
	}

	public void setClick_pay_by_check(WebElement click_pay_by_check) {
		this.click_pay_by_check = click_pay_by_check;
	}

	public WebElement getBtn_confirm_order() {
		return btn_confirm_order;
	}

	public void setBtn_confirm_order(WebElement btn_confirm_order) {
		this.btn_confirm_order = btn_confirm_order;
	}

	public WebElement getText_order_completed() {
		return text_order_completed;
	}

	public void setText_order_completed(WebElement text_order_completed) {
		this.text_order_completed = text_order_completed;
	}	
	
	
}
