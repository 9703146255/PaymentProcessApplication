package in.ashokit.service.impl;

import in.ashokit.dao.BookDao;
import in.ashokit.model.Book;
import in.ashokit.service.BookService;

public class BookServiceImpl implements BookService{
	
	private final BookDao bookDao;

	public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void addBook(Book book) {
        // You can add business logic here if needed
    	bookDao.insertBook(book);
    }

    // Implement other business logic methods as needed

}
