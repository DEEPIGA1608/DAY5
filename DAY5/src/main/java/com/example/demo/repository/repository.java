package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Book;


@Repository
public interface repository extends JpaRepository<Book,Integer>{

}
