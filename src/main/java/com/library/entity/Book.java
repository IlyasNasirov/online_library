package com.library.entity;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="nameBook")
    private String nameBook;
    @Column(name="author")
    private String author;
    @Column(name="year")
    private int year;
    @Column(name="cost")
    private int cost;

    public Book() {
    }

    public Book(String nameBook, String author, int year, int cost) {
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", cost=" + cost +
                '}';
    }
}
