package testingDates;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DateAddDaysTest {
	
	@Test
	public void stayInSameMonth() {
		Date day1 = new Date("January", 20, 2020);
		day1.addOneDay();
		assertEquals(new Date("January", 21, 2020), day1);
	
		
	}
	
	@Test
	public void stayInSameMonth2() {
		Date day2 = new Date("January", 21, 2020);
		day2.addOneDay();
		assertEquals(new Date("January", 22, 2020), day2);
		
	}
	
	@Test
	public void crossMonth() {
		Date day3 = new Date("October", 31, 2020);
		day3.addOneDay();
		assertEquals(new Date("November", 1, 2020), day3);
		
	}
	
	@Test
	public void crossMonth2() {
		Date day4 = new Date("July", 31, 2020);
		day4.addOneDay();
		assertEquals(new Date("August", 1, 2020), day4);
		
	}
	
	@Test
	public void crossYear() {
		Date day5 = new Date("December", 31, 2020);
		day5.addOneDay();
		assertEquals(new Date("January", 1, 2021), day5);
		
	}
	
	@Test
	public void crossYear2() {
		Date day6 = new Date("December", 31, 2020);
		day6.addOneDay();
		assertEquals(new Date("January", 1, 2021), day6);
		
	}
	
	
	

}
