package com.RodriTech.books.controller;

import com.RodriTech.books.dto.BookDTO;
import com.RodriTech.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public ResponseEntity<Page<BookDTO>> searchBooks (Pageable pageable){
        Page<BookDTO> dto = service.searchBooks(pageable);
        return ResponseEntity.ok(dto);
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @PostMapping
    public ResponseEntity<BookDTO> insertBook (@RequestBody BookDTO book){
         book = service.insertBook(book);
        return ResponseEntity.ok(book);
    }
}
