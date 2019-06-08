/**
 * 
 */
package duke.learn.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import duke.learn.spring.exception.BookIdMismatchException;
import duke.learn.spring.exception.BookNotFoundException;
import duke.learn.spring.model.Book;
import duke.learn.spring.repo.BookRepository;

/**
 * @author Kazi
 *
 */
@RestController
@RequestMapping(path = "/api/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public Iterable findAll() {
	return bookRepository.findAll();
    }

    @GetMapping("/title/{bookTitle}")
    public List findByTitle(@PathVariable String bookTitle) {
	return bookRepository.findByTitle(bookTitle);
    }

    @GetMapping("/{id}")
    public Book findOne(@PathVariable Integer id) {
	return bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book create(@RequestBody Book book) {
	return bookRepository.save(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
	bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
	bookRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable Integer id) {
	if (book.getId() != id) {
	    throw new BookIdMismatchException();
	}
	bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
	return bookRepository.save(book);
    }
}
