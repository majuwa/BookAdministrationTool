package Work;

/**
 * Class to privide a simple Book
 * @author Maximilian
 *
 */
public class Books {
	private String author;
	private String title;
	private String isbn;
	private String isbn_10;
	/**
	 * Gets a String with the name/s of the author
	 * @return {@link String} Author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * Set to the current Books the Autho
	 * @param author authorname
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * Get the Current-Title of the Book
	 * @return
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Set the Tilte of the books
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * Get the isbn of the book
	 * @return
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * Set the isbn-code of the book
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getIsbn_10() {
		return isbn_10;
	}
	public void setIsbn_10(String isbn_10) {
		this.isbn_10 = isbn_10;
	}
	public Books(String author, String title, String isbn, String isbn_10) {
		super();
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.isbn_10 = isbn_10;
	}
	public Books(String title){
		this(null,title,null,null);
	}
	public Books(String author, String title){
		this(author,title,null,null);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
}
