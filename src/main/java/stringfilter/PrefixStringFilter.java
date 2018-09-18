package stringfilter;

public class PrefixStringFilter implements StringFilter{

	
	int caracters;
	
	public PrefixStringFilter(int caracters) {
		this.caracters = caracters;
	}
	public String filter(String string) {
		return string.substring(0, caracters);
	}

}
