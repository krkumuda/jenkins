package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice2Test {

	@Test
	public void Practice2() {
		String browser = System.getProperty("b");
		String url = System.getProperty("u");
		Reporter.log("browser is=====>"+browser ,true);
		Reporter.log("url is=====>"+url ,true);
	}
}
