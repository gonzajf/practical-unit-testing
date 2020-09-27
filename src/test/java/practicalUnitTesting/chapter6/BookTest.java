package practicalUnitTesting.chapter6;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class BookTest {
	
	private static final String TITLE = "title";
	
	@Test
	public void bookTestWithMatchers() {
		Book book = new Book(TITLE);
		assertThat(book.getTitle(), not(blankOrNullString()));
		assertThat(book.getTitle(), is(TITLE));
	}
}