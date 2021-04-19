package com.example.testApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.testApp.domain.Authors;
import com.example.testApp.domain.Books;
import com.example.testApp.repos.AuthorRepo;

@SpringBootApplication
public class DemoApp {
//@Autowired
//private AuthorRepo authorRepo;
public static void main(String[] args) {SpringApplication.run(DemoApp.class,args);}
	/*@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartUp() {
		Authors author=authorRepo.findByAuthorSurName("Толстой");
System.out.println(author.getAuthorName()+"  "+author.getAuthorSurName()+System.lineSeparator());
for(Books book:author.getBooks()) {
	System.out.println(book.getBookName());
}
}*/
}
