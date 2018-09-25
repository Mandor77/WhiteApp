package org.ascotte.whiteapp.book.engine.repositories;

import org.ascotte.whiteapp.book.engine.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
