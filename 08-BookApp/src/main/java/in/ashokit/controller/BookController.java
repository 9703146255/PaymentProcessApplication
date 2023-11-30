package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.model.Book;
import in.ashokit.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/add")
    public String addBook(Book book) {
        bookService.addBook(book);
        return "redirect:/books"; // Redirect to the book list page
    }
    

}
