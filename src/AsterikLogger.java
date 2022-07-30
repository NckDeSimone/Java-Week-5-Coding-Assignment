
public class AsterikLogger implements Logger {

	private String asterikWord(String word) {
		return "***" + word + "***";
	}

	public void log(String log) {
		System.out.println(asterikWord(log));
	}

	public void error(String err) {
		String asterikError = asterikWord("ERROR: " + err);
		String asteriks = "*".repeat(asterikError.length());
		System.out.println(asteriks);
		System.out.println(asterikError);
		System.out.println(asteriks);
	}
}
