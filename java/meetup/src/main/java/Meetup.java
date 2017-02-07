import java.time.DayOfWeek;
import java.time.LocalDate;

public class Meetup {
	private int month,year;
	private LocalDate date, firstDay, lastDay,teenthDay;
	private LocalDate result;
	public Meetup(int month, int year) {
		this.month = month;
		this.year = year;
	}
	public LocalDate day(DayOfWeek day, MeetupSchedule schedule) {
		firstDay = LocalDate.parse(String.format("%d-%02d-01",year,month));
		date = firstDay.with(day);
		switch(schedule){
		case FIRST:
			result = date.getMonth().getValue()<month?date.plusWeeks(1):date;
			break;
		case SECOND:
			result = date.getMonth().getValue()<month?date.plusWeeks(2):date.plusWeeks(1);
			break;
		case THIRD:
			result = date.getMonth().getValue()<month?date.plusWeeks(3):date.plusWeeks(2);
			break;
		case FOURTH:
			result = date.getMonth().getValue()<month?date.plusWeeks(4):date.plusWeeks(3);
			break;
		case LAST:
			lastDay=LocalDate.of(year, month, firstDay.lengthOfMonth());
			if(lastDay.getDayOfWeek().getValue()>day.getValue())
				result = lastDay.with(day);
			else if(lastDay.getDayOfWeek().getValue()==day.getValue())
				result = lastDay;
			else if(lastDay.getDayOfWeek().getValue()<day.getValue())
				result = lastDay.minusWeeks(1).with(day);
			break;
		case TEENTH:
			teenthDay = LocalDate.parse(String.format("%d-%02d-13",year,month));
			if(teenthDay.getDayOfWeek().getValue()>day.getValue())
				result = teenthDay.plusWeeks(1).with(day);
			else if(teenthDay.getDayOfWeek().getValue()==day.getValue())
				result = teenthDay;
			else if(teenthDay.getDayOfWeek().getValue()<day.getValue())
				result = teenthDay.with(day);
			break;
		default:
			return null;
		}
		return result;
	}
}