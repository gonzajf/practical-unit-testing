package practicalUnitTesting.chapter7;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.time.LocalDateTime;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

public class PIMTest {

	private static final int ONE_HOUR = 60;
	private static final LocalDateTime START_DATE = LocalDateTime.of(2020, 10, 01, 12, 00);
	private static final LocalDateTime END_DATE = START_DATE.plusMinutes(ONE_HOUR);

//	@Test
//	public void shouldAddNewEventToCalendar() {
//		Calendar calendar = mock(Calendar.class);
//		PIM pim = new PIM(calendar);
//		Meeting expectedMeeting = new Meeting(START_DATE, END_DATE);
//		pim.addMeeting(START_DATE, ONE_HOUR);
//		verify(calendar).addEvent(expectedMeeting);
//	}

	@Test
	public void shouldAddNewEventToCalendar() {
		
		Calendar calendar = mock(Calendar.class);
		PIM pim = new PIM(calendar);
		ArgumentCaptor<Meeting> argument = ArgumentCaptor.forClass(Meeting.class);
		
		pim.addMeeting(START_DATE, ONE_HOUR);
		
		verify(calendar).addEvent(argument.capture());
		Meeting meeting = argument.getValue();
		
		assertEquals(START_DATE, meeting.getStartDate());
		assertEquals(END_DATE, meeting.getEndDate());
	}

}
