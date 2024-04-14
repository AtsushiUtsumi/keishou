package com.example.hoge.book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

	@GetMapping("/list")
	public String list() {
		return "book/list";
	}

	@GetMapping("/edit")
	public String edit(Model model) {

		final Book book = new Book();
		book.setBookId("ID初期値1");
		book.setBookName("名前無し1");
		model.addAttribute(book);

		final Book book2 = new Book();
		book2.setBookId("ID初期値2");
		book2.setBookName("名前無し2");
		model.addAttribute("book2", book2);

		return "book/edit";
	}

	@GetMapping("/register")
	public String register(Model model) {

		final Book book = new Book();
		book.setBookId("ID初期値3");
		book.setBookName("名前無し3");
		model.addAttribute(book);

		final Book book2 = new Book();
		book2.setBookId("ID初期値4");
		book2.setBookName("名前無し4");
		model.addAttribute("book2", book2);

		return "book/register";
	}
}
