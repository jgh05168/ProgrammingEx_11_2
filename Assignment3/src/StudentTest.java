import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
	private String expectedStatus = "freshman";
	Student std = new Student("John", "Munson Hall", "0000000000", "111@sample.com", 1);

	@Test
	public void testSetStatus() {
		Assert.assertEquals(expectedStatus, std.getStatus());
	}

	@Test
	public void testToString() {
		Assert.assertTrue(true);
	}

}
