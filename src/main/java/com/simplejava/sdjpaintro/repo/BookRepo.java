package com.simplejava.sdjpaintro.repo;

import com.simplejava.sdjpaintro.domain.Book;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Id> {
}
