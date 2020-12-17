package Stepdefinations;

import Amazonimplementaion.Product;
import Amazonimplementaion.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Searchsteps {
	
	 Product product;
	 Search search;
	
	
	
	

@Given("I have a search field on Amazon Page")
public void i_have_a_search_field_on_amazon_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("step1: I am on Search Page");
   
}

@When("I Search for a product with name {string} an Price {int}")
public void i_search_for_a_product_with_name_an_price(String productName, Integer price) {
    // Write code here that turns the phrasthe e above into concrete actions
	System.out.println("step2: Search the Product with name : "+productName+"Price :"+price);
	product=new Product(productName,price);
   
}

@Then("Product with name {string} should be displayed.")
public void product_with_name_should_be_displayed(String productName) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("step3");
	
	search =new Search();
	String name=search.displayProduct(product);
	System.out.println("searched product is :"+name);
	Assert.assertEquals(product.getProductName(), name);
	
	
   
}


}
