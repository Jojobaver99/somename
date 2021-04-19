package com.example.testApp.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Books {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;
	
	@Column(name="bookname")
	private String bookName;
	
	@ManyToMany(mappedBy="books")
	private List<Authors> authors;
	@Override
    public String toString() {
		return bookName;
	}
	public List<Authors> getAuthors() {
	return authors;
}
	public void setAuthors(List<Authors> authors) {
	this.authors = authors;
}	
	public String getBookName() {
		return bookName;
	}
	public Integer getId() {
		return id;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
