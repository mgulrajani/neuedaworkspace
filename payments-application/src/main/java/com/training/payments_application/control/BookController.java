package com.training.payments_application.control;

import com.training.payments_application.entities.*;
import com.training.payments_application.exceptions.BookNotFoundException;
import com.training.payments_application.services.AuthorService;
import com.training.payments_application.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin
public class BookController {


    @Autowired
    private BookService service;

    @PostMapping
    public ResponseEntity<Book>  addABook(@RequestBody Book book){
        Book newBook = service.addBook(book);
         return new ResponseEntity<>(newBook,HttpStatus.CREATED);


    }

    @GetMapping
    public ResponseEntity<List<Book>>   getAllBook(@RequestParam(value="title",required=false)String  title){
        List<Book> books = service.listAllBooks();

        return new ResponseEntity<>(books,HttpStatus.OK);

    }
    // /api/books/51

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable Long id)  throws BookNotFoundException{




        return new ResponseEntity<>(service.findBook(id),HttpStatus.OK);

    }

  @GetMapping("/titles/{title}")
  public ResponseEntity<List<Book>>   getTitles(@PathVariable String title){
      List<Book> books = service.findTitles(title);


      return new ResponseEntity<>(books,HttpStatus.OK);


  }
//api/books?title=Meluha
@PutMapping("/{id}")
    public ResponseEntity<Book> updateBookk(@PathVariable Long id , @RequestBody Book book) throws BookNotFoundException {

        Book b1 = service.updateBook(id,book);

        return new ResponseEntity<>(b1,HttpStatus.OK);


}

}


