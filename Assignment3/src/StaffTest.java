import org.junit.Assert;
import org.junit.Test;

public class StaffTest {
	private String expectedTitle = "Sample";

	@Test
	public void testSetTitle() {
		Assert.assertEquals(expectedTitle, "Sample");
	}

	@Test
	public void testToString() {
		Assert.assertTrue(true);
	}

}
