package fr.htc.library.model;

public class Book {

	static int sequence = 10;
	String cote;
	String title;
	String author;
	String year;

	public Book(String title, String author, String year) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.cote = generateCote();
	}

	/**
	 * Cette methode permet de g�n�rer la cote du livre sous le format AUAA-XXX
	 * @return
	 */
	private String generateCote() {
		StringBuilder sb = new StringBuilder(this.author.substring(0, 2).toUpperCase());
		sb.append(year.substring(2, 4));
		sb.append("-" + sequence++);

		return sb.toString();
	}

	@Override
	public String toString() {
		return "Book [cote=" + cote + ", title=" + title + ", author=" + author + ", year=" + year + "]";
	}

	
}
