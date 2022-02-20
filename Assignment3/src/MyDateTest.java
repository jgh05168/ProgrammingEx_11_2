import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.Test;

public class MyDateTest {
	GregorianCalendar date = new GregorianCalendar();
	private int expectedYear = date.get(GregorianCalendar.YEAR);
	private int expectedMonth = date.get(GregorianCalendar.MONTH);
	private int expectedDay = date.get(GregorianCalendar.DAY_OF_MONTH);
	private MyDate test = new MyDate();

	@Test
	public void testSetYear() {
		assertEquals(expectedYear, test.getYear());
	}

	@Test
	public void testSetMonth() {
		assertEquals(expectedMonth, test.getMonth());
	}

	@Test
	public void testSetDay() {
		assertEquals(expectedDay, test.getDay());
	}

}
