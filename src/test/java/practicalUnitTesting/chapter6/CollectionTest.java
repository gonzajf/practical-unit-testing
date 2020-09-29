package practicalUnitTesting.chapter6;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.collection.IsMapContaining.hasKey;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

public class CollectionTest {

	@Test
	public void collectionsUtilityMethods() {

		Set<String> setA = new LinkedHashSet<String>();
		String s1 = "s1";
		String s2 = "s2";

		setA.add(s1);
		setA.add(s2);

		assertThat(setA, hasItem(s1));
		assertThat(setA, hasItem(s2));
		assertThat(setA, not(hasItem("xyz")));
	}

	@Test
	public void mapsUtilityMethods() {

		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		map.put("a", 2);
		map.put("b", 3);

		assertThat(map, hasEntry("a", 2));
		assertThat(map, hasKey("b"));
	}

	@Test
	public void lookingIntoProperties() {
		Set<Book> books = new HashSet<Book>();
		books.add(new Book("Odyssey"));
		books.add(new Book("Hobbit"));
		assertThat(books, hasItem(hasProperty("title", is("Hobbit"))));
	}
}
