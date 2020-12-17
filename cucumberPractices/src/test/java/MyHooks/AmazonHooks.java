package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AmazonHooks {
	
	@Before
	public void setup() {
		System.out.println("Launch amazon application");
	}
	
	@After
	public void teardown() {
		
		System.out.println("close the amazon browser");
		System.out.println("close the amazon browser1");
		
	}

}
