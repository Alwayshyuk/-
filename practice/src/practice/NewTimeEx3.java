package practice;

import java.time.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.*;
import static java.time.DayOfWeek.*;
import java.time.temporal.TemporalAdjuster.*;

public class NewTimeEx3 {

	static void p(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate date = today.with(new DayAfterTomorrow());
		
		p(today);
		p(date);
		p(today.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()));
		
		

	}

}

class DayAfterTomorrow implements TemporalAdjuster{
	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(2, ChronoUnit.DAYS);
	}
}
