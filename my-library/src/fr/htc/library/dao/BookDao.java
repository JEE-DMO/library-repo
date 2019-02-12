package fr.htc.library.dao;

import java.util.List;

import fr.htc.library.model.Book;

public interface BookDao {

	List<Book> getAllBooks();

	Book getBookByCote(String cote);

	void save(Book book);

	void remove(String cote);

	void remove(Book book);

	List<Book> getAvailableBooks();

}
