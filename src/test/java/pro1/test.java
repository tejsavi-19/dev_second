package pro1;
import org.testng.Assert;

import org.testng.annotations.Test;
public class test{
	@Test
	public void testPass() {
		Assert.assertEquals(devops.display(55), "pass");
		}
		@Test
		public void testFail() {
		Assert.assertEquals(devops.display(35), "fail");
		}
		@Test
		public void testInvalid() {
		Assert.assertEquals(devops.display(-5), "invalid");
		}
}
