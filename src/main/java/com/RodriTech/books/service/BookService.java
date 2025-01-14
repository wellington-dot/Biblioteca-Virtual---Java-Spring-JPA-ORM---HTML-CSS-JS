package com.RodriTech.books.service;

import com.RodriTech.books.dto.BookDTO;
import com.RodriTech.books.entities.Books;
import com.RodriTech.books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    @Autowired
    private BooksRepository repository;

    public Page<BookDTO> searchBooks(Pageable pageable){
        Page<Books> result = repository.findAll(pageable);

        return result.map(x -> new BookDTO(x));
    }

    public BookDTO insertBook(BookDTO bookDTO) {
        Books book = new Books();
        copyDtoToProduct(book, bookDTO);
        book = repository.save(book);
        return new BookDTO(book);

    }

    private void copyDtoToProduct(Books book, BookDTO bookDTO) {
        book.setName(bookDTO.getName());
        book.setNameAuthor(bookDTO.getNameAuthor());
        book.setPublishYear(bookDTO.getPublishYear());
        book.setNumPages(bookDTO.getNumPages());
        book.setDescription(bookDTO.getDescription());
        book.setPrice(bookDTO.getPrice());
        book.setImgUrl(bookDTO.getImgUrl());
    }
}
