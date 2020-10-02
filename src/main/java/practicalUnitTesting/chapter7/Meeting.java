package practicalUnitTesting.chapter7;

import java.time.LocalDateTime;

public class Meeting implements Event {

	private final LocalDateTime startDate;
	private final LocalDateTime endDate;

	public Meeting(LocalDateTime startDate, LocalDateTime endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}
}