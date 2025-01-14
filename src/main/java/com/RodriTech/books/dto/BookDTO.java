package com.RodriTech.books.dto;


import com.RodriTech.books.entities.Books;

public class BookDTO {

    private Long id;
    private String name;
    private String nameAuthor;
    private Integer publishYear;
    private Integer numPages;
    private String description;
    private Double price;
    private String imgUrl;

    public BookDTO() {
    }

    public BookDTO(Long id, String name, String nameAuthor, Integer publishYear, Integer numPages, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.nameAuthor = nameAuthor;
        this.publishYear = publishYear;
        this.numPages = numPages;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public BookDTO (Books book){
        id = book.getId();
        name = book.getName();
        nameAuthor = book.getNameAuthor();
        publishYear = book.getPublishYear();
        numPages = book.getNumPages();
        description = book.getDescription();
        price = book.getPrice();
        imgUrl = book.getImgUrl();
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

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
