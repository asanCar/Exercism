import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
	private LocalDateTime birth;
	public Gigasecond(LocalDate birthday){
		birth = birthday.atStartOfDay();
	}
	public Gigasecond(LocalDateTime birthday){
		birth = birthday;
	}
	public LocalDateTime getDate(){
		return birth.plusSeconds((long)Math.pow(10, 9));
	}
}