package stringfilter;

public class PostfixStringFilter implements StringFilter{

	int caracters;
	
	public PostfixStringFilter(int caracters) {
		this.caracters = caracters;
	}
	public String filter(String string) {
		return string.substring(string.length() - caracters);
	}
}
