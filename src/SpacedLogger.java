
public class SpacedLogger implements Logger {

	private StringBuilder spacedWord(String word) {

		StringBuilder spacedWord = new StringBuilder();

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			spacedWord.append(letter).append(" ");
		}
		spacedWord.setLength(spacedWord.length() - 1);
		return spacedWord;
	}

	public void log(String log) {
		System.out.println(spacedWord(log));
	}

	public void error(String err) {
		System.out.println("ERROR: " + spacedWord(err));
	}
}
