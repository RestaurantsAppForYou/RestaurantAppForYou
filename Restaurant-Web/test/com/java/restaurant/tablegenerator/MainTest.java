package com.java.restaurant.tablegenerator;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainTest {

	 enum BonusType {
	
		  MONTHLY(1), YEARLY(2), ONE_OFF(3);
		 public final int id;

		  BonusType(int id) {
		    this.id = id;
		  }
		
		  @Override
		public String toString() {
			// TODO Auto-generated method stub
			return "1";
		}
		}
	
	public static void main(String[] args) {
		
		
//		System.out.println(BonusType.MONTHLY);
		
		
		Calendar c = GregorianCalendar.getInstance();
		

		c.setTime(new Date());
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
}
