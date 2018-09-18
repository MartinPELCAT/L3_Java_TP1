package stringfilter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class StringFilterTest {

	@Test
	public void upperCaseStringFilter() {
		String input = "toto";
		StringFilter filter = new UpperCaseStringFilter();
		String output = filter.filter(input);
		assertThat(output, equalTo("TOTO"));
	}
	
	@Test
	public void lowerCaseStringFilter() {
		String input = "TOTO";
		StringFilter filter = new LowerCaseStringFilter();
		String output = filter.filter(input);
		assertThat(output, equalTo("toto"));
	}
	
	@Test
	public void prefixStringFilter() {
		String input = "toto";
		StringFilter filter = new PrefixStringFilter(3);
		String output = filter.filter(input);
		assertThat(output, equalTo("tot"));
	}
	
	@Test
	public void postfixStringFilter() {
		String input = "toto";
		StringFilter filter = new PostfixStringFilter(3);
		String output = filter.filter(input);
		assertThat(output, equalTo("oto"));
	}
	
	@Test
	public void asciiStringFilter() {
		String input = "toto";
		StringFilter filter = new AsciiStringFilter();
		String output = filter.filter(input);
		assertThat(output, equalTo("TOTO"));
	}
}
