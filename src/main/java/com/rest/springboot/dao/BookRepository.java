package com.rest.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.springboot.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
