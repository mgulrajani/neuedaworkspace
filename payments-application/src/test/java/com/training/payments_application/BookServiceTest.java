package com.training.payments_application;

import com.training.payments_application.exceptions.BookNotFoundException;
import com.training.payments_application.repo.BookRepo;
import com.training.payments_application.services.BookService;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.training.payments_application.entities.Book;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BookServiceTest {



    @Autowired
    BookService service;

    @MockBean
    BookRepo repo;

    Book b,b1,b2,b3;

    //1.Arrange  the fixtures 2. Act --actually call the method to be tested 3. Assert --

    @BeforeEach
    void setUp(){


        b=new Book(1L,"Homo deus", LocalDate.now().minusYears(2));

        b1=new Book(2L,"The Oath Of Vayuputras", LocalDate.now().minusYears(3));

        b2=new Book(3L,"The Lost Symbol", LocalDate.now().minusYears(5));

        b3=new Book(4L,"The Secret", LocalDate.now().minusYears(2));

        List<Book>  books = Arrays.asList(b,b1,b2,b3);

        Mockito.when(repo.findById(1L)).thenReturn(Optional.of(b));

        Mockito.when(repo.findAll()).thenReturn(books);




    }





    @Test
    public void testFindById() throws BookNotFoundException{

        //2. Act

        Book b2=  service.findBook(1L);

        //3.Assert

        assertEquals("Foundation",b2.getTitle());




    }


    @Test
    public void addBookTest(){
        //1.Arrange
        Mockito.when(repo.save(b)).thenReturn(b);

        //2.Act
        Book newlyAddedBook = service.addBook(b);

        //Assert
        assertEquals(LocalDate.now().minusYears(2),b.getDateOfPublishing());



    }

    @Test
    public void testFindAll(){


        //2.Act

        List<Book> bks = service.listAllBooks();

        //3.Assert

        assertEquals(4,bks.size());

    }

    @Test

    public void testIdNoFound()  {

        Mockito.when(repo.findById(11L)).thenReturn(Optional.empty());


        assertThrows(BookNotFoundException.class,()->service.findBook(11L));



    }

}
