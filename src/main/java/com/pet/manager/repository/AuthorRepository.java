package com.pet.manager.repository;

import com.pet.manager.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends MongoRepository<Author, String> {
    Optional<Author> findAuthorByFirstName(String firstName);
    @Query("{'book.id' : ?0 }")
    List<Author> findByBookId(String bookId);
}
