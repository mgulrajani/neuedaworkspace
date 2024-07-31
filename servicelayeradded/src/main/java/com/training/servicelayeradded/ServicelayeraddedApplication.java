package com.training.servicelayeradded;

import com.training.servicelayeradded.entities.Author;
import com.training.servicelayeradded.entities.Book;
import com.training.servicelayeradded.services.AuthorService;
import com.training.servicelayeradded.services.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ServicelayeraddedApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(ServicelayeraddedApplication.class, args);

		BookService service =  context.getBean(BookService.class);
		AuthorService service2 = context.getBean(AuthorService.class);
		Book b1 = new Book("On the Shoulders of the GIant");
		Author a =new Author("Stephen Hawking","step@gmail");
       b1.setAuthor(a);
      a.setBook(b1);

	  Author aa =service2.saveAuthor(a);


	   Book  addedBook = service.addBook(b1);

		List<Book> bookList =  service.listAllBooks();


		System.out.println(bookList);





	}

}
