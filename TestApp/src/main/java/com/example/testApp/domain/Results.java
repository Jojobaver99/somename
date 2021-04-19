package com.example.testApp.domain;

import java.util.List;

public class Results {
	StringBuilder author;
	StringBuilder book;
	public Results(List<Authors> authors,List<Books> books) {
		author=new StringBuilder(authors.toString().replaceAll("^\\[|\\]$", "").replaceAll(","," "));
		book=new StringBuilder(books.toString().replaceAll("^\\[|\\]$", "")+System.lineSeparator());
	}
	public String getAuthor() {
		return author.toString();
	}
	public void setAuthor(String author) {
		this.author = new StringBuilder(author);
	}
	public String getBook() {
		return book.toString();
	}
	public void setBook(String book) {
		this.book = new StringBuilder(book);
	}

	
	
}
