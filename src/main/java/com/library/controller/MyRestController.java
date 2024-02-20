package com.library.controller;

import com.library.entity.Book;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyRestController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/main")
    public String mainPage(){
        return "main";
    }
    @RequestMapping("/books")
    public String getAllBooks(Model model){
        List<Book> allBooks=bookService.getAllBooks();
        model.addAttribute("listBooks",allBooks);
        return "all_books";
    }

    @RequestMapping("/addBook")
    public String addNewBook(Model model){
        Book book=new Book();
        model.addAttribute("newBook",book);
        return "add_book";
    }
    @PostMapping("/doneView")
    public String doneView(@ModelAttribute("newBook") Book book){
        bookService.addBook(book);
        return "done_view";
    }

    @RequestMapping("/book/{id}")
    public String getBook(@PathVariable("id") int id,Model model){

        model.addAttribute("book",bookService.getBook(id));
        return "book_view";
    }

    @RequestMapping("/booksByName")
    public String getBooksBySearch(@RequestParam("nameBook") String name,Model model){
        List<Book> allBooks=bookService.getBookByName(name);
        model.addAttribute("listBooks",allBooks);
        return "all_books";
    }

    @GetMapping("/signup")
    public String login(){
        return "redirect:/main";
    }
}
