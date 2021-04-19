package com.example.testApp.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.testApp.domain.Books;



public interface BooksRepo extends CrudRepository<Books, Integer>{

}
