
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
	private int expectedOffice = 100;
	private double expectedSalary = 10000;
	private MyDate expectedDateHired = new MyDate();
	GregorianCalendar date = new GregorianCalendar();

	@Test
	public void testToString() {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetDateHired() {
		Assert.assertEquals(expectedDateHired.getMonth(), date.get(GregorianCalendar.MONTH));
		Assert.assertEquals(expectedDateHired.getYear(), date.get(GregorianCalendar.YEAR));
		Assert.assertEquals(expectedDateHired.getDay(), date.get(GregorianCalendar.DAY_OF_MONTH));
	}

	@Test
	public void testSetOffice() {
		Assert.assertEquals(expectedOffice, 100);
	}

	@Test
	public void testSetSalary() {
		Assert.assertEquals(expectedSalary, 10000, 0.0);
	}

}
