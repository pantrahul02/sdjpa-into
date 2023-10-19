package com.simplejava.sdjpaintro.bootstrap;

import com.simplejava.sdjpaintro.domain.Book;
import com.simplejava.sdjpaintro.repo.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final BookRepo bookRepo;

    public DataInitializer(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }


    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("Domain Driven Design", "123", "RandomHouse");
        System.out.println("Id :"+book1.getId());
        Book saveBook1 = bookRepo.save(book1);
        System.out.println("Id :"+book1.getId());
        Book book2 = new Book("System Design and Analysis", "222", "Oreaily");
        Book saveBook2 = bookRepo.save(book2);

        bookRepo.findAll().forEach(book -> {
            System.out.println(book.getId());
            System.out.println(book.getTitle());
        });

    }
}
