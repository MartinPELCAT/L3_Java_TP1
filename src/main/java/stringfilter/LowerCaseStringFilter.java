package stringfilter;

public class LowerCaseStringFilter implements StringFilter{

	public String filter(String string) {
		return string.toLowerCase();
	}

}
