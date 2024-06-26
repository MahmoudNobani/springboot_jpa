package com.example.jdbc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.jdbc.domain.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {

}
