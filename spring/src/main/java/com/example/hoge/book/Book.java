package com.example.hoge.book;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {

	@Id
	@Column(name = "bookId")
	String bookId;

	@Column(name = "bookName")
	String bookName;
}
