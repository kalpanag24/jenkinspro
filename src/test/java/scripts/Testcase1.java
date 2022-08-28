package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase1 {
	@Test
	public void tc1() {
		Reporter.log("hello java", true);
	}

}
