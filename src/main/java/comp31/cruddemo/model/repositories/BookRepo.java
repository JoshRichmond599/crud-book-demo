package comp31.cruddemo.model.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import comp31.cruddemo.model.entities.Author;
import comp31.cruddemo.model.entities.Book;

@Repository
public interface BookRepo extends CrudRepository<Book,Long>{
    List<Book> findByAuthor(Author author);
}
