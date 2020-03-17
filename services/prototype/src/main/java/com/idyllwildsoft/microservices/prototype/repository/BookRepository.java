package com.idyllwildsoft.microservices.prototype.repository;

import com.idyllwildsoft.microservices.prototype.businessobject.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
