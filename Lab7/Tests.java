

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author applekw. Created Apr 15, 2011.
 */
public class Tests extends SeleneseTestCase {

	

	
		@Before
		public void setUp() throws Exception {
			selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.rose-hulman.edu/");
			selenium.start();
		}

		@Test
		public void testTask7_test() throws Exception {
			selenium.open("/");
			selenium.click("link=Offices & Services");
			selenium.waitForPageToLoad("30000");
			selenium.click("link=Registrar");
			selenium.waitForPageToLoad("30000");
			selenium.click("css=a > strong");
			selenium.waitForPageToLoad("30000");
			selenium.click("//div/ul/li[2]/a/span");
			selenium.waitForPageToLoad("30000");
			selenium.click("css=div.leftColRegL3 > ul > li:nth(5) > a");
			selenium.waitForPageToLoad("30000");
			selenium.click("css=h2 > a");
			selenium.waitForPageToLoad("30000");
			selenium.type("id1", "applekw");
			selenium.click("bt1");
			selenium.waitForPageToLoad("30000");
			verifyTrue(selenium.isTextPresent("CSSE376"));
		}

		@After
		public void tearDown() throws Exception {
			selenium.stop();
		}
}
