package com.rest.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.springboot.dao.BookRepository;
import com.rest.springboot.entity.Book;
@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}
	
	public Book getBookById(Integer bookId) {
		return bookRepository.findById(bookId).get();
	}
	
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	
	public void deleteBook(Integer bookId) {
		bookRepository.deleteById(bookId);
	}
	
	
	public Book updateBook(Integer bookId, String newBook) {
		Book BookFromDb = bookRepository.findById(bookId).get();
		BookFromDb.setBookName(newBook);
		Book updatedBook = bookRepository.save(BookFromDb);
		return updatedBook;
	}
	
	
}
