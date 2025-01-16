package com.RodriTech.books.dto;

import com.RodriTech.books.entities.User;

import java.util.Date;

public class UserDTO {

    private Long id;
    private String name;
    private Date dateOfBirth;
    private String favoriteBook;
    private String email;
    private String password;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, Date dateOfBirth, String favoriteBook, String email, String password) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.favoriteBook = favoriteBook;
        this.email = email;
        this.password = password;
    }

    public UserDTO (User user){
        id = user.getId();
        name = user.getName();
        dateOfBirth = user.getDateOfBirth();
        favoriteBook = user.getFavoriteBook();
        email = user.getEmail();
        password = user.getPassword();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFavoriteBook() {
        return favoriteBook;
    }

    public void setFavoriteBook(String favoriteBook) {
        this.favoriteBook = favoriteBook;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
