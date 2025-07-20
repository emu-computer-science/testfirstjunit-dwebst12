package testingDates;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DateSetDateTest {
	@Test
	public void legalDate1() {
		Date day1 = new Date(1, 20, 2020);
		day1.setDate("March", 2, 2021);
		assertEquals(new Date(3, 2, 2021), day1);
		}
	
	@Test
	public void legalDate2() {
		Date day2 = new Date(7, 3, 2020);
		day2.setDate("June", 3, 2020);
		assertEquals(new Date(6, 3, 2020), day2);
		}
	
	@Test
	public void legalDate3() {
		Date day3 = new Date(5, 15, 2015);
		day3.setDate("March", 2, 2021);
		assertEquals(new Date(2, 2, 2021), day3);
		}
	
	@Test
	public void illegalDate1() {
		Date day4 = new Date(1, 20, 2020);
		day4.setDate("HelloWorld", 2, 2021);
		assertEquals(new Date(1, 20, 2020), day4);
		}
	
	@Test
	public void illegalDate2() {
		Date day5 = new Date(7, 20, 2021);
		day5.setDate("July", 20000, 2021);
		assertEquals(new Date(7, 20, 2021), day5);
		}
	
	@Test
	public void illegalDate3() {
		Date day6 = new Date(7, 20, 2021);
		day6.setDate("July", 0, 2021);
		assertEquals(new Date(7, 20, 2021), day6);
		}
	
}
