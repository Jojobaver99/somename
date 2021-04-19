package com.example.testApp.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.testApp.domain.Message;

public interface MessageRepo extends CrudRepository<Message, Integer> {
List<Message> findByTag(String tag);
}
