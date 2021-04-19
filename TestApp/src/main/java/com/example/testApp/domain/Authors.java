package com.example.testApp.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="authors")
public class Authors {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;
	
	@Column(name="authorname") 
	private String authorName;
	
	@Column(name="authorsurname") 
	private String authorSurName;
	@Override
    public String toString() {
		return authorName+" "+authorSurName;
	}
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="dependencies",
	joinColumns=@JoinColumn(name="authorid"),
	inverseJoinColumns=@JoinColumn(name="bookid"))
	private List<Books> books;
	
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	public List<Books> getBooks() {
		return books;
	}
	public String getAuthorSurName() {
		return authorSurName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public Integer getId() {
		return id;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setAuthorSurName(String authorSurName) {
		this.authorSurName = authorSurName;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
