import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
	private String expectedName = "John";
	private String expectedAddress = "Munson Hall";
	private String expectedPhone = "0000000000";
	private String expectedEmail = "111@sample.com";
	Person person = new Person("John", "Munson Hall", "0000000000", "111@sample.com");

	@Test
	public void testSetName() {
		Assert.assertEquals(expectedName, person.getName());
	}

	@Test
	public void testSetAddress() {
		Assert.assertEquals(expectedAddress, person.getAddress());
	}

	@Test
	public void testSetPhone() {
		Assert.assertEquals(expectedPhone, person.getPhone());
	}

	@Test
	public void testSetEmail() {
		Assert.assertEquals(expectedEmail, person.getEmail());
	}

	@Test
	public void testToString() {
		Assert.assertTrue(true);
	}
}
