package Java8LembdaEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DataTime {
	
	public static void main(String[] args) {
		 Date d1=new Date();
		 System.out.println(d1);

		 LocalDate d2=LocalDate.now();
		 System.out.println(d2);
		 
		 d2=d2.plusMonths(2);
		 LocalDateTime d3=LocalDateTime.now();
		 System.out.println(d3);
		 
		 LocalTime d4=LocalTime.now();
		 System.out.println(d4);
	}

}
