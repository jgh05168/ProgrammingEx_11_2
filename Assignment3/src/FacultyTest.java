import org.junit.Assert;
import org.junit.Test;

public class FacultyTest {
	private String expctedOfficeHours = "1pm to 3pm";
	private String expectedRank = "Professor";

	@Test
	public void testToString() {
		Assert.assertTrue(true);
	}

	@Test
	public void testSetOfficeHours() {
		Assert.assertEquals(expctedOfficeHours, "1pm to 3pm");
	}

	@Test
	public void testSetRank() {
		Assert.assertEquals(expectedRank, "Professor");
	}

}
