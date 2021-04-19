package com.example.testApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.testApp.domain.Authors;
import com.example.testApp.domain.Books;
import com.example.testApp.domain.Message;
import com.example.testApp.domain.Results;
import com.example.testApp.repos.AuthorRepo;
import com.example.testApp.repos.BooksRepo;
import com.example.testApp.repos.MessageRepo;

@Controller
public class GreetingController {
@Autowired
private AuthorRepo authorRepo;
@Autowired
private BooksRepo booksRepo;
@GetMapping
public String main(Map<String, Object> model) {
    List<Authors> authors = (List<Authors>) authorRepo.findAll();
    List<Books> books=new ArrayList<Books>();
    for(Authors author:authors) {
    	for(Books book:author.getBooks())
    	books.add(book);
    }
    System.out.println(books);
    Results res=new Results(authors , books);
    model.put("messages", res);

    return "main";
}
@GetMapping("/greeting")
public String greeting(
        @RequestParam(name="name", required=false, defaultValue="World") String name,
        Map<String, Object> model
) {
    model.put("name", name);
    return "greeting";
}
	@PostMapping("filter")
	public String filter(@RequestParam String filter, Map<String,Object> model) {
		List<Authors> authors;
		if(filter!=null&&!filter.isEmpty()) {
			authors=authorRepo.findByAuthorSurName(filter);
		}else {
			authors=(List<Authors>) authorRepo.findAll();
		}
		Results res=new Results(authors,
				authors.get(0).getBooks());
		model.put("messages",res);
		return "main";
	}

}