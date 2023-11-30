package in.ashokit;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.model.Book;
import in.ashokit.service.impl.BookServiceImpl;

public class Test {
	
	 public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

	        // Get the BookService bean from the context
	        BookServiceImpl bookServiceImpl = context.getBean(BookServiceImpl.class);

	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("ENTER YOUR BOOK TITLE :");
	        String bookTitle = sc.nextLine();
	        System.out.println("Enter BOOK AUTHOR :");
	        String bookAuthor = sc.nextLine();
	        // Create a new Book instance
	        Book book = new Book();
	        book.setTitle(bookTitle);
	        book.setAuthor(bookAuthor);

	        // Call the addBook method to insert the book
	        bookServiceImpl.addBook(book);

	        System.out.println("Book added successfully!");
	}
    
   

  

}
