package com.rest.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springboot.entity.Book;
import com.rest.springboot.service.BookService;
@RestController 
@RequestMapping(value="/books")
public class BookController {

	
	@Autowired
	private BookService bookService;
	
	@PostMapping(value="/add")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
	
	@GetMapping(value="/add/{bookId}")
	public Book getBookById(@PathVariable("bookId")Integer bookId){
		return bookService.getBookById(bookId);
	}
	
	@GetMapping(value="/allBooks")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	
	}
	
	@DeleteMapping(value="/delete/{bookId}")
	public void deleteBook(@PathVariable("bookId")Integer bookId){
		bookService.deleteBook(bookId);
	}
	
	@PutMapping(value="/{bookId}/{newBook:.+}")
	public Book updateBook(@PathVariable("bookId")Integer bookId,@PathVariable("newBook")String newBook){
		return bookService.updateBook(bookId,newBook);
	
	}
	}
