// 자바 8 이전 - Date, Calendar 클래스 이용
// 자바 8 이후 - LocalDate, LocalTime, LocalDateTime 이용

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class KmaDatetime{
	public static void main(String[] args) {		
		String[] baseDateTime = { "", "" };
		
		getBaseDateTime(baseDateTime);
		
		System.out.println("날짜: " + baseDateTime[0]);
		System.out.println("시간: " + baseDateTime[1]);
	}
	
	public static void getBaseDateTime(String[] baseDateTime) {
		LocalDateTime now = LocalDateTime.now();
		
		if ((now.getHour() < 2) || (now.getHour() == 2 && now.getMinute() <= 10)) {
			now = now.minusDays(1);
			baseDateTime[0] = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
			baseDateTime[1] = "2300";
		}
		else {
			baseDateTime[0] = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
			
			if ((now.getHour() < 5) || (now.getHour() == 5 && now.getMinute() <= 10)) {
				baseDateTime[1] = "0200";
			}
			else if ((now.getHour() < 8) || (now.getHour() == 8 && now.getMinute() <= 10)) {
				baseDateTime[1] = "0500";
			}
			else if ((now.getHour() < 11) || (now.getHour() == 11 && now.getMinute() <= 10)) {
				baseDateTime[1] = "0800";
			}
			else if ((now.getHour() < 14) || (now.getHour() == 14 && now.getMinute() <= 10)) {
				baseDateTime[1] = "1100";
			}
			else if ((now.getHour() < 17) || (now.getHour() == 17 && now.getMinute() <= 10)) {
				baseDateTime[1] = "1400";
			}
			else if ((now.getHour() < 20) || (now.getHour() == 20 && now.getMinute() <= 10)) {
				baseDateTime[1] = "1700";
			}
			else if ((now.getHour() < 23) || (now.getHour() == 23 && now.getMinute() <= 10)) {
				baseDateTime[1] = "2000";
			}
			else {
				baseDateTime[1] = "2300";
			}
		}
	}
}
