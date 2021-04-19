package com.example.testApp.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.testApp.domain.Authors;


@Repository("mysql")
public interface AuthorRepo extends CrudRepository<Authors, Integer>{
	List <Authors> findById(int Id);
	List <Authors>  findByAuthorSurName(String authorSurName);
}
