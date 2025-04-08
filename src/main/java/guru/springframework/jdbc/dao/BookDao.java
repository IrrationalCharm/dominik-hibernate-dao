package guru.springframework.jdbc.dao;

import guru.springframework.jdbc.domain.Book;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookDao {

    Book getById(Long id);

    Book findBookByTitle(String title);

    Book findBookByTitleUsingNamedQuery(String title);

    List<Book> findAll();

    Book saveNewBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(Long id);

    Book findByISBN(String isbn);

    Book findAuthorByNameNative(String cleanCode);

    List<Book> findAllBooksPaging(Pageable pageable);

    List<Book> findAllBooksSortByTitle(Pageable pageable);
}
