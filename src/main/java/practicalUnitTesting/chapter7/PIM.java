package practicalUnitTesting.chapter7;

import java.time.LocalDateTime;

public class PIM {

	private Calendar calendar;

	public PIM(Calendar calendar) {
		this.calendar = calendar;
	}

	public void addMeeting(LocalDateTime startDate, int durationInMinutes) {
		LocalDateTime endDate = startDate.plusMinutes(durationInMinutes);
		Meeting meeting = new Meeting(startDate, endDate);
		calendar.addEvent(meeting);
	}
}