/**
 * 
 */
package duke.learn.spring.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import duke.learn.spring.model.Book;

/**
 * @author Kazi
 *
 */
public interface BookRepository extends CrudRepository<Book, Integer> {

    List<Book> findByTitle(String title);

}
